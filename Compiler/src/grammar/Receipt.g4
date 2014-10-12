
grammar Receipt;

receipt
    : . COST .
    ;

COST
    : CAPITAL_LETTER? '$' DIGIT+ '.' DIGIT DIGIT
    ;

fragment
CAPITAL_LETTER
    : 'A'..'Z'
    ;

fragment
DIGIT
    : ('0'..'9')
    ;

WHITESPACE
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;