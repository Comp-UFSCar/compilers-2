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
    import infrastructure.errorlisteners.*;
    import infrastructure.simbols.*;
}

@members { TableStack stack = new TableStack(); }

programa
    : { stack.push(new SimbolTable("global")); }
      decl_local_global* 'algoritmo' corpo 'fim_algoritmo'
      { stack.pop(); }
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
        if(stack.has($IDENT.getText())) {
            SemanticErrorListener.VariableAlreadyExists($IDENT.getLine(), $IDENT.getText());
	} else {
            stack.top().add($IDENT.getText(), "constante", $tipo_basico.type);
        }
    }
      '=' valor_constante
    | 'tipo' IDENT ':' tipo
    {
        // A type has been consumed:
        // if it has been declared before, logs semantic error.
        // Otherwise, add it to the current simbol table.
        if (stack.has($tipo.type)) {
            SemanticErrorListener.TypeAlreadyExists($IDENT.getLine(), $tipo.type);
        } else if ($tipo.type.toLowerCase().equals("registro")) {
            stack.top().addType($IDENT.getText(), $tipo.innerTable);
        } else {
            stack.top().addType($IDENT.getText().toLowerCase(), "tipo", $tipo.type.toLowerCase());
        }
    }
    ;

variavel
    : IDENT
    {
        // Stores a list of consumed identifiers
        List<String> declared = new ArrayList<>();

        if(stack.top().has($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableAlreadyExists($IDENT.getLine(), $IDENT.getText());
        } else {
           declared.add($IDENT.getText().toLowerCase());
        }
    }
      dimensao (',' IDENT 
    {
        // if any of these were declared already, logs a semantic error.
        if(stack.top().has($IDENT.getText())
           || declared.contains($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableAlreadyExists($IDENT.getLine(), $IDENT.getText());
        } else {
            declared.add($IDENT.getText().toLowerCase());
        }
    }
    dimensao)*
    ':' tipo
    {
        // Add all variables to the nearest simbol table
        for (String current : declared) {
           stack.top().add(current, "variavel", $tipo.type);
        }
    }
    ;

identificador returns [String name, int line]
    : ponteiros_opcionais IDENT { $name = $IDENT.getText(); $line = $IDENT.getLine(); }
      ('.' IDENT { $name += "." + $IDENT.getText(); })* dimensao outros_ident
    ;

ponteiros_opcionais returns [ String pointers ]
    @init { $pointers = ""; }
    : ('^' { $pointers += "^"; } )*
    ;

dimensao returns [ String index ]
    : ('[' exp_aritmetica ']' { $index = $exp_aritmetica.index; })*
    ;

outros_ident returns [ String name ]
    @init { $name = ""; }
    : ('.' identificador { $name += "." + $identificador.name; })?
    ;

tipo returns [ String type, SimbolTable innerTable ]
    : registro       { $type = "registro"; $innerTable = $registro.innerTable;  }
    | tipo_estendido { $type = $tipo_estendido.type;                            }
    ;

tipo_estendido returns [ String type ]
    : ponteiros_opcionais { $type  = $ponteiros_opcionais.pointers; }
      tipo_basico_ident   { $type += $tipo_basico_ident.type;       }
    ;

tipo_basico_ident returns [ String type ]
    : tipo_basico { $type = $tipo_basico.type; }
    | IDENT 
    { //Verificao para ver se existe o tipo especificado
      $type = $IDENT.getText();
      if (!stack.has($IDENT.getText())) {
          SemanticErrorListener.TypeDoesntExist($IDENT.getLine(), $IDENT.getText());
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

registro returns [ SimbolTable innerTable ]
    : 'registro'
      { stack.push(new SimbolTable("registro")); }
      variavel+
      { $innerTable = stack.top(); stack.pop(); }
      'fim_registro'
    ;

declaracao_global
    : 
      'procedimento' IDENT
    {
        stack.push(new SimbolTable("procedimento"));
    }
      '(' parametros_opcional ')'
    {
        stack.subtop().addProcedure($IDENT.getText().toLowerCase(), $parametros_opcional.types);
    }
      declaracoes_locais comandos
    { stack.pop(); }
      'fim_procedimento'

    |
      'funcao' IDENT
    { stack.push(new SimbolTable("funcao")); }
      '(' parametros_opcional '):' tipo_estendido
    {
        // add to the second scope, considering the first one is the function itself
        stack.subtop().addFunction($IDENT.getText().toLowerCase(), $parametros_opcional.types, $tipo_estendido.type);
    }
      declaracoes_locais comandos
      { stack.pop(); }
      'fim_funcao'
    ;

parametros_opcional returns [ List<String> types ]
    : (parametro { $types = $parametro.types; })?
    ;

parametro returns [ List<String> types ]
    @init
    {
        $types = new ArrayList<>();
        List<String> parameters = new ArrayList<>();
    }
    : 'var'? identificador mais_ident ':' tipo_estendido
      
    {
        parameters.add($identificador.name);
        parameters.addAll($mais_ident.identifiers);
      
        for (String parameter : parameters) {
            if(stack.top().has(parameter.toLowerCase())) {
                SemanticErrorListener.VariableAlreadyExists($identificador.line, $identificador.name);
            } else {
                stack.top().add(parameter, "parametro", $tipo_estendido.type);
                $types.add($tipo_estendido.type);
            }
        }
    }
      
      (',' parametro { $types.addAll($parametro.types); })?
    ;

mais_ident returns [List<String> identifiers]
    @init { $identifiers = new ArrayList<>(); }
    : (',' identificador { $identifiers.add($identificador.name); })*
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
        if (!stack.has($identificador.name.toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($identificador.line, $identificador.name);
        }
    }
      mais_ident
    {   //Caso os identificadores nao existam na tabela, mostra o erro
        for (String ident : $mais_ident.identifiers) {
            if (!stack.has(ident.toLowerCase())) {
                SemanticErrorListener.VariableDoesntExist($identificador.line, ident);
            }
        }
    }
      ')'
    | 'escreva' '(' expressao mais_expressao ')'
    | 'se' expressao 'entao' comandos senao_opcional 'fim_se'
    | 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
    | 'para'
      {   //Empilha (Cria) um novo scope para o FOR
          stack.push(new SimbolTable("para"));
      }
      IDENT
      {   // Logs semantic error if variable wasnt found in any of the simbol tables
          if (!stack.has($IDENT.getText().toLowerCase())) {
               SemanticErrorListener.VariableDoesntExist($IDENT.getLine(),$IDENT.getText());
          }
      }
      '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para'
      {   //Desempilha o scope do FOR
          stack.pop();
      }
    | 'enquanto' expressao 'faca' comandos 'fim_enquanto'
    | 'faca' comandos 'ate' expressao
    | '^' IDENT
    {
        // Logs semantic error if variable wasnt found in any of the simbol tables
        if (!stack.has($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.getLine(),$IDENT.getText());
        }

        // Logs semantic error if variable wasnt declared as a pointer
        String type = stack.typeOf($IDENT.getText());
        if (!type.substring(0, 1).equals("^")) {
            SemanticErrorListener.MisuseOfCaretOperator($IDENT.getLine(), $IDENT.getText());
        }

        type = type.substring(1, type.length());
    }
      outros_ident dimensao '<-' expressao
      {
        if (!RelationalMap.CanAttribute(type, $expressao.type)) {
            SemanticErrorListener.AttributionNotAllowed($IDENT.getLine(), "^" + $IDENT.getText());
        }
      }
    | IDENT outros_ident dimensao '<-' expressao
    {
        // Logs semantic error if variable wasnt found in any of the simbol tables
        String fullname = $IDENT.getText() + $outros_ident.name;
        if (!stack.has(fullname)) {
            SemanticErrorListener.VariableDoesntExist($IDENT.getLine(), fullname);
            
        } else if (!RelationalMap.CanAttribute(stack.typeOf($IDENT.getText()), $expressao.type)) {
            String fullName = $IDENT.getText();
            if ($dimensao.index != null) {
                fullName += "[" + $dimensao.index + "]";
            }
            SemanticErrorListener.AttributionNotAllowed($IDENT.getLine(), fullName);
        }
    }
    |
      IDENT    
      { // Logs semantic error if variable wasnt found in any of the simbol tables
        if (!stack.has($IDENT.getText())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.getLine(),$IDENT.getText());
        }
      }
      '(' argumentos_opcional ')'
    | RETORNAR expressao
      {  //A palavra retorne so eh possivel com funcao
         String scope = stack.top().scope();
         if (!scope.equals("funcao")) {
            SemanticErrorListener.ScopeNotAllowed($RETORNAR.line);
         }
      }
    ;

mais_expressao returns [ List<String> types ]
    @init { $types = new ArrayList<>(); }
    : (',' expressao { $types.add($expressao.type); })*
    ;

senao_opcional
    : ('senao' comandos)?
    ;

argumentos_opcional
    : (expressao mais_expressao)?
    ;

selecao
    : (constantes ':' comandos)+
    ;

constantes
    : numero_intervalo (',' constantes)?
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

exp_aritmetica returns [ String type, String index ]
    : termo
    {
        $type = $termo.type;
        $index = $termo.index;
    }
      (('+' | '-') termo
    {
        if (!RelationalMap.CanAdd($type, $termo.type)) {
            $type = null;
        } else if ($termo.type.toLowerCase().equals("real")) {
            $type = "real";
        }
        
        $index = null;
    }
      )*
    ;

termo returns [ String type, String index ]
    : fator { $type = $fator.type; $index = $fator.index; } (('*' | '/')
    {
        if (!RelationalMap.CanMultiply($type, $termo.type)) {
            $type = null;
        } else if ($termo.type.toLowerCase().equals("real")) {
            $type = "real";
        }
        $index = null;
    }
      fator)*
    ;

fator returns [ String type, String index ]
    : parcela { $type = $parcela.type; $index = $parcela.index; }
      ('%' parcela
    {
        if (!RelationalMap.CanMod($type, $parcela.type)) {
            $type = null;
        } else {
            $type = "inteiro";
        }

        $index = null;
    })*
    ;

parcela returns [ String type, String index ]
    : op_unario parcela_unario { $type = $parcela_unario.type; $index = $parcela_unario.index; }
    | '&' IDENT
      {
         if (!stack.has($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.getLine(),$IDENT.getText());
         }
         
         $type = '^' + stack.typeOf($IDENT.getText().toLowerCase());
      }
      outros_ident dimensao
    | CADEIA { $type = "literal"; }
    ;

parcela_unario returns [ String type, String index ]
    : '^' IDENT 
      {
         if (!stack.has($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.getLine(),$IDENT.getText());
         }
         $type = stack.typeOf($IDENT.getText().toLowerCase());
         $type = $type.substring(1, $type.length());
      }
      outros_ident dimensao
    | IDENT 
    {
        if (!stack.has($IDENT.getText().toLowerCase())) {
           SemanticErrorListener.VariableDoesntExist($IDENT.getLine(),$IDENT.getText());
        }
        $type = stack.typeOf($IDENT.getText().toLowerCase());
    }
      outros_ident dimensao
    | IDENT 
      {
         if (!stack.has($IDENT.getText().toLowerCase())) {
            SemanticErrorListener.VariableDoesntExist($IDENT.getLine(),$IDENT.getText());
         }
         $type = stack.typeOf($IDENT.getText().toLowerCase());
      }
      '(' expressao mais_expressao ')'
      {
          List<String> parameters = stack.parametersOf($IDENT.getText());
          List<String> arguments  = $mais_expressao.types;
          arguments.add(0, $expressao.type);
          
          if (!RelationalMap.CanBeUsedAsArgument(parameters, arguments)) {
              SemanticErrorListener.ArgumentIncompatibility($IDENT.getLine(), $IDENT.getText());
          }
      }
    | NUM_INT           { $type = "inteiro"; $index = $NUM_INT.getText();  }
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