grammar oldLorax;

// --- RULES ---
value: simple_value | tree_literal;
simple_value:
	IDENTIFIER	# IdentifierValue
	| primitive	# PrimitiveValue;
tree_literal:
	simple_value LEFT_BRACKET tree_children? RIGHT_BRACKET;
tree_children: tree_child COMMA tree_child;
tree_child: NULL | tree_literal;
tree_access: (IDENTIFIER | tree_literal) tree_child_selector? VALUE?;
tree_child_selector: (LEFT_CHILD | RIGHT_CHILD | PARENT)+;

primitive:
	NULL
	| LITERAL_FLOAT
	| LITERAL_INTEGER
	| LITERAL_STRING
	| LITERAL_BOOLEAN;

WHITESPACE: [ \t\r\n] -> skip;

NULL: 'NULL';
LITERAL_INTEGER: DIGIT+;
LITERAL_FLOAT: LITERAL_INTEGER PERIOD LITERAL_INTEGER;
LITERAL_STRING: DOUBLE_QUOTE .*? DOUBLE_QUOTE;
LITERAL_BOOLEAN: 'true' | 'false';

IDENTIFIER: [a-zA-Z]+;
PERIOD: '.';

LEFT_CHILD: '/';
RIGHT_CHILD: '\\';
PARENT: '^';
VALUE: '$';

LEFT_BRACKET: '[';
RIGHT_BRACKET: ']';
COMMA: ',';
SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';

fragment DIGIT: [0-9];