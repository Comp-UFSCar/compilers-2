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
    : ('[' arithmetic_expression ']')+
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
    | 'caso' arithmetic_expression 'seja' selection optional_else 'fim_caso'
    | 'para' IDENT '<-' arithmetic_expression 'ate' arithmetic_expression 'faca' comands 'fim_para'
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
    : unary_op INTEGER ('..' unary_op INTEGER)?
    ( ',' constants ) ?
    ;

unary_op
    : ('-')?
    ;

arithmetic_expression
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
    : factor other_factors
    ;

other_terms
    : (add_op term other_terms)?
    ;

factor
    : portion other_portions
    ;

other_factors
    : (op_multiplicacao factor other_factors)?
    ;

portion
    : unary_op unary_portion
    | portion_nao_unario
    ;

unary_portion
    : '^' IDENT other_identifiers size
    | IDENT other_identifiers size
    | IDENT '(' expression more_expression ')'
    | INTEGER
    | REAL
    | '(' expression ')'
    ;

portion_nao_unario
    : '&' IDENT other_identifiers size
    | STRING
    ;

other_portions
    : ('%' portion other_portions)?
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
        | arithmetic_expression (relational_operator arithmetic_expression)?
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
