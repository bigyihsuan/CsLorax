grammar Lorax;

treeAccess: (treeLiteral) treeAccessOps;
treeLiteral: nodeValue '[' treeChildren? ']';
treeChildren: treeChild? ':' treeChild?;
treeChild: nodeValue | treeLiteral;
nodeValue: tuple | primitive;

treeAccessOps: treeAccessTraversor* TREE_ACCESS_VALUE?;
treeAccessTraversor:
	TREE_ACCESS_LEFT
	| TREE_ACCESS_RIGHT
	| TREE_ACCESS_PARENT;

// values
tuple: '<' (primitive (',' primitive)*)? '>';
primitive: T_NULL | T_BOOL | STRING | FLOAT | INTEGER;
T_NULL: 'Null';
T_BOOL: T_TRUE | T_FALSE;
T_TRUE: 'True';
T_FALSE: 'False';
IDENTIFIER: ALPHA ('_' | ALPHANUM)+;
INTEGER: DIGIT+;
FLOAT: DIGIT+ '.' DIGIT+;
STRING: '\'' ANY* '\'';

// symbols
TREE_ACCESS_LEFT: '/';
TREE_ACCESS_RIGHT: '\\';
TREE_ACCESS_PARENT: '^';
TREE_ACCESS_VALUE: '$';

fragment DIGIT: [0-9];
fragment ALPHA: [a-zA-Z];
fragment ALPHANUM: [a-zA-Z0-9];
fragment ANY: ('\\' .) | ~['\n\r\t];

WS: [ \t\r\n]+ -> skip;