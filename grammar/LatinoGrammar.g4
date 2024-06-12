grammar LatinoGrammar;


// REGLAS SINTACTICAS
main_program:   substatement;
substatement: print_stat | assign |;

// ASIGNACIÓN -------------------------------------------------------------------------------
assign: ID assignmentOperator expr substatement | ID assignAux expr substatement |;
assignAux: (TKN_COMMA)(ID)(assignAux)(expr)(TKN_COMMA) | TKN_ASSIGN;
assignmentOperator: TKN_DIV_ASSIGN | TKN_MOD_ASSIGN| TKN_PLUS_ASSIGN| TKN_MINUS_ASSIGN| TKN_TIMES_ASSIGN;
assignIncrDecr: TKN_INCREMENT | TKN_DECREMENT;

// IMPRESIÓN -------------------------------------------------------------------------------
print_stat: print_operations TKN_OPENING_PAR print_stat_cont TKN_CLOSING_PAR substatement;
print_stat_cont: expr | print_concat_string;
print_concat_string: STRING print_concat_string_aux| ;
print_concat_string_aux: TKN_CONCAT STRING print_concat_string_aux | ;
print_operations: 'escribir' | 'imprimir' | 'poner';

// EXPRESIONES -----------------------------------------------------------------------------
expr: expBool exprRest;
exprRest: TKN_OR expBool exprRest |;
expBool: expRel expBoolRest;
expBoolRest: TKN_AND expRel expBoolRest |;
opRel: TKN_EQUAL | TKN_GEQ | TKN_GREATER | TKN_LEQ | TKN_LESS | TKN_NEQ;
expRel: (expArit)(opRel)(expArit) | (expArit);
expArit: term (expAritOp term)*;
expAritOp: TKN_PLUS | TKN_MINUS;
term   :  factor (termOp factor)*;
termOp: TKN_TIMES | TKN_DIV | TKN_MOD;
factor :  t_factor(factorOp t_factor)*;
factorOp: TKN_POWER;
t_factor: (expr_factor)(expr_terminals);
expr_terminals: NUM | ID | (TKN_OPENING_PAR)(expr)(TKN_CLOSING_PAR) | STRING;
expr_factor: (TKN_MINUS | TKN_PLUS | TKN_NOT)* ;



// TOKENS
STRING : '"' ( ~["\\] | '\\' . )* '"'
       | '\'' ( ~['\\] | '\\' . )* '\''
       ;
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