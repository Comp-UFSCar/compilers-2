/**
 * Gramatica da linguagem LA.
 *
 * Grupo:
 * Arieh Cangiani Fabbro
 * Felipe Fantoni
 * Lucas Hauptmann Pereira 
 * Lucas Oliveira David
 */

grammar La;

@members{ //Cria um objeto pilhaDeTabelas 
infrastructure.PilhaDeTabelas pilhaDeTabelas = new infrastructure.PilhaDeTabelas();
}

programa
    : declaracoes 'algoritmo' corpo 'fim_algoritmo'
    ;

declaracoes
    : decl_local_global*
    ;

decl_local_global
    : declaracao_local
    | declaracao_global
    ;

declaracao_local
    : 'declare' variavel
      {
          pilhaDeTabelas.topo().adicionarSimbolo($variavel.nome, "variavel");
      }
    | 'constante' IDENT 
      {
          pilhaDeTabelas.topo().adicionarSimbolo($IDENT.getText(), "constante");
      }
      ':' tipo_basico '=' valor_constante
    | 'tipo' IDENT ':' tipo
    ;

variavel returns [ String nome, int linha, int coluna ]
    : IDENT { $nome = $IDENT.getText(); $linha = $IDENT.line; $coluna = $IDENT.pos; }
      dimensao mais_var ':' tipo
    ;

mais_var
    : (',' IDENT dimensao 
      {
          pilhaDeTabelas.topo().adicionarSimbolo($IDENT.getText(), "variavel");
      }
      mais_var)?
    ;

identificador returns [ String nome, int linha, int coluna ]
    : ponteiros_opcionais IDENT
      { $nome = $IDENT.getText(); $linha = $IDENT.line; $coluna = $IDENT.pos; }
      dimensao outros_ident
    //: ponteiros_opcionais IDENT ('.' IDENT)* dimensao
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

tipo
    : registro
    | tipo_estendido
    ;

tipo_estendido
    : ponteiros_opcionais tipo_basico_ident
    ;

mais_ident
    : (',' identificador mais_ident)?
    ;

mais_variaveis
    : (variavel 
       {
           if (!pilhaDeTabelas.existeSimbolo($variavel.nome)) {
                infrastructure.Mensagens.erroVariavelNaoExiste($variavel.linha,$variavel.coluna,$variavel.nome);
           }
       }
    mais_variaveis)?
    ;

tipo_basico
    : 'literal'
    | 'inteiro'
    | 'real'
    | 'logico'
    ;

tipo_basico_ident
    : tipo_basico
    | IDENT
    ;

valor_constante
    : CADEIA
    | NUM_INT
    | NUM_REAL
    | 'verdadeiro'
    | 'falso'
    ;

registro
    : 'registro' variavel 
      {
          //pilhaDeTabelas.topo().adicionarSimbolo($variavel.nome, "registro");
      }
      mais_variaveis 'fim_registro'
    ;

declaracao_global
    : { pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("global")); }
      'procedimento' IDENT
      {
          pilhaDeTabelas.topo().adicionarSimbolo($IDENT.getText(), "procedimento");
      }
      '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'
      { pilhaDeTabelas.desempilhar(); }
    | { pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("global")); }
      'funcao' IDENT
      {
          pilhaDeTabelas.topo().adicionarSimbolo($IDENT.getText(), "funcao");
      }
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
    : 'leia' '(' identificador mais_ident
      {   //Lanca um erro quando nao encontra a variavel na pilha de tabelas
           if (!pilhaDeTabelas.existeSimbolo($identificador.nome)) {
                infrastructure.Mensagens.erroVariavelNaoExiste($identificador.linha,$identificador.coluna,$identificador.nome);
           }
      }
      ')'
    | 'escreva' '(' expressao mais_expressao ')'
    | 'se' expressao 'entao' comandos senao_opcional 'fim_se'
    | 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
    | 'para'
      {   //Empilha (Cria) um novo escopo para o FOR
          pilhaDeTabelas.empilhar(new infrastructure.TabelaDeSimbolos("para"));
      }
      IDENT 
      {
          pilhaDeTabelas.topo().adicionarSimbolo($IDENT.getText(), "variavel");
      }
      '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para'
      {   //Desempilha o escopo do FOR
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
    : '^' IDENT outros_ident dimensao
    | IDENT outros_ident dimensao
    | IDENT '(' expressao mais_expressao ')'
    | NUM_INT
    | NUM_REAL
    | '(' expressao ')'
    ;

parcela_nao_unario
    : '&' IDENT outros_ident dimensao
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
