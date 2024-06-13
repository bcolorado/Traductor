grammar LatinoGrammar;


// REGLAS SINTACTICAS
main_program:   substatement;
substatement: print_stat substatement | assign substatement | built_in_functions substatement | function_stat substatement | conditionals substatement |;

// ASIGNACIÓN -------------------------------------------------------------------------------
assign: ID assignmentOperator expr | ID assignAux expr | ID assignIncrDecr ;
assignAux: (TKN_COMMA)(ID)(assignAux)(expr)(TKN_COMMA) | TKN_ASSIGN;
assignmentOperator: TKN_DIV_ASSIGN | TKN_MOD_ASSIGN| TKN_PLUS_ASSIGN| TKN_MINUS_ASSIGN| TKN_TIMES_ASSIGN;
assignIncrDecr: TKN_INCREMENT | TKN_DECREMENT;

// FUNCIONES BUILT-IN ---------------------------------------------------------------------
built_in_functions:
     incluir_stat | leer_stat | limpiar_stat ;
acadena_stat: 'acadena' TKN_OPENING_PAR expArit TKN_CLOSING_PAR;
incluir_stat: 'incluir' TKN_OPENING_PAR TKN_CLOSING_PAR;
leer_stat: 'leer' TKN_OPENING_PAR TKN_CLOSING_PAR ;
limpiar_stat: 'limpiar' TKN_OPENING_PAR TKN_CLOSING_PAR ;
alogico_stat: 'alogico' TKN_OPENING_PAR expr TKN_CLOSING_PAR;
anumero_stat: 'anumero' TKN_OPENING_PAR expr TKN_CLOSING_PAR;

// IMPRESIÓN -------------------------------------------------------------------------------
print_stat: print_operations TKN_OPENING_PAR print_stat_cont TKN_CLOSING_PAR;
print_stat_cont: expr;
print_operations: 'escribir' | 'imprimir' | 'poner';

// FUNCIONES -------------------------------------------------------------------------------
function_stat: function_op function_name function_pars function_content 'fin';
function_name: ID | ;
function_op: 'funcion' | 'fun';
function_pars: TKN_OPENING_PAR function_args TKN_CLOSING_PAR;
function_args: expr function_args_aux |;
function_args_aux: TKN_COMMA expr function_args_aux | ;
function_ret: function_ret_op expr;
function_ret_op: 'retornar' | 'regresar' | 'ret';
function_content: substatement function_ret;

function_call: ID TKN_OPENING_PAR function_args TKN_CLOSING_PAR;
// ARREGLOS
array: TKN_OPENING_BRA array_content TKN_CLOSING_BRA;
array_content: expr array_content_aux | ;
array_content_aux: TKN_COMMA expr array_content_aux | ;
// CONDICIONALES --------------------------------------------------------------------------
conditionals: if_conditional | swicth_condition;

// IF

if_conditional: 'si' conditional_expr conditional_substatement if_conditional_aux 'fin';
conditional_expr: expr;
conditional_substatement: substatement;
if_conditional_aux: 'osi' conditional_expr conditional_substatement if_conditional_aux
                    | 'sino' conditional_substatement
                    |;


// SWITCH
swicth_condition:
    'elegir' expArit caseBlock 'fin';

caseBlock:
    caseClause+ caseBlock
    | defaultClause
    | otherClause;

caseClause:
    'caso' expr TKN_COLON substatement romperOp;

defaultClause:
    'defecto' TKN_COLON substatement romperOp;

otherClause:
    'otro' TKN_COLON substatement romperOp;



romperOp:
    'romper'
    | ;  // epsilon is represented by an empty alternative



// EXPRESIONES -----------------------------------------------------------------------------
expr: expBool exprRest;
exprRest: TKN_OR expBool exprRest |;
expBool: expRel expBoolRest;
expBoolRest: TKN_AND expRel expBoolRest |;
opRel: TKN_EQUAL | TKN_GEQ | TKN_GREATER | TKN_LEQ | TKN_LESS | TKN_NEQ;
expRel: (exprConcat)(opRel)(exprConcat) | (exprConcat);
exprConcat: expArit (exprConcatOp expArit)*;
exprConcatOp: TKN_CONCAT;
expArit: term (expAritOp term)*;
expAritOp: TKN_PLUS | TKN_MINUS;
term   :  factor (termOp factor)*;
termOp: TKN_TIMES | TKN_DIV | TKN_MOD;
factor :  t_factor(factorOp t_factor)*;
factorOp: TKN_POWER;
t_factor: (expr_factor)(expr_terminals);
expr_terminals: NUM | ID | (TKN_OPENING_PAR)(expr)(TKN_CLOSING_PAR) | STRING |
    anumero_stat | alogico_stat | acadena_stat | array | function_call | function_stat
    'verdadero' | 'falso';
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
COMMENT_LINE: '//' ~[\r\n]* -> skip;
COMMENT_BLOCK: '/*' .*? '*/' -> skip;