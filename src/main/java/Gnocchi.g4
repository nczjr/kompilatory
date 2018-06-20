grammar Gnocchi;

  //Składnia języka

  start
  : functionMain (voidFunctionDeclaration | returningFunctionDeclaration)* EOF
  ;

  identifier
  : IDENT
  ;

  //Budowa funkcji
  functionMain
  : FUNC MAIN OPEN_PARENTHESIS CLOSE_PARENTHESIS body
  ;

  voidFunctionDeclaration
  : FUNC identifier OPEN_PARENTHESIS parameterList? CLOSE_PARENTHESIS body
  ;

  returningFunctionDeclaration
  : FUNC identifier OPEN_PARENTHESIS parameterList? CLOSE_PARENTHESIS functionBody
  ;

  functionCall
  : identifier (value (COMMA value)*)?
  ;

  parameterList
  : identifier (COMMA identifier)*
  ;

  //Ciało funkcji i to co w nim
  functionBody
  : OPEN_BRACKET (expression SEMICOLON)* (RETURN values SEMICOLON) CLOSE_BRACKET
  ;

  body
  : OPEN_BRACKET  (expression SEMICOLON)* CLOSE_BRACKET
  ;

  variableOperations
	: variableDeclaration
	| variableAssigment
	;

  variableDeclaration
  : identifier (ASSIGNMENT value)?
  ;

  variableFunctionAssigment
  : identifier ASSIGNMENT functionCall
  ;

  variableAssigment
  : identifier ASSIGNMENT values
  ;

  values
  : value
  | mathOperation
  | identifier
  ;

  printFunction
  : PRINT OPEN_PARENTHESIS printExpression CLOSE_PARENTHESIS
  ;

  printExpression
  : STRING_VALUE
  | identifier
  | mathOperation
  ;

    ifStatement
    : IF OPEN_PARENTHESIS logicalOperation CLOSE_PARENTHESIS body elsePattern?
    ;

    elsePattern
    : ELSE body
    ;

    iterationStatement
        :   whileCondition
        |   doCondition
        |   forCondition
        ;

    whileCondition
    : WHILE OPEN_PARENTHESIS logicalOperation CLOSE_PARENTHESIS body
    ;

    doCondition
    :  DO body WHILE OPEN_PARENTHESIS logicalOperation CLOSE_PARENTHESIS
    ;


    forCondition
    	: FOR OPEN_PARENTHESIS variableDeclaration SEMICOLON logicalOperation SEMICOLON unaryExpression CLOSE_PARENTHESIS body
    	;

    unaryExpression
        :   identifier INCREMENT
        |   identifier DECREMENT
        ;

  type
  : basicType
  | arrayType
  ;

  basicType
  : INT
  | DOUBLE
  | STRING
  ;

  arrayType
  : OPEN_SQAURE_BRACKET basicType CLOSE_SQARE_BRACKET
  ;

	value
  : INT_VALUE
  | DOUBLE_VALUE
  | STRING_VALUE
  ;

  expression
  : functionCall
  | variableFunctionAssigment
  | variableOperations
  | operation
  | ifStatement
  | iterationStatement
  | printFunction
  ;


  operation
  : logicalOperation
  | mathOperation
  ;

  logicalOperation
  : op logicalOperator op
  ;

  mathOperation
  : op mathOperator op (mathOperator op)*
  ;

  op
  : (identifier | value)
  ;

  mathOperator
  : PLUS
  | MINUS
  | DIVIDE
  | MULTIPLY
  ;

  logicalOperator
  : EQUALS
  | NOT_EQUALS
  | LOWER
  | GREATER
  | LOWER_OR_EQUAL
  | GREATER_OR_EQUAL
  ;

  //Tokeny

  VAR: 'var';
  PRINT: 'print';
  FUNC: 'func';
  RETURN: 'return';
  MAIN: 'main';
	IF: 'if';
	ELSE: 'else';
	FOR: 'for';
	WHILE: 'while';
	DO: 'do';
	INT: 'Int';
  STRING: 'String';
  CHAR: 'Char';
  BOOLEAN: 'Bool';
  DOUBLE: 'Double';
  DOT: '.';

  ASSIGNMENT: '=';
  EQUALS: '==';
  NOT_EQUALS: '!=';
  LOWER: '<';
	GREATER: '>';
  LOWER_OR_EQUAL: '<=';
  GREATER_OR_EQUAL: '>=';
  PLUS: '+';
  MINUS: '-';
 	DIVIDE: '/';
  MULTIPLY: '*';

  SEMICOLON: ';';
  COLON: ':';
  ARROW: '=>';
  COMMA: ',';
  OPEN_BRACKET: '{';
  CLOSE_BRACKET: '}';
  OPEN_PARENTHESIS: '(';
  CLOSE_PARENTHESIS: ')';
  OPEN_SQAURE_BRACKET: '[';
  CLOSE_SQARE_BRACKET: ']';
  INCREMENT: '++';
  DECREMENT: '--';

  IDENT
	:	('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
	;

  //STRING_VALUE: (CHAR_VALUE)+ ;
  STRING_VALUE: '"' ~('"')* '"';
  CHAR_VALUE: [a-zA-Z] ;
   fragment
  DIGIT: '0' .. '9' ;
  INT_VALUE: DIGIT+;
  DOUBLE_VALUE: DIGIT+ DOT DIGIT+ ;
  BOOLEAN_VALUE: 'true' | 'false' ;

  //Pomijane znaki

  Whitespace
    :   [ \t]+
        -> skip
    ;

    Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

    BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

    LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
