using System;
using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

var trees = new string[] {
    @"False[]",
    @"1[]", // single-node tree
    @"1[02.202[]:]", // 1 left child
    @"1[:<3, 'lol'>[]]", // 1 right child
    @"1[:<3, 'lol'>['Null'[]:7[]]]", // 1 right child
    @"1[02.202[]:<3, 'lol'>[]]", // both children
    @"1[02.202[4[]:False[]]:]]", // recursive tree, left
    @"1[<3, 'lol'>[6[]:7[]]:]", // recursive tree, right
    @"1[02.202[4[]:False[]]:<3, 'lol'>[Null[]:7[]]]", // recursive tree, both
    @"1[02.202[4[]:False[]]:<3, 'lol'>['Null'[]:7[]]]", // recursive tree, both
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
    // foreach (var op in treeAccessOps)
    {
        // var str = $"{input}{op}";
        var str = $"{input}";
        ICharStream stream = CharStreams.fromString(str);
        ITokenSource lexer = new LoraxLexer(stream);
        ITokenStream tokens = new CommonTokenStream(lexer);
        LoraxParser parser = new LoraxParser(tokens);
        parser.BuildParseTree = true;
        Console.WriteLine($"\n{str}");
        IParseTree tree = parser.treeLiteral();
        Console.WriteLine(Trees.ToStringTree(tree, parser.RuleNames) + "\n");
    }
}