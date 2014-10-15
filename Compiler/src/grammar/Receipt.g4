/**
 * @author ariehfabbro, lucasdavid
 */
grammar Receipt;

@header {
    import json.infrastructure.*;
}

receipt
    returns [JsonStructure e]
    @init      { $e = new JsonStructure("receipt"); }
    : id       { $e.add($id.e);       }
      company  { $e.add($company.e);  }
    ( buyer    { $e.add($buyer.e);    } )?
      date     { $e.add($date.e);     }
    ( products { $e.add($products.e); } )?
    ( tax      { $e.add($tax.e);      } )?
      total    { $e.add($total.e);    }
    ;

id
    returns [JsonElement e]
    : INT { $e = new JsonElement("id", $INT.getText()); }
    ;

company
    returns [JsonStructure e]
    @init     { $e = new JsonStructure("company"); }
    : entity  { $e.add($entity.e);  }
    ( address { $e.add($address.e); }
      HIFEN?
      zipcode { $e.add($zipcode.e); }
      city    { $e.add($city.e);    }
      state   { $e.add($state.e);   }
    )?
    ;

buyer
    returns [JsonStructure e]
    @init     { $e = new JsonStructure("buyer"); }    
    : entity  { $e.add($entity.e);  }
      address { $e.add($address.e); }
      state   { $e.add($state.e);   }
    ;

date
    returns [JsonElement e]
    @init { String t; }
    : KEYWORD_DATE? COLON?
      INT   { t = $INT.getText(); }
    ( SLASH { t += '/'; } )?
      INT   { t += $INT.getText(); }
    ( SLASH { t += '/'; } )?
      INT {
        t += $INT.getText();
        $e = new JsonElement("date", t);
    }
    ;

products
    returns [JsonStructure e]
    @init { $e = new JsonStructure("products"); }
    : (NAME INT? DECIMAL)+
    ;

tax
    returns [JsonElement e]
    : KEYWORD_TAX COLON? DECIMAL { $e = new JsonElement("tax", $DECIMAL.getText()); }
    ;

total
    returns [JsonElement e]
    : KEYWORD_TOTAL? COLON? DECIMAL { $e = new JsonElement("total", $DECIMAL.getText()); }
    ;

entity
    returns [JsonStructure e]
    @init { $e = new JsonStructure("entity"); }
    : NAME IDNUMBER {
        $e
            .add(new JsonElement("id", $IDNUMBER.getText()))
            .add(new JsonElement("name", $NAME.getText()));
    }
    | IDNUMBER NAME {
        $e
            .add(new JsonElement("id", $IDNUMBER.getText()))
            .add(new JsonElement("name", $NAME.getText()));
    }
    ;

address
    returns [JsonElement e]
    : NAME { $e = new JsonElement("address", $NAME.getText()); }
    ;

zipcode
    returns [JsonElement e]
    @init { String t = ""; }
    :(DIGIT { t += $DIGIT.getText(); } )+
      HIFEN?
     (DIGIT { t += $DIGIT.getText(); } )+
     { $e = new JsonElement("zipcode", t); }
    ;

city
    returns [JsonElement e]
    : NAME { $e = new JsonElement("city", $NAME.getText()); }
    ;

state
    returns [JsonElement e]
    @init { String t; }
    : CAPITAL_LETTER { t = $CAPITAL_LETTER.getText(); }
      CAPITAL_LETTER {
        t += $CAPITAL_LETTER.getText();
        $e = new JsonElement("state", t);
    }
    ;

IDNUMBER
    : SSN | CPF | CNPJ
    ;

SSN
    : DIGIT+ HIFEN DIGIT+ HIFEN DIGIT+
    ;

CPF
    : DIGIT+ DOT DIGIT+ DOT DIGIT+ HIFEN DIGIT+
    ;

CNPJ
    : DIGIT+ DOT DIGIT+ DOT DIGIT+ SLASH DIGIT+ HIFEN DIGIT+
    ;

NAME
    : (LETTER | CAPITAL_LETTER)+
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

KEYWORD_DATE
    : 'date'
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
    : '0'..'9'
    ;

WHITESPACE
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;

OTHERWISE
    : .
    ;