grammar XL;

options {
  language = Java;
}

@header {
  package a.b.c;
}

@lexer::header {
  package a.b.c;
}

program :
  'program' IDENT '='
  (constant | variable)*
  'begin'
  'end' IDENT '.'
  ;
  
constant
  : 'constant' IDENT ':' type ':=' expression ';' {System.out.println("found a constant declaration");}
  ;

variable
  : 'var' IDENT (',' IDENT)* ':' type ';'
  ;
  
type
  : 'Integer' | 'Real'
  ;

expression
  : INTEGER
  ;

INTEGER   : '0'..'9';
IDENT : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS    : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
