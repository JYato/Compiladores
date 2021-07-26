/*
 * Parser Rules
*/
grammar Mini0;

programa: NL* decl decl* EOF;

decl: funcion | globall;

nl: NL;

globall: declvar nl;

funcion: FUNCTION ID PARENIZQ params PARENDER (DOSPUNTOS tipo)? nl bloques END nl*;

bloques: bloque bloques | bloque;

bloque: (declvar nl)* comandos? nl;

params: parametro ( COMA parametro )* | /*vacio*/;

parametro: ID DOSPUNTOS tipo;

tipobase: INT | BOOL | CHAR | STRING;

tipo: tipobase | LLAVIZQ LLAVDER tipo;

var: ID | var LLAVIZQ exp LLAVDER;

declvar: ID DOSPUNTOS tipo;

comandos: comando nl comandos | comando;

comando: cmdif | cmdwhile | cmdasign | cmdreturn | llamada;

cmdif: IF exp nl bloques ( ELSE IF exp nl bloques )* ( ELSE nl bloques )? END;

cmdwhile: WHILE exp nl bloques LOOP;

cmdasign: var IGUAL exp;

llamada: ID PARENIZQ listaexp PARENDER;

listaexp: /*vacio*/ | exp ( COMA exp )*;

cmdreturn: RETURN exp | RETURN ;

exp: LITNUMERAL
    | LITSTRING
    | TRUE
    | FALSE
    | var
    | NEW LLAVIZQ exp LLAVDER tipo
    | PARENIZQ exp PARENDER
    | llamada
    | exp SUMA exp
    | exp RESTA exp
    | exp MULTI exp
    | exp DIV exp
    | exp MAYOR exp
    | exp MENOR exp
    | exp MAYORIGUAL exp
    | exp MENORIGUAL exp
    | exp IGUAL exp
    | exp DIFER exp
    | exp AND exp
    | exp OR exp
    | NOT exp
    | RESTA exp;


/*
 * Lexer Rules
*/
NL: ( '\n' )+;
FUNCTION: 'fun';
LITNUMERAL: ( [0-9]+ | '0x'[0-9a-fA-F]+ );
LITSTRING: '"' ('\\' | '”' | '\t' | '\n' | [a-zA-Z]|[0-9])+ '"';
PARENIZQ: '(';
PARENDER: ')';
DOSPUNTOS: ':';
COMA: ',';
END: 'end';
LLAVIZQ: '[';
LLAVDER: ']';
INT: 'int';
BOOL: 'bool';
CHAR: 'char';
STRING: 'string';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
LOOP: 'loop';
IGUAL: '=';
RETURN: 'return';
TRUE: 'true';
FALSE: 'false';
NEW: 'new';
SUMA: '+';
RESTA: '-';
MULTI: '*';
DIV: '/';
MAYOR: '>';
MENOR: '<';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
DIFER: '<>';
AND: 'and';
OR: 'or';
NOT: 'not';
ID: ([a-zA-Z_]) ([a-zA-Z_]|[0-9])*;
COMENTARIOS: '/*' .*? '*/' -> skip;
COMENTARIO: '//' ~[\r\n]* -> skip;
WS: [ \t\r]+ -> skip;