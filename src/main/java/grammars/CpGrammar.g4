grammar CpGrammar;
// 141222;
// Терминальные символы.
fragment CHAR : ('A' .. 'Z' | 'a' .. 'z') ; // Буква
fragment DIGIT : ('0' .. '9') ; // Цифра
// Ключевые слова
DOT : '.' ;
COMMA : ',' ;
COLON : ':' ;
SEMICOLON : ';' ;
LB : '(' ;
RB : ')' ;
LP : '{' ;
RP : '}' ;
fragment PLUS : '+' ;
fragment MINUS : '-' ;
fragment MULTIPLY : '*' ;
fragment DIVIDE : '/' ;
//fragment AMP : '&&' ;
//fragment PIPE : '|' ;
//fragment EXCLAMATION : '!' ;
fragment EQ : '==' ;
fragment GT : '>' ;
fragment LT : '<' ;
fragment GE : '>=' ;
fragment LE : '<=' ;
fragment NE : '!=' ;
fragment OR : '|' ;
fragment AND : '&&' ;
fragment NOT : '!' ;
fragment TRUE : 'true' ;
fragment FALSE : 'false' ;
LOGIC_CONST : (TRUE | FALSE) ;
REL_OP : (NE | EQ | LT | LE | GT | GE) ;
SUM_OP : (PLUS | MINUS | OR) ;
MUL_OP : (MULTIPLY | DIVIDE | AND) ;
UNARY : NOT ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
WS : [ \t\n\r] -> skip;
BEGIN_PROGRAM : 'program' ;
END_PROGRAM : 'end.' ;
VAR : 'var' ;
BEGIN : 'begin' ;
END : 'end' ;
INTEGER : 'integer' ;
REAL : 'real' ;
BOOLEAN : 'boolean' ;
READLN : 'readln' ;
WRITELN : 'writeln' ;
IF : 'if' ;
ELSE : 'else' ;
FOR : 'for' ;
TO : 'to' ;
STEP : 'step' ;
NEXT : 'next' ;
WHILE : 'while' ;
DO : 'do' ;

ID : CHAR (CHAR | DIGIT)* ; // Идентификатор

NUMBER : DECIMAL | FLOAT ; // Число

DECIMAL : BIN | OCT | DEC | HEX ; // Целое

fragment BIN_LETTER : ('B' | 'b') ;
fragment BIN_DIGIT : ('0' | '1') ;
BIN : BIN_DIGIT+ BIN_LETTER ; // Двоичное

fragment OCT_LETTER : ('O' | 'o') ;
fragment OCT_DIGIT : ('0' .. '7') ;
OCT : OCT_DIGIT+ OCT_LETTER ; // Восьмиричное

fragment DEC_LETTER : ('D' | 'd') ;
fragment DEC_FIRST_DIGIT : ('1' .. '9') ;
DEC : DEC_FIRST_DIGIT+ DIGIT* DEC_LETTER? ; // Десятичное

fragment HEX_END_LETTER : ('H' | 'h') ;
fragment HEX_LETTER : ('a' .. 'f' | 'A' .. 'F') ;
HEX : DIGIT(DIGIT | HEX_LETTER)+ HEX_END_LETTER ; // Шестнадцатеричное

E : ('E' | 'e') ;
FLOAT_NUMBER : DIGIT+ ;
ORDER : E (PLUS | MINUS)? FLOAT_NUMBER ;
FLOAT : FLOAT_NUMBER ORDER| FLOAT_NUMBER? DOT FLOAT_NUMBER ORDER? ; // Действительное

program : BEGIN_PROGRAM VAR (declaration)* BEGIN (operator SEMICOLON)* END_PROGRAM;
//program : BEGIN_PROGRAM VAR (declaration | operator)* (SEMICOLON declaration | operator)* END_PROGRAM; // программа
idx : ID;
logic : LOGIC_CONST;
declaration : var_type idx (COMMA idx)* SEMICOLON;
//declaration : idx (COMMA idx)* COLON var_type SEMICOLON ; // объявление
var_type : (INTEGER | REAL | BOOLEAN) ; // тип переменных
operator : complex | assign | condition | for_cycle | while_cycle | input | output ; // оператор
complex : BEGIN operator (SEMICOLON operator)* END ; // составной
assign : idx ':=' expression ; // присваивания
condition : IF LB expression RB operator (ELSE operator)? ; // условный
for_cycle : FOR assign TO expression (STEP expression)? operator NEXT ; // фиксированный цикла
while_cycle : WHILE LB expression RB operator ; // условный цикл
input : READLN idx (COMMA idx)* ; // ввод
output : WRITELN expression (COMMA expression)* ; // вывод
expression
    : logic                         #logic_expr
    | idx                           #idx_expr
    | NUMBER                        #number_expr
    | expression REL_OP expression  #rel_expr
    | expression SUM_OP expression  #sum_expr
    | expression MUL_OP expression  #mul_expr
    | UNARY expression              #unary_exrp
    ;
