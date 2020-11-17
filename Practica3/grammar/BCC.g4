grammar BCC;

prog: fn_decl_list* main_prog;
fn_decl_list: TK_FUNCTION FID TK_DOS_PUNTOS data_type TK_PARENTESIS_IZQUIERDO (parametros=var_decl)? TK_PARENTESIS_DERECHO
              (TK_VAR variables=var_decl TK_PUNTO_Y_COMA)?
              stmt_block;

main_prog   : (TK_VAR var_decl TK_PUNTO_Y_COMA)? stmt* TK_END;
var_decl    : ID TK_DOS_PUNTOS  data_type (TK_COMA ID TK_DOS_PUNTOS data_type)*;
data_type   : TK_BOOL
            | TK_NUM;


stmt_block: TK_CORCHETE_IZQUIERDO stmt+ TK_CORCHETE_DERECHO
          | stmt;

stmt: TK_PRINT lexpr TK_PUNTO_Y_COMA                                                                                                #print
	| TK_INPUT ID TK_PUNTO_Y_COMA                                                                                                   #input
	| TK_WHEN TK_PARENTESIS_IZQUIERDO lexpr TK_PARENTESIS_DERECHO TK_DO stmt_block                                                  #when
	| TK_IF TK_PARENTESIS_IZQUIERDO lexpr TK_PARENTESIS_DERECHO TK_DO stmt_block TK_ELSE stmt_block                                 #if
	| TK_UNLESS TK_PARENTESIS_IZQUIERDO lexpr TK_PARENTESIS_DERECHO TK_DO stmt_block                                                #unless
	| TK_WHILE TK_PARENTESIS_IZQUIERDO lexpr TK_PARENTESIS_DERECHO TK_DO stmt_block                                                 #while
	| TK_RETURN lexpr TK_PUNTO_Y_COMA                                                                                               #return
	| TK_UNTIL TK_PARENTESIS_IZQUIERDO lexpr TK_PARENTESIS_DERECHO TK_DO stmt_block                                                 #until
	| TK_LOOP stmt_block                                                                                                            #loop
	| TK_DO stmt_block TK_WHILE TK_PARENTESIS_IZQUIERDO lexpr TK_PARENTESIS_DERECHO                                                 #doWhile
	| TK_DO stmt_block TK_UNTIL TK_PARENTESIS_IZQUIERDO lexpr TK_PARENTESIS_DERECHO                                                 #doUntil
	| TK_REPEAT NUM TK_DOS_PUNTOS stmt_block                                                                                        #repeat
    | TK_FOR TK_PARENTESIS_IZQUIERDO lexpr TK_PUNTO_Y_COMA lexpr TK_PUNTO_Y_COMA lexpr TK_PARENTESIS_DERECHO TK_DO stmt_block       #for
    | TK_NEXT TK_PUNTO_Y_COMA                                                                                                       #next
    | TK_BREAK TK_PUNTO_Y_COMA                                                                                                      #break
    | ID TK_ASIGNACION lexpr TK_PUNTO_Y_COMA                                                                                        #asignacion
    | ID TK_SUMA_IGUAL lexpr TK_PUNTO_Y_COMA                                                                                        #sumaIgual
    | ID TK_RESTA_IGUAL lexpr TK_PUNTO_Y_COMA                                                                                       #restaIgual
    | ID TK_PRODUCTO_IGUAL lexpr TK_PUNTO_Y_COMA                                                                                    #productoIgual
    | ID TK_DIVISION_IGUAL lexpr TK_PUNTO_Y_COMA                                                                                    #divisionIgual
    | ID TK_MODULO_IGUAL lexpr TK_PUNTO_Y_COMA                                                                                      #moduloIgual
    | ID TK_INCREMENTO TK_PUNTO_Y_COMA                                                                                              #postIncremento
    | ID TK_DECREMENTO TK_PUNTO_Y_COMA                                                                                              #postDecremento
    | TK_INCREMENTO ID TK_PUNTO_Y_COMA                                                                                              #preIncremento
    | TK_DECREMENTO ID TK_PUNTO_Y_COMA                                                                                              #preDecremento
    ;

lexpr: nexpr ( (TK_AND nexpr)* | (TK_OR nexpr)* )?;


nexpr: TK_NOT TK_PARENTESIS_IZQUIERDO lexpr TK_PARENTESIS_DERECHO
     | rexpr;

rexpr: simple_expr ( rexpr_operator  simple_expr)?;
rexpr_operator: (TK_MAYOR | TK_MENOR| TK_IGUAL| TK_DIFERENTE| TK_MAYOR_IGUAL| TK_MENOR_IGUAL);

simple_expr: term ( simple_expr_operator term)*;
simple_expr_operator: (TK_SUMA | TK_RESTA);


term: (initialfactor=factor) (term_operator factor)*;
term_operator: (TK_PRODUCTO | TK_DIVISION | TK_MODULO);


factor: NUM                                                                             #num
      | BOOL                                                                            #bool
      | ID (TK_INCREMENTO | TK_DECREMENTO)                                             #postFactor
      | (TK_INCREMENTO | TK_DECREMENTO) ID                                             #preFactor
      | ID                                                                              #variable
      | TK_PARENTESIS_IZQUIERDO lexpr TK_PARENTESIS_DERECHO                             #parentesisFactor
      | FID TK_PARENTESIS_IZQUIERDO (lexpr (TK_COMA lexpr)*)? TK_PARENTESIS_DERECHO     #llamadoFunct
      ;



TK_BOOL                     :   'bool';
TK_NUM                      :   'num';
TK_COMA                     :   ',';
TK_DOS_PUNTOS               :   ':';
TK_END                      :   'end' ;
TK_PUNTO_Y_COMA             :   ';';
TK_VAR                      :   'var';
TK_FUNCTION                 :   'function';
TK_PARENTESIS_IZQUIERDO     :   '(';
TK_PARENTESIS_DERECHO       :   ')';
TK_CORCHETE_IZQUIERDO       :   '{';
TK_CORCHETE_DERECHO         :   '}';
TK_PRINT                    :   'print';
TK_INPUT                    :   'input';
TK_WHEN                     :   'when';
TK_DO                       :   'do';
TK_IF                       :   'if';
TK_ELSE                     :   'else';
TK_UNLESS                   :   'unless';
TK_WHILE                    :   'while';
TK_RETURN                   :   'return';
TK_UNTIL                    :   'until';
TK_REPEAT                   :   'repeat';
TK_NEXT                     :   'next';
TK_BREAK                    :   'break';
TK_AND                      :   'and';
TK_OR                       :   'or';
TK_LOOP                     :   'loop';
TK_FOR                      :   'for';
TK_NOT                      :   'not';
TK_ASIGNACION               :   ':=';
TK_SUMA_IGUAL               :   '+=';
TK_RESTA_IGUAL              :   '-=';
TK_PRODUCTO_IGUAL           :   '*=';
TK_DIVISION_IGUAL           :   '/=';
TK_MODULO_IGUAL             :   '%=';
TK_INCREMENTO               :   '++';
TK_DECREMENTO               :   '--';
TK_MENOR                    :   '<';
TK_MAYOR                    :   '>';
TK_IGUAL                    :   '==';
TK_DIFERENTE                :   '!=';
TK_MENOR_IGUAL              :   '<=';
TK_MAYOR_IGUAL              :   '>=';
TK_SUMA                     :   '+';
TK_RESTA                    :   '-';
TK_PRODUCTO                 :   '*';
TK_DIVISION                 :   '/';
TK_MODULO                   :   '%';


BOOL            : 'true'
                | 'false';

FID             : '@'[a-zA-Z][a-zA-Z0-9_]*;

ID              : [a-zA-Z_][a-zA-Z0-9_]*;

NUM             : [0-9]+
                | [0-9]+'.'[0-9]+;

COMMENT         : '#' ~[\r\n]* -> skip ;

ESP : [ \t\r\n]+ -> skip ;
