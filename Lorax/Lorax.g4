grammar Lorax;

treeAccess: (IDENTIFIER | treeLiteral) treeAccessOps;
treeLiteral: nodeValue '[' (treeChild? ',' treeChild?)? ']';
treeChild: nodeValue | treeLiteral;
nodeValue: INTEGER;

treeAccessOps: treeAccessTraversor* TREE_ACCESS_VALUE?;

treeAccessTraversor:
	TREE_ACCESS_LEFT
	| TREE_ACCESS_RIGHT
	| TREE_ACCESS_PARENT;
IDENTIFIER: ALPHA ('_' | ALPHANUM)+;

INTEGER: DIGIT+;
TREE_ACCESS_LEFT: '/';
TREE_ACCESS_RIGHT: '\\';
TREE_ACCESS_PARENT: '^';
TREE_ACCESS_VALUE: '$';

fragment DIGIT: [0-9];
fragment ALPHA: [a-zA-Z];
fragment ALPHANUM: [a-zA-Z0-9];
