grammar LatinoGrammar;


// REGLAS SINTACTICAS
main_program:   substatement;
substatement: print_stat | asign;
asign: (ID)(assignmentOperator)(expr);
assignmentOperator: TKN_DIV_ASSIGN | TKN_MOD_ASSIGN| TKN_PLUS_ASSIGN| TKN_MINUS_ASSIGN| TKN_TIMES_ASSIGN;
print_stat: (print_operations)(TKN_OPENING_PAR)(expr)(TKN_CLOSING_PAR);
print_operations: 'escribir' | 'imprimir' | 'poner';
expr   :  term ( (TKN_PLUS | TKN_MINUS) term)*;
term   :  factor ( (TKN_TIMES | TKN_DIV | TKN_MOD | TKN_CONCAT) factor)*;
factor :  t_factor((TKN_POWER) t_factor)*;
t_factor: (expr_factor)(expr_terminals);
expr_terminals: NUM | ID | (TKN_OPENING_PAR)(expr)(TKN_CLOSING_PAR);
expr_factor: (TKN_MINUS | TKN_PLUS | TKN_NOT)* ;



// TOKENS
TKN_AND         : '&&';
TKN_OR          : '||';
TKN_CONCAT      : '..';
TKN_PERIOD      : '.';
TKN_COMMA       : ',';
TKN_SEMICOLON   : ';';
TKN_COLON       : ':';
TKN_OPENING_KEY : '{';
TKN_CLOSING_KEY : '}';
TKN_OPENING_BRA : '[';
TKN_CLOSING_BRA : ']';
TKN_OPENING_PAR : '(';
TKN_CLOSING_PAR : ')';
TKN_INCREMENT   : '++';
TKN_DECREMENT   : '--';
TKN_MOD_ASSIGN  : '%=';
TKN_DIV_ASSIGN  : '/=';
TKN_TIMES_ASSIGN: '*=';
TKN_MINUS_ASSIGN: '-=';
TKN_PLUS_ASSIGN : '+=';
TKN_PLUS        : '+';
TKN_MINUS       : '-';
TKN_TIMES       : '*';
TKN_DIV         : '/';
TKN_POWER       : '^';
TKN_MOD         : '%';
TKN_EQUAL       : '==';
TKN_NEQ         : '!=';
TKN_LEQ         : '<=';
TKN_GEQ         : '>=';
TKN_GREATER     : '>';
TKN_LESS        : '<';
TKN_REGEX       : '~=';
TKN_ASSIGN      : '=';
TKN_NOT         : '!';
// REGLAS LEXICAS
NUM        : DIGIT+ ('.' DIGIT+)?;
ID    : [a-zA-Z_][0-9a-zA-Z_]*;

// Fragment rules
fragment DIGIT  : [0-9];
ESPACIO: [ \t\r\n]+ -> skip;