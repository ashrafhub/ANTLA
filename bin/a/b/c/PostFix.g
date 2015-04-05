grammar PostFix;

options {
  language = Java;
}

@header {
  package a.b.c;
}

@lexer::header {
  package a.b.c;
}

expr  
  : term rest
  ;
  
rest
  : '+' term {System.out.print("+");} rest 
  | '-' term {System.out.print("-");} rest 
  | /* epsilon */
  ;
  
term
  : '0' {System.out.print("0");}
  | '1' {System.out.print("1");}
  | '2' {System.out.print("2");}
  | '3' {System.out.print("3");}
  | '4' {System.out.print("4");}
  | '5' {System.out.print("5");}
  | '6' {System.out.print("6");}
  | '7' {System.out.print("7");}
  | '8' {System.out.print("8");}
  | '9' {System.out.print("9");}
  ;
 