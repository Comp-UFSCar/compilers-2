/**
 * @author ariehfabbro, lucasdavid
 */
grammar Receipt;

@header {
    import infrastructure.json.*;
}

receipt
    returns [JsonStructure e]
    @init   { $e = new JsonStructure("receipt"); }
    :
    ( basic { $e.add($basic.e); } )+
    ;

basic
    returns [JsonElement e]
    : id       { $e = $id.e;       }
    | seller   { $e = $seller.e;   }
    | buyer    { $e = $buyer.e;    }
    | date     { $e = $date.e;     }
    | products { $e = $products.e; }
    | tax      { $e = $tax.e;      }
    | total    { $e = $total.e;    }
    ;

id
    returns [JsonElement e]
    : INT { $e = new JsonElement("id", $INT.getText()); }
    ;

seller
    returns [JsonStructure e]
    @init          { $e = new JsonStructure("seller"); }
    : entitySeller { $e.add($entitySeller.e);  }
    ( address      { $e.add($address.e); } )?
    ;

buyer
    returns [JsonStructure e]
    @init         { $e = new JsonStructure("buyer"); }    
    : entityBuyer { $e.add($entityBuyer.e);  }
    ( address     { $e.add($address.e); } )?
    ;

date
    returns [JsonElement e]
    @init { String t; }
    : (KEYWORD_DATE COLON?)?
      INT   { t = $INT.getText(); }
    ( SLASH { t += '/'; } | HIFEN { t += '-'; } )?
      INT   { t += $INT.getText(); }
    ( SLASH { t += '/'; } | HIFEN { t += '-'; } )?
      INT
    {
        t += $INT.getText();
        $e = new JsonElement("date", t);
    }
    ;

products
    returns [JsonStructure e]
    @init {
        $e = new JsonStructure("products");
        int quantity = -1;
    }
    : KEYWORD_PRODUCTS COLON?
      ( NAME
      (
          INT { quantity = Integer.parseInt($INT.getText()); }
      )? DECIMAL
    {
        JsonStructure current = new JsonStructure($NAME.getText());
        
        if (quantity != -1) {
            current.add(new JsonElement("quantity", $INT.getText()));
        }
        
        current.add(new JsonElement("cost", $DECIMAL.getText()));
        $e.add(current);
        quantity = -1;
    } )+
    ;

tax
    returns [JsonElement e]
    : KEYWORD_TAX COLON? DECIMAL { $e = new JsonElement("tax", $DECIMAL.getText()); }
    ;

total
    returns [JsonElement e]
    : KEYWORD_TOTAL COLON? DECIMAL { $e = new JsonElement("total", $DECIMAL.getText()); }
    ;

entityBuyer
    returns [JsonStructure e]
    @init { $e = new JsonStructure("entity"); }
    : KEYWORD_BUYER (NAME IDNUMBER | IDNUMBER NAME)
    {
        $e
            .add(new JsonElement("id", $IDNUMBER.getText()))
            .add(new JsonElement("name", $NAME.getText()));
    }
    ;

entitySeller
    returns [JsonStructure e]
    @init { $e = new JsonStructure("entity"); }
    : KEYWORD_SELLER (NAME IDNUMBER? | IDNUMBER? NAME)
    {
        $e
            .add(new JsonElement("id", $IDNUMBER.getText()))
            .add(new JsonElement("name", $NAME.getText()));
    }
    ;

address
    returns [JsonStructure e]
    @init         { $e = new JsonStructure("address"); }
    : KEYWORD_ADDRESS COLON?
      NAME          { $e.add(new JsonElement("main", $NAME.getText())); }
    (zipcode { $e.add($zipcode.e); } )?
    (
        city    { $e.add($city.e);    }
      ( state   { $e.add($state.e);   } )?
    )?
    ;

zipcode
    returns [JsonElement e]
    @init { String t = ""; }
    : INT { t += $INT.getText(); }
      HIFEN?
      INT { t += $INT.getText(); }
    { $e = new JsonElement("zipcode", t); }
    ;

city
    returns [JsonElement e]
    : NAME { $e = new JsonElement("city", $NAME.getText()); }
    ;

state
    returns [JsonElement e]
    : NAME { $e = new JsonElement("state", $NAME.getText()); }
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

KEYWORD_BUYER
    : 'buyer' | 'comprador'
    ;

KEYWORD_SELLER
    : 'seller' | 'vendedor'
    ;

KEYWORD_ADDRESS
    : 'address' | 'endereco'
    ;

KEYWORD_TAX
    : 'tax' | 'juros'
    ;

KEYWORD_TOTAL
    : 'total'
    ;

KEYWORD_DATE
    : 'date' | 'data'
    ;

KEYWORD_PRODUCTS
    : 'products' | 'produtos'
    ;

COLON
    : ':'
    ;

fragment
UNDERSCORE
    : '_'
    ;

NAME
    : (LETTER | CAPITAL_LETTER | UNDERSCORE)+
      (LETTER | CAPITAL_LETTER | DIGIT | UNDERSCORE)*
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