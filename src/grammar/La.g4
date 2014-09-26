/*
 * Gramatica da linguagem LA.
 *
 * Grupo:
 * Arieh Cangiani Fabbro
 * Felipe Fantoni
 * Lucas Hauptmann Pereira 
 * Lucas Oliveira David
 * Rafael Silveira
 */

grammar La;

@header {
    import infrastructure.*;
    import infrastructure.ErrorListeners.*;
}

@members {
    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
}

programa
    : {
         pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
      }
      declaracoes 
      {
         Gerador.addText("#include <stdio.h>\n#include <stdlib.h>\n\nint main {\n");
      }
      'algoritmo' corpo 'fim_algoritmo'
      { 
         Gerador.addText("return 0;\n}");
         pilhaDeTabelas.desempilhar();
      }
    ;

declaracoes
    : (decl_local_global)*
    ;

decl_local_global
    : declaracao_local
    | declaracao_global
    ;

declaracao_local
    : 'declare' variavel 
    | 'constante' IDENT 
      ':' tipo_basico
    {
        // A constant has been consumed:
        // if it has been declared before, logs semantic error.
        // Otherwise, add it to the current simbol table.
        if(pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableAlreadyExists($IDENT.line, $IDENT.getText());
	} else {
            pilhaDeTabelas.topo().adicionarSimbolo($IDENT.getText(), "constante", $tipo_basico.type);
        }
    }
      '=' valor_constante
    | 'tipo' IDENT ':' tipo
    {
        // A type has been consumed:
        // if it has been declared before, logs semantic error.
        // Otherwise, add it to the current simbol table.
        if (pilhaDeTabelas.existeSimbolo($tipo.type.toLowerCase())) {
            SemanticErrorListener.TypeDoesntExist($IDENT.getLine(), $tipo.type);
        } else {
            pilhaDeTabelas.topo().adicionarSimbolo($tipo.type.toLowerCase(), "tipo", $tipo.type.toLowerCase());
        }
    }
    ;

variavel
    : IDENT
    {
        // Stores a list of consumed identifiers
        List<String> declared = new ArrayList<>();

        if(pilhaDeTabelas.topo().existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableAlreadyExists($IDENT.line, $IDENT.getText());
        } else {
           declared.add($IDENT.getText().toLowerCase());
        }
    }
      dimensao (',' IDENT 
    {
        // if any of these were declared already, logs a semantic error.
        if(pilhaDeTabelas.topo().existeSimbolo($IDENT.getText().toLowerCase())
           || declared.contains($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableAlreadyExists($IDENT.line, $IDENT.getText());
        } else {
            declared.add($IDENT.getText().toLowerCase());
        }
    }
    dimensao)*
    ':' tipo
    {
       for (String current : declared) {
          if ($tipo.type == null) {
             continue;
          } else if ($tipo.type.equals("inteiro"))
             Gerador.addText("int " + current + ";\n");
          else if ($tipo.type.equals("real"))
             Gerador.addText("float " + current + ";\n");
          else if ($tipo.type.equals("literal"))
             Gerador.addText("char " + current + ";\n");
          else if ($tipo.type.equals("logico"))
             Gerador.addText("int " + current + ";\n");
       }
       // Add all variables to the nearest simbol table
       for (String current : declared) {
          pilhaDeTabelas.topo().adicionarSimbolo(current, "variavel", $tipo.type);
       }
    }
    ;

identificador returns [String name, int line]
    : ponteiros_opcionais IDENT { $name = $IDENT.getText(); $line = $IDENT.getLine(); }
      ('.' IDENT)* dimensao outros_ident
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

tipo returns [ String type ]
    : registro       { $type = "registro";               }
    | tipo_estendido { $type = $tipo_estendido.type; }
    ;

tipo_estendido returns [ String type ]
    : ponteiros_opcionais
      tipo_basico_ident { $type = $tipo_basico_ident.type; }
    ;

mais_ident returns [List<String> identifiers]
    : { $identifiers = new ArrayList<>(); }
      (',' identificador { $identifiers.add($identificador.name); })*
    ;

tipo_basico returns [ String type, int linha ]
    : 'literal' { $type = "literal"; }
    | 'inteiro' { $type = "inteiro"; }
    | 'real'    { $type = "real";    }
    | 'logico'  { $type = "logico";  }
    ;

tipo_basico_ident returns [ String type ]
    : tipo_basico { $type = $tipo_basico.type; }
    | IDENT 
    {
      $type = $IDENT.getText();
      if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
          SemanticErrorListener.TypeDoesntExist($IDENT.line, $IDENT.getText());
      }
    }
    ;

valor_constante
    : CADEIA
    | NUM_INT
    | NUM_REAL
    | 'verdadeiro'
    | 'falso'
    ;

registro
    : 'registro' variavel+ 'fim_registro'
    ;

declaracao_global
    : { pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento")); }
      'procedimento' IDENT
      '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'
      { pilhaDeTabelas.desempilhar(); }
    | { pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao")); }
      'funcao' IDENT
      '(' parametros_opcional '):' tipo_estendido declaracoes_locais comandos 'fim_funcao'
      { pilhaDeTabelas.desempilhar(); }
    ;

parametros_opcional
    : (parametro)?
    ;

parametro
    : var_opcional identificador mais_ident ':' tipo_estendido (',' parametro)?
    ;

var_opcional
    : 'var'?
    ;

declaracoes_locais
    : (declaracao_local declaracoes_locais)?
    ;

corpo
    : declaracoes_locais comandos
    ;

comandos
    : (cmd comandos)?
    ;

cmd
    : 'leia' '(' identificador
    {
        if (!pilhaDeTabelas.existeSimbolo($identificador.name.toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($identificador.line, $identificador.name);
        }
    }
      mais_ident
    {
        for (String ident : $mais_ident.identifiers) {
            if (!pilhaDeTabelas.existeSimbolo(ident.toLowerCase())) {
                SemanticErrorListener.VariableDoesntExist($identificador.line, ident);
            }
        }
        
        String variavel = $identificador.name;
        String tipo2 = pilhaDeTabelas.retornaTipo(variavel);
        if (tipo2.equals("inteiro"))
           Gerador.addText("scanf(\"%d\",&"+variavel+");\n");
        else if (tipo2.equals("real"))
           Gerador.addText("scanf(\"%f\",&"+variavel+");\n");
        else if (tipo2.equals("literal"))
           Gerador.addText("scanf(\"%s\",&"+variavel+");\n");
        else if (tipo2.equals("logico"))
           Gerador.addText("scanf(\"%d\",&"+variavel+");\n");
    }
      ')'
    | 'escreva' '(' expressao mais_expressao ')'
      {
         String nome = Gerador.getNome();
         String tipo = Gerador.getTipo();
         if (nome != null && tipo != null)
           if (tipo.equals("inteiro"))
             Gerador.addText("printf(\"%d\"," + nome + ");\n");
           else if (tipo.equals("real"))
             Gerador.addText("printf(\"%f\"," + nome + ");\n");
           else if (tipo.equals("literal"))
             Gerador.addText("printf(\"%s\"," + nome + ");\n");
           else 
             Gerador.addText("vazio;\n");
      }
    | 'se' expressao 'entao' comandos senao_opcional 'fim_se'
    | 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
    | 'para'
      {   //Empilha (Cria) um novo escopo para o FOR
          pilhaDeTabelas.empilhar(new TabelaDeSimbolos("para"));
      }
      IDENT 
      {   // Logs semantic error if variable wasnt found in any of the simbol tables
          if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
               SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
          }
      }
      '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para'
      {   //Desempilha o escopo do FOR
          pilhaDeTabelas.desempilhar();
      }
    | 'enquanto' expressao 'faca' comandos 'fim_enquanto'
    | 'faca' comandos 'ate' expressao
    | '^' IDENT
    {   // Logs semantic error if variable wasnt found in any of the simbol tables
        if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
        }
    }
      outros_ident dimensao '<-' expressao
    | IDENT
    {   // Logs semantic error if variable wasnt found in any of the simbol tables
        if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
        }
    }
      chamada_atribuicao
    | RETORNAR expressao
      {
         String escopo = pilhaDeTabelas.topo().getEscopo();
         if (!escopo.equals("funcao")) {
            SemanticErrorListener.ScopeNotAllowed($RETORNAR.line);
         }
      }
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
    : termo (op_adicao termo)*
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
    : fator (op_multiplicacao fator)*
    ;

fator
    : parcela ('%' parcela)*
    ;

parcela
    :  op_unario parcela_unario
    |  parcela_nao_unario
    ;

parcela_unario
    : '^' IDENT 
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
      }
      outros_ident dimensao
    | IDENT 
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
         Gerador.addTipo(pilhaDeTabelas.retornaTipo($IDENT.getText()));
         Gerador.addNome($IDENT.getText());
      }
      outros_ident dimensao
    | IDENT 
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
      }
      '(' expressao mais_expressao ')'
    | NUM_INT
    | NUM_REAL
    | '(' expressao ')'
    ;

parcela_nao_unario
    : '&' IDENT
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
      }
      outros_ident dimensao
    | CADEIA
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
    : termo_logico
    ;

termo_logico
    : fator_logico
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

RETORNAR
    : 'retorne'
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
    ;

COMENTARIO
    : '{' ~('\n' | '\r' | '}')* '}' {skip();}
    ;

WS
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;