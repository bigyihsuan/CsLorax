grammar Lorax;

treeLiteral: nodeValue '[' (treeChild? ',' treeChild?)? ']';
treeChild: nodeValue | treeLiteral;
nodeValue: INTEGER;
INTEGER: DIGIT+;

fragment DIGIT: [0-9];
fragment ALPHA: [a-zA-Z];
fragment ALPHANUM: [a-zA-Z0-0];