/**
 * @author ariehfabbro, lucasdavid
 */
grammar Receipt;

receipt
    : id company buyer? date products tax? total?
    ;

id
    : INT
    ;

entity
    : name identification
    | identification name
    ;

company
    : entity address HIFEN zipcode city state
    ;

buyer
    : entity address state
    ;

address
    : name
    ;

zipcode
    : DIGIT+ HIFEN DIGIT+
    ;

city
    : name
    ;

identification
    : ssn | cpf | cnpj
    ;

ssn
    : DIGIT+ HIFEN DIGIT+ HIFEN DIGIT+
    ;

cpf
    : DIGIT+ DOT DIGIT+ DOT DIGIT+ HIFEN DIGIT+
    ;

cnpj
    : DIGIT+ DOT DIGIT+ DOT DIGIT+ SLASH DIGIT+ HIFEN DIGIT+
    ;

state
    : CAPITAL_LETTER CAPITAL_LETTER
    ;

name
    : (LETTER | CAPITAL_LETTER)+
    ;

date
    : DIGIT DIGIT SLASH DIGIT DIGIT SLASH DIGIT DIGIT
    ;

products
    : (name INT? DECIMAL)
    ;

tax
    : KEYWORD_TAX COLON? DECIMAL
    ;

total
    : KEYWORD_TOTAL? COLON? DECIMAL
    ;

DECIMAL
    : CAPITAL_LETTER? DOLLAR DIGIT+ DOT DIGIT DIGIT
    ;

DOLLAR
    : '$'
    ;

INT
    : DIGIT+
    ;

HIFEN
    : '-'
    ;

DOT
    : '.'
    ;

SLASH
    : '/' 
    ;

KEYWORD_TAX
    : 'tax'
    ;

KEYWORD_TOTAL
    : 'total'
    ;

COLON
    : ':'
    ;

LETTER
    : 'a'..'z'
    ;

CAPITAL_LETTER
    : 'A'..'Z'
    ;

DIGIT
    : [0-9]
    ;

WHITESPACE
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;

OTHERWISE
    : .
    ;