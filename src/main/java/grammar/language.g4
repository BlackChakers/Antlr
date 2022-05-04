grammar language;
language
    :  (stmts)* EOF
    |  stmts* entrypoint EOF;

entrypoint
    : (AT_SIGN START (stmts)+ AT_SIGN STOP);

stmts
    : stmt;

stmt
    : conditional_statement
    | iterative_statement
    | declaration
    | print;

declaration
    : type_definition
    | function_declaration
    | type_reassign;

print
    : PRINT LPAR (expression | stmt)+ RPAR;

//TYPES
type_definition
    : TYPE ID ASSIGN (ID | VALUE | TXT | BOOL);
type_reassign
    : ID ASSIGN (expression | ID | VALUE | TXT | BOOL);
//TYPES

//Function declaration
function_declaration
    : (TYPE | VOID) ID LPAR param+ RPAR LCBRAC (stmt | ID | expression | type_definition)* RCBRAC;
param
    : TYPE ID
    | (COMMA)* TYPE ID;

//Function Declaration
expression
    : expression PLUS expression # Addition
    | expression MINUS expression # Substraktion
    | expression MULTIPLICATION expression # Multiplication
    | expression DIVISION expression # Division
    | expression POWER_OF expression # Power_of
    | ((PLUS | MINUS | MULTIPLICATION | DIVISION)+ LPAR expression+ RPAR) # Paranthesis
    | (PLUS | MINUS | MULTIPLICATION | DIVISION)+ expression #Bigger_expression
    | ID # Variable
    | VALUE # Number;

//CONDITINAL STATEMENT
conditional_statement
    : if_statement
    | break_statement;
if_statement
    : IF LPAR condition RPAR LCBRAC (stmt)+ RCBRAC (ELSE LCBRAC stmt RCBRAC)?;
break_statement
    : BREAK;

//CONDITINAL STATEMENT

// ITERATIVE STATEMENT
iterative_statement
    : for_loop
    | while_loop
    | forever_loop;
for_loop
    : FOR LPAR (stmt) COMMA (condition) COMMA expression LCBRAC (stmt)+ RCBRAC;
while_loop
    : WHILE LPAR (condition) RPAR LCBRAC (stmt)+ RCBRAC;
forever_loop
    : FOREVER LCBRAC (stmt)+ RCBRAC;
// ITERATIVE STATEMENT

//CONDITIONS
condition
    : boolean_expression (OR boolean_expression)*;

boolean_expression
    : (ID | VALUE) GREATHER (ID | VALUE) # GreatherThan
    | (ID | VALUE) LESSER (ID | VALUE) # LesserThan
    | (ID | VALUE) EQUAL (ID | VALUE) # EqualWith
    | (ID | VALUE) GREATHEROREQUAL (ID | VALUE) # GreatherorEqualThan
    | (ID | VALUE) LESSEROREQUAL (ID | VALUE) # LesserorEqualThan
    | (ID | VALUE) ISNOTEQUAL (ID | VALUE) # IsNotEqualWith;

GREATHER
    : '>'
    | 'Greather';
LESSER
    : '<'
    | 'Lesser';
EQUAL
    : '=='
    | 'Equal';
GREATHEROREQUAL
    : '>='
    | 'Greather_or_equal';
LESSEROREQUAL
    : '<='
    | 'Lesser_or_equal';
ISNOTEQUAL
    : '!='
    | 'Is_not_equal';
//CONDITIONS


// TOKENS
PRINT
    : 'print';

BREAK
    : 'break';
IF
    : 'if';
ELSE
    : 'else';
PLUS
    : '+';
MINUS
    : '-';
MULTIPLICATION
    :'*';
DIVISION
    :'/';
POWER_OF
    :'^';
OR
    : '||';
STOP
    : 'stop';
FOR
    : 'for';
WHILE
    : 'while';
FOREVER
    : 'forever';
START
    : 'start';
COMMA
    : ',';
AT_SIGN
    : '@';
VOID
    : 'void';
LPAR
    : '(';
RPAR
    : ')';
LCBRAC
    : '{';
RCBRAC
    : '}';
TYPE
    : INT_TYPE
    | DOUBLE_TYPE
    | TXT_TYPE
    | BOOL_TYPE;

INT_TYPE
    : 'int';
DOUBLE_TYPE
    : 'double';
TXT_TYPE
    : 'txt';
BOOL_TYPE
    : 'bool';
ASSIGN
    : '=';
VALUE
    : INT
    | DOUBLE;
INT
    : [0-9]+;
DOT
    : '.';
DOUBLE
    : [0-9]+ DOT [0-9]+
    ;
TXT
    : [a-z][A-Z]+;

BOOL
    : TRUE | FALSE;

TRUE
    : '1'
    | 'true';
FALSE
    : '0'
    | 'false';
ID
    :[a-z_]?([A-Za-z0-9_])+;

// Whitespace and comments
WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;