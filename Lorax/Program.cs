using System;
using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

var trees = new string[] {
    "1[]", // single-node tree
    "1[2,]", // 1 left child
    "1[,3]", // 1 right child
    "1[2,3]", // both children
    "1[2[4,5],]", // recursive tree, left
    "1[,3[6,7]]", // recursive tree, right
    "1[2[4,5],3[6,7]]", // recursive tree, both
};

var treeAccessOps = new string[] {
    "",
    "$",
    "/$",
    "\\$",
    "/\\",
    "/^$",
    "\\\\$",
    "\\\\\\",
};

foreach (var input in trees)
{
    foreach (var op in treeAccessOps)
    {
        // string input = "1[2[],3[]]";
        var str = $"{input}{op}";
        Console.WriteLine($"; {str}");
        ICharStream stream = CharStreams.fromString(str);
        ITokenSource lexer = new LoraxLexer(stream);
        ITokenStream tokens = new CommonTokenStream(lexer);
        LoraxParser parser = new LoraxParser(tokens);
        parser.BuildParseTree = true;
        IParseTree tree = parser.treeAccess();
        Console.WriteLine(Trees.ToStringTree(tree, parser.RuleNames) + "\n");
    }
}