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

program
    : declarations 'algoritmo' body 'fim_algoritmo'
    ;

declarations
    : ( local_declaration | global_declaration ) *
    ;

local_declaration
    : 'declare' variable
    | 'constante' IDENT ':' basic_type '=' const_value
    | 'type' IDENT ':' type
    ;

global_declaration
    : 'procedimento' IDENT '(' optional_params ')' local_declarations comands 'fim_procedimento'
    | 'funcao' IDENT '(' optional_params '):' extended_type local_declarations comands 'fim_funcao'
    ;

type
    : register
    | extended_type
    ;

variable
    : IDENT size (',' IDENT size)* ':' type
    ;

identifier
    : optional_pointers IDENT ('.' IDENT)* size
    ;

extended_type
    : optional_pointers (basic_type | IDENT)
    ;

optional_pointers
    : ('^' optional_pointers)?
    ;
 
other_identifiers
    : ('.' identifier)?
    ;

size
    : ('[' exp_aritmetica ']')+
    ;

basic_type
    : 'literal'
    | 'inteiro'
    | 'real'
    | 'logico'
    ;

const_value
    : STRING
    | INTEGER
    | REAL
    | 'verdadeiro'
    | 'falso'
    ;

register
    : 'register' variable+ 'fim_register'
    ;

optional_params
    : ( parameter ) ?
    ;

parameter
    : var_opcional identifier more_identifier ':' extended_type
    ( ', ' parameter ) ?
    ;

var_opcional
    : 'var'?
    ;

more_identifier
    : (',' identifier)*
    ;

local_declarations
    : local_declaration+
    ;

body
    : local_declarations comands
    ;

comands
    : cmd+
    ;

cmd
    : 'leia' '(' identifier more_identifier ')'
    | 'escreva' '(' expression more_expression ')'
    | 'se' expression 'entao' comands optional_else 'fim_se'
    | 'caso' exp_aritmetica 'seja' selection optional_else 'fim_caso'
    | 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comands 'fim_para'
    | 'enquanto' expression 'faca' comands 'fim_enquanto'
    | 'faca' comands 'ate' expression
    | '^' IDENT other_identifiers size '<-' expression
    | IDENT chamada_atribuicao
    | 'retorne' expression
    ;

more_expression
    : (',' expression more_expression)?
    ;

optional_else
    : ('senao' comands)?
    ;

chamada_atribuicao
    : '(' optional_arguments ')'
    | other_identifiers size '<-' expression
    ;

optional_arguments
    : (expression more_expression)?
    ;

selection
    : (constants ':' comands)+
    ;

constants
    : interval_number mais_constants
    ;

mais_constants
    : (',' constants)?
    ;

interval_number
    : op_unario INTEGER ('..' op_unario INTEGER)?
    ;

op_unario
    : ('-')?
    ;

exp_aritmetica
    : term other_terms
    ;

op_multiplicacao
    : '*'
    | '/'
    ;

add_op
    : '+'
    | '-'
    ;

term
    : factor outros_factores
    ;

other_terms
    : (add_op term other_terms)?
    ;

factor
    : parcela outras_parcelas
    ;

outros_factores
    : (op_multiplicacao factor outros_factores)?
    ;

parcela
    : op_unario parcela_unario
    | parcela_nao_unario
    ;

parcela_unario
    : '^' IDENT other_identifiers size
    | IDENT other_identifiers size
    | IDENT '(' expression more_expression ')'
    | INTEGER
    | REAL
    | '(' expression ')'
    ;

parcela_nao_unario
    : '&' IDENT other_identifiers size
    | STRING
    ;

outras_parcelas
    : ('%' parcela outras_parcelas)?
    ;

relational_operator
    : '='
    | '<>'
    | '>=' 
    | '<=' 
    | '>' 
    | '<'
    ;

expression
    : logical_term ('ou' logical_term)*
    ;

logical_term
    : logical_factor ('e' logical_factor)*
    ;

logical_factor
    : 'nao'?
    (
        'verdadeiro'
        | 'falso'
        | exp_aritmetica (relational_operator exp_aritmetica)?
    )
    ;

IDENT
    : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
    ;

STRING
    : '"' ~('\n' | '\r' | '"')* '"'
    ;

INTEGER
    : ('0'..'9')+
    ;

REAL
    : ('0'..'9')+ '.' ('0'..'9')+
    ;

COMMENT
    : '{' ~('\n' | '\r' | '}')* '}' {skip();}
    ;
WS
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;
