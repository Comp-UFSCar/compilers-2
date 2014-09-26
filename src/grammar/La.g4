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

@members { PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas(); }

programa
    : { pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global")); }
      decl_local_global* 'algoritmo' corpo 'fim_algoritmo'
      { pilhaDeTabelas.desempilhar(); }
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
    | 'constante' IDENT ':' tipo_basico
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

ponteiros_opcionais returns [ String pointers ]
    @init { $pointers = ""; }
    : ('^' { $pointers += "^"; } )*
    ;

dimensao
    : ('[' exp_aritmetica ']' dimensao)?
    ;

outros_ident
    : ('.' identificador)?
    ;

tipo returns [ String type ]
    : registro       { $type = "registro";           }
    | tipo_estendido { $type = $tipo_estendido.type; }
    ;

tipo_estendido returns [ String type ]
    @init { $type = ""; }
    : ponteiros_opcionais { $type += $ponteiros_opcionais.pointers; }
      tipo_basico_ident   { $type += $tipo_basico_ident.type;         }
    ;

mais_ident returns [List<String> identifiers]
    : { $identifiers = new ArrayList<>(); }
      (',' identificador { $identifiers.add($identificador.name); })*
    ;

tipo_basico_ident returns [ String type ]
    : tipo_basico { $type = $tipo_basico.type; }
    | IDENT 
    { //Verificao para ver se existe o tipo especificado
      $type = $IDENT.getText();
      if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
          SemanticErrorListener.TypeDoesntExist($IDENT.line, $IDENT.getText());
      }
    }
    ;

tipo_basico returns [ String type, int linha ]
    : 'literal' { $type = "literal"; }
    | 'inteiro' { $type = "inteiro"; }
    | 'real'    { $type = "real";    }
    | 'logico'  { $type = "logico";  }
    ;

valor_constante
    : CADEIA
    | NUM_INT
    | NUM_REAL
    | 'verdadeiro'
    | 'falso'
    ;

registro returns [ TabelaDeSimbolos tabela ]
    : 'registro'
      { pilhaDeTabelas.empilhar(new TabelaDeSimbolos("registro")); }
      variavel+
      { $tabela = pilhaDeTabelas.topo(); pilhaDeTabelas.desempilhar(); }
      'fim_registro'
    ;

declaracao_global
    : { pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento")); }
      'procedimento' IDENT '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'
      { pilhaDeTabelas.desempilhar(); }
    | { pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao")); }
      'funcao' IDENT '(' parametros_opcional '):' tipo_estendido declaracoes_locais comandos 'fim_funcao'
      { pilhaDeTabelas.desempilhar(); }
    ;

parametros_opcional
    : (parametro)?
    ;

parametro
    : 'var'? identificador mais_ident ':' tipo_estendido (',' parametro)?
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
    : 'leia' '(' identificador
    {   //Caso o identificador nao exista na tabela, mostra o erro
        if (!pilhaDeTabelas.existeSimbolo($identificador.name.toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($identificador.line, $identificador.name);
        }
    }
      mais_ident
    {   //Caso os identificadores nao existam na tabela, mostra o erro
        for (String ident : $mais_ident.identifiers) {
            if (!pilhaDeTabelas.existeSimbolo(ident.toLowerCase())) {
                SemanticErrorListener.VariableDoesntExist($identificador.line, ident);
            }
        }
    }
      ')'
    | 'escreva' '(' expressao mais_expressao ')'
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

        // Logs semantic error if variable wasnt declared as a pointer
        String type = pilhaDeTabelas.retornaTipo($IDENT.getText());
        if (!type.substring(0, 1).equals("^")) {
            SemanticErrorListener.MisuseOfCaretOperator($IDENT.line, $IDENT.getText());
        }
        type = type.substring(1, type.length());
    }
      outros_ident dimensao '<-' expressao
      {
        if (!RelationalMap.CanAttribute(type, $expressao.type)) {
            SemanticErrorListener.AttributionNotAllowed($IDENT.getLine(), "^" + $IDENT.getText());
        }
      }
    |
      IDENT
    
      {   // Logs semantic error if variable wasnt found in any of the simbol tables
        if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
        }
      }
      '(' argumentos_opcional ')'
    | IDENT outros_ident dimensao '<-' expressao
      {
        if (!RelationalMap.CanAttribute(pilhaDeTabelas.retornaTipo($IDENT.getText()), $expressao.type)) {
            SemanticErrorListener.AttributionNotAllowed($IDENT.getLine(), $IDENT.getText());
        }
      }
    | RETORNAR expressao
      {  //A palavra retorne so eh possivel com funcao
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

chamada_atribuicao returns [ String $type ]
    : 
    ;

argumentos_opcional
    : (expressao mais_expressao)?
    ;

selecao
    : (constantes ':' comandos)+
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

exp_aritmetica returns [ String type ]
    : termo { $type = $termo.type; }
      (('+' | '-') termo
    {
        if (!RelationalMap.CanAdd($type, $termo.type)) {
            $type = null;
        } else if ($termo.type.toLowerCase().equals("real")) {
            $type = "real";
        }
    }
      )*
    ;

termo returns [ String type ]
    : fator { $type = $fator.type; } (('*' | '/')
    {
        if (!RelationalMap.CanMultiply($type, $termo.type)) {
            $type = null;
        } else if ($termo.type.toLowerCase().equals("real")) {
            $type = "real";
        }
    }
      fator)*
    ;

fator returns [ String type ]
    : parcela { $type = $parcela.type; } ('%' parcela
    {
        if (!RelationalMap.CanMod($type, $parcela.type)) {
            $type = null;
        } else {
            $type = "inteiro";
        }
    })*
    ;

parcela returns [ String type ]
    : op_unario parcela_unario { $type = $parcela_unario.type; }
    | '&' IDENT
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
         
         $type = '^' + pilhaDeTabelas.retornaTipo($IDENT.getText().toLowerCase());
      }
      outros_ident dimensao
    | CADEIA { $type = "literal"; }
    ;

parcela_unario returns [ String type ]
    : '^' IDENT 
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
         $type = pilhaDeTabelas.retornaTipo($IDENT.getText().toLowerCase());
         $type = $type.substring(1, $type.length());
      }
      outros_ident dimensao
    | IDENT 
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
         $type = pilhaDeTabelas.retornaTipo($IDENT.getText().toLowerCase());
      }
      outros_ident dimensao
    | IDENT 
      {
         if (!pilhaDeTabelas.existeSimbolo($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.line,$IDENT.getText());
         }
         $type = pilhaDeTabelas.retornaTipo($IDENT.getText().toLowerCase());
      }
      '(' expressao mais_expressao ')'
    | NUM_INT           { $type = "inteiro";       }
    | NUM_REAL          { $type = "real";          }
    | '(' expressao ')' { $type = $expressao.type; }
    ;

op_relacional
    : '='
    | '<>'
    | '>=' 
    | '<=' 
    | '>' 
    | '<'
    ;

expressao returns [ String type ]
    : termo_logico { $type = $termo_logico.type; }
      ('ou' termo_logico
    {
        $type
            = RelationalMap.CanLogic($type, $termo_logico.type)
            ? "logico"
            : null
            ;
    }
      )*
    ;

termo_logico returns [ String type ]
    : fator_logico { $type = $fator_logico.type; }
      ('e' fator_logico
    {
        $type
            = RelationalMap.CanLogic($type, $fator_logico.type)
            ? "logico"
            : null
            ;
    }
      )*
    ;

fator_logico returns [ String type ]
    : op_nao parcela_logica
    {
        if (!$op_nao.happens || ($parcela_logica.type != null && $parcela_logica.type.equals("logico"))) {
            $type = $parcela_logica.type;
        }
    }
    ;

op_nao returns [ boolean happens ]
    : ('nao' { $happens = true; })?
    ;

parcela_logica returns [ String type ]
    : 'verdadeiro'   { $type = "logico"; }
    | 'falso'        { $type = "logico"; }
    | exp_relacional { $type = $exp_relacional.type; }
    ;

exp_relacional returns [ String type ]
    : exp_aritmetica { $type = $exp_aritmetica.type; }
      (op_relacional exp_aritmetica
    {
        $type = RelationalMap.CanBeArithmeticallyCompared($type, $exp_aritmetica.type)
              ? "logico"
              : null
              ;
    }
      )?
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