using System;
using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Tree;

// var trees = new string[] {
//         "1[2[],3[]]",
//         "1[]",
//         "1[2,NULL]",
//         "1[NULL,3]",
//         "1[2,NULL[3,4]]",
//         "1[NULL[2, 4],3]",
//         "1[2[4, NULL],3[5 , NULL]]",
//         "1[2[NULL, 4],3[NULL , 5]]"
// };

var trees = new string[] {
    "1[]", // single-node tree
    "1[2,]", // 1 left child
    "1[,3]", // 1 right child
    "1[2,3]", // both children
    "1[2[4,5],]", // recursive tree, left
    "1[,3[6,7]]", // recursive tree, right
    "1[2[4,5],3[6,7]]", // recursive tree, both
};

foreach (var input in trees)
{
    // string input = "1[2[],3[]]";
    ICharStream stream = CharStreams.fromString(input);
    ITokenSource lexer = new LoraxLexer(stream);
    ITokenStream tokens = new CommonTokenStream(lexer);
    LoraxParser parser = new LoraxParser(tokens);
    parser.BuildParseTree = true;
    IParseTree tree = parser.treeLiteral();
    Console.WriteLine(Trees.ToStringTree(tree, parser.RuleNames));
    Console.WriteLine();
}