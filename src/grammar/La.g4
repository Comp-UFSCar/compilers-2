/*
 * Gramatica da linguagem LA.
 *
 * Grupo:
 * Arieh Cangiani Fabbro
 * Felipe Fantoni
 * Lucas Hauptmann Pereira 
 * Lucas Oliveira David
*/

grammar La;

@members {
    // Inicia a pilha de tabelas, responsavel por
    // conter as relacoes semanticas dos blocos estruturados
    infrastructure.PilhaDeTabelas pilhaDeTabelas = new infrastructure.PilhaDeTabelas();
}

programa
    : { pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("global")); }
      declaracoes 'algoritmo' corpo 'fim_algoritmo'
      { pilhaDeTabelas.desempilhar(); }
    ;

declaracoes
    : (declaracao_local | declaracao_global)*
    ;

declaracao_local
    : 'declare' variavel
    | 'constante' IDENT
      ':' tipo_basico
      {
          if (pilhaDeTabelas.topo().existeSimbolo($IDENT.getText().toLowerCase())) {
              infrastructure.ErrorListeners.SemanticErrorListener.VariableAlreadyExists($IDENT.line, $IDENT.getText());
          } else {
              pilhaDeTabelas.topo().adicionarSimbolo($IDENT.getText().toLowerCase(), "constante", $tipo_basico.nomeTipo);
          }
      }
      '=' valor_constante
    | 'tipo' IDENT ':' tipo
    {
        if (pilhaDeTabelas.topo().existeSimbolo($IDENT.getText().toLowerCase())) {
            infrastructure.ErrorListeners.SemanticErrorListener.VariableAlreadyExists($IDENT.line, $IDENT.getText());
        } else {
            pilhaDeTabelas.topo().adicionarSimbolo($IDENT.getText().toLowerCase(), "constante", $tipo.nomeTipo);
        }
    }
    ;

declaracao_global
    : { pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("procedimento")); }
      'procedimento' IDENT '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'
      { pilhaDeTabelas.desempilhar(); }

    | { pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("funcao")); }
      'funcao' IDENT
      '(' parametros_opcional '):' tipo_estendido declaracoes_locais comandos 'fim_funcao'
      { pilhaDeTabelas.desempilhar(); }
    ;

variavel
    : IDENT
    {
        List<String> declared = new ArrayList<>();
        String current = $IDENT.getText().toLowerCase();

        if (declared.contains(current)) {
            infrastructure.ErrorListeners.SemanticErrorListener.VariableAlreadyExists($IDENT.line, current);
        } else {
            declared.add(current);
        }
    }
    dimensao (',' IDENT
    {
        current = $IDENT.getText().toLowerCase();
        if(declared.contains(current)) {
           infrastructure.ErrorListeners.SemanticErrorListener.VariableAlreadyExists($IDENT.line, current);
        } else {
            declared.add(current);
        }
    }
    dimensao)*
    ':' tipo
    {
       for (String el : declared) {
          pilhaDeTabelas.topo().adicionarSimbolo(el, "variavel", $tipo.nomeTipo);
       }
    }
    ;

identificador returns [ String ident, int line ]
    : ponteiros_opcionais IDENT { $ident = $IDENT.getText(); $line = $IDENT.line; }
    (
        '.' IDENT               { $ident += "." + $IDENT.getText(); }
    )*
    dimensao outros_ident
    ;

ponteiros_opcionais
    : '^'*
    ;
 
outros_ident
    : ('.' identificador)?
    ;

dimensao
    : ('[' exp_aritmetica ']' dimensao)?
    ;

tipo returns [ String nomeTipo ]
    : registro       { $nomeTipo = "registro";               }
    | tipo_estendido { $nomeTipo = $tipo_estendido.nomeTipo; }
    ;

tipo_estendido returns [ String nomeTipo ]
    : ponteiros_opcionais tipo_basico_ident { $nomeTipo = $tipo_basico_ident.nomeTipo; }
    ;

mais_ident returns [ List<String> identifiers ]
    : { $identifiers = new ArrayList<>(); }
    ( ',' identificador { $identifiers.add($identificador.ident); } )*
    ;

tipo_basico returns [ String nomeTipo, int linha ]
    : 'literal' { $nomeTipo = "literal"; }
    | 'inteiro' { $nomeTipo = "inteiro"; }
    | 'real'    { $nomeTipo = "real";    }
    | 'logico'  { $nomeTipo = "logico";  }
    ;

tipo_basico_ident returns [ String nomeTipo ]
    : tipo_basico { $nomeTipo = $tipo_basico.nomeTipo; }
    | IDENT { $nomeTipo = $IDENT.getText(); }
    ;

valor_constante
    : CADEIA
    | NUM_INT
    | NUM_REAL
    | 'verdadeiro'
    | 'falso'
    ;

registro
    : 'registro' variavel* 'fim_registro'
    ;

parametros_opcional
    : parametro?
    ;

parametro
    : 'var'? identificador
      {
          List<String> parameters = new ArrayList<>();
          parameters.add($identificador.ident);
      }
      mais_ident { parameters.addAll($mais_ident.identifiers); }
      ':' tipo_estendido
      {
          for (String param : parameters) {
              if (pilhaDeTabelas.topo().existeSimbolo(param.toLowerCase())) {
                  infrastructure.ErrorListeners.SemanticErrorListener.VariableAlreadyExists($identificador.line, param.toLowerCase());
              } else {
                  pilhaDeTabelas.topo().adicionarSimbolo(param.toLowerCase(), "parametro", $tipo_estendido.nomeTipo);
              }
          }
      }
    (',' parametro)?
    ;

declaracoes_locais
    : (declaracao_local declaracoes_locais)?
    ;

corpo
    : declaracoes_locais comandos
    ;

comandos
    : cmd*
    ;

cmd
    : 'leia' '('
      identificador
      {
          if (!pilhaDeTabelas.existeSimbolo($identificador.ident.toLowerCase())) {
              infrastructure.ErrorListeners.SemanticErrorListener.VariableDoesntExist($identificador.line, $identificador.ident);
          }
      }
      mais_ident
      {
          for (String ident : $mais_ident.identifiers) {
              if (!pilhaDeTabelas.existeSimbolo(ident.toLowerCase())) {
                  infrastructure.ErrorListeners.SemanticErrorListener.VariableDoesntExist($identificador.line, ident);
              }
          }
      }
      ')'
    | 'escreva' '(' expressao mais_expressao ')'
    | 'se' expressao 'entao' comandos senao_opcional 'fim_se'
    | 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
    | 'para'
      {
          pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("para"));
      }
      IDENT
      {
          pilhaDeTabelas.topo().adicionarSimbolo($IDENT.getText().toLowerCase(), "variavel", "NUM_INT");
      }
      '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para'
      {
          pilhaDeTabelas.desempilhar();
      }
    | 'enquanto' expressao 'faca' comandos 'fim_enquanto'
    | 'faca' comandos 'ate' expressao
    | '^' IDENT outros_ident dimensao '<-' expressao
    | IDENT chamada_atribuicao
    | 'retorne' expressao
    ;

mais_expressao
    : (',' expressao mais_expressao)?
    ;

senao_opcional
    : ('senao' comandos)?
    ;

chamada_atribuicao
    : '(' argumentos_opcional ')'
    | outros_ident dimensao '<-' expressao
    ;

argumentos_opcional
    : (expressao mais_expressao)?
    ;

selecao
    : constantes ':' comandos mais_selecao
    ;

mais_selecao
    : (selecao)?
    ;

constantes
    : numero_intervalo mais_constantes
    ;

mais_constantes
    : (',' constantes)?
    ;
numero_intervalo
    : op_unario NUM_INT intervalo_opcional
    ;

intervalo_opcional
    : ('..' op_unario NUM_INT)?
    ;

op_unario
    : '-'?
    ;

exp_aritmetica
    : termo outros_termos
    ;

op_multiplicacao
    : '*'
    | '/'
    ;

op_adicao
    : '+'
    | '-'
    ;

termo
    : fator outros_fatores
    ;

outros_termos
    : (op_adicao termo outros_termos)?
    ;

fator
    : parcela outras_parcelas
    ;

outros_fatores
    : (op_multiplicacao fator outros_fatores)?
    ;

parcela
    : op_unario parcela_unario
    | parcela_nao_unario
    ;

parcela_unario
    : '^' IDENT 
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            infrastructure.ErrorListeners.SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
      }
      outros_ident dimensao
    | IDENT 
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            infrastructure.ErrorListeners.SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
      }
      outros_ident dimensao
    | IDENT '(' expressao mais_expressao ')'
    | NUM_INT
    | NUM_REAL
    | '(' expressao ')'
    ;

parcela_nao_unario
    : '&' IDENT
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            infrastructure.ErrorListeners.SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
      }
      outros_ident dimensao
    | CADEIA
    ;

outras_parcelas
    : ('%' parcela outras_parcelas)?
    ;

op_opcional
    : (op_relacional exp_aritmetica)?
    ;

op_relacional
    : '='
    | '<>'
    | '>=' 
    | '<=' 
    | '>' 
    | '<'
    ;

expressao
    : termo_logico outros_termos_logicos
    ;

outros_termos_logicos
    : ('ou' termo_logico outros_termos_logicos)?
    ;

termo_logico
    : fator_logico outros_fatores_logicos
    ;

outros_fatores_logicos
    : ('e' fator_logico outros_fatores_logicos)?
    ;

fator_logico
    : op_nao parcela_logica
    ;

op_nao
    : ('nao')?
    ;

parcela_logica 
    : 'verdadeiro'
    | 'falso'
    | exp_relacional
    ;

exp_relacional
    : exp_aritmetica op_opcional
    ;

IDENT
    : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
    ;

CADEIA
    : '"' ~('\n' | '\r' | '"')* '"'
    ;

NUM_INT
    : ('0'..'9')+
    ;

NUM_REAL
    : ('0'..'9')+ '.' ('0'..'9')+
    // | '.' ('0'..'9')+
    ;

COMENTARIO
    : '{' ~('\n' | '\r' | '}')* '}' {skip();}
    ;

WS
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;