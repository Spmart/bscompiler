grammar Gram;

//КЛЮЧЕВЫЕ СЛОВА


//Логические константы
FALSE : 'false';
TRUE : 'true';
//Условный оператор
IF : 'if';
THEN : 'then';
ELSE : 'else';
//Условный цикл
WHILE : 'while';
//Счетный цикл
FOR: 'for';
TO: 'to';
STEP: 'step';
NEXT: 'next';
//Логическое не
NOT : '~';
//Операторы ввода вывода
WRITE: 'writeln';
READ: 'readln';
//Операции группы сложения
ADD: 'plus';
MIN: 'min';
OR: 'or';
//Операции группы умножения
MULT: 'mult';
DIV: 'div';
AND: 'and';
//Операторы отношений
EQ: 'eq';
NE: 'ne';
LT: 'lt';
GT: 'gt';
GE: 'ge';
LE: 'le';
//ОПЕРАТОРЫ BEGIN и END
BEGIN:'begin';
END:'end';

//ТИПЫ
BOOL: '!';
REAL: '$';
INT: '%';

//РАЗДЕЛИТЕЛИ
LBRACE: '{';
RBRACE: '}';
LBRACKET: '(';
RBRACKET: ')';
ASSIGN: ':=';
SEMILICON: ';';
COLON: ':';
COMMA: ',';


//311311

VAR: CHAR (CHAR|DIGIT)*;
DECIMAL: BIN | OCT | DEC | HEX;
BIN: ('0'..'1')+ ('b'|'B');
OCT: ('0'..'7')+ 'o'|'O';
DEC: DIGIT+('d'|'D')?;
HEX: (DIGIT|HEX_ALPH)+ 'h'|'H';
FLT: DIGIT+ ORDER | DIGIT* '.' DIGIT+ ORDER?;
ORDER: ('E'|'e') ('+'|'-')? DIGIT+;
CHAR:'a'..'z' | 'A'..'Z';
DIGIT: '0'..'9';
HEX_ALPH: 'a'..'f'| 'A'..'F';

//ПРОПУСК
WS: NEW_LINE RETURN ->skip;
NEW_LINE: '\n' ->skip;
RETURN : '\r' ->skip;
TAB : '\t' ->skip;
SPACE : ' ' ->skip;
COMMENT : '/*' (.)*? '*/' ->skip;

//ОПИСАНИЕ ПРАВИЛ
program: LBRACE (declaration|operator)* RBRACE;
//type:(INT|REAL|BOOL);
declaration: VAR (COMMA VAR)* COLON type=(INT|REAL|BOOL) SEMILICON;
operator: (composite | assign SEMILICON| condition | lim_cycle | condition_cycle | input | output);
composite: BEGIN  operator (SEMILICON? operator)* END;
assign: VAR ASSIGN expression;
condition: IF LBRACKET expression RBRACKET operator (ELSE operator)?;
lim_cycle: FOR assign TO expression (STEP expression)? operator NEXT;
condition_cycle: WHILE LBRACKET expression RBRACKET operator;
input: READ VAR (COMMA VAR)*;
output: WRITE expression (COMMA expression)*;
log_const: TRUE | FALSE;
rel_operations: NE | EQ | LT | LE | GT | GE;
sum_operations: ADD | MIN | OR;
mul_operations: MULT | DIV | AND;
expression: operand (rel_operations operand)* #Expr;
operand: term (sum_operations term)* #Opr;
term: multiplier (mul_operations multiplier)* #Summand;
number:  FLT | DECIMAL;
multiplier: VAR
        | number
        | log_const
        | NOT multiplier
         | '('expression')';






