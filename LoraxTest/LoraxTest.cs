namespace LoraxTest;

[TestClass]
public class LoraxTests
{
    static List<string> primitives = new List<string>() {
        // int
        "0",
        "1",
        "123",
        "0000123123123",
        "-029387928300003929382783839003",
        // float
        "0.0",
        "1.0",
        "12.3",
        "000012.3123123",
        "-029387928.300003929382783839003",
        // bool
        "True",
        "False",
        // null
        "Null",
        // strings
        "'hello world'",
        "'faks12312!@!@#!@#($%(#*@#@3ldfjkl'",
        "'\\n \\t'",
        @"'/\/\/\'\\\\'"
    };

    static List<string> tuples = new List<string>() {
        "<>", // empty tuple
        "<{0}>", // 1 value
        "<{0},{1}>", // 2 value
        "<{0},{1},{2}>", // 3 value
        "<{0},{1},{2},{3}>", // 4 value
        "<{0},{1},{2},{3},{4}>" // 5 value
    };

    static List<string> tupleAccesses = new List<string>() {
        "@1",
        "@2",
        "@100",
        "@0304",
        "@-9999",
    };

    static List<string> nodeValues = new List<string>() {
        "1",
        "1.0",
        "True",
        "Null",
        "'hello world'",
        "<'a', 'b', 3>",
        "<>"
    };

    static List<string> trees = new List<string>()
    {
        // 1 node
        "{0}[]",
        // 2 nodes
        "{0}[{1}[]:]", // left
        "{0}[:{1}[]]", // right
        // 3 nodes
        "{0}[{1}[{2}[]:]:]", // left only
        "{0}[:{1}[:{2}[]]]", // right only
        "{0}[{1}[:{2}[]]:]", // left-right
        "{0}[:{1}[{2}[]:]]", // right-left
        "{0}[{1}[]:{2}[]]", // balanced
        // 4 nodes
    };

    static List<string> filledTrees = new List<string>() {
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

    static List<string> treeAccesses = new List<string>() {
        "$",
        "/$",
        "\\$",
        "/\\",
        "/^$",
        "\\\\$",
        "\\\\\\",
    };

    [TestMethod]
    public void TestPrimitives()
    {
        foreach (var primitive in primitives)
        {
            ICharStream stream = CharStreams.fromString(primitive);
            ITokenSource lexer = new LoraxLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            LoraxParser parser = new LoraxParser(tokens);
            parser.BuildParseTree = true;
            IParseTree tree = parser.primitive();
            Assert.IsTrue(parser.NumberOfSyntaxErrors <= 0);
        }
    }

    [TestMethod]
    public void TestTuples()
    {
        foreach (var tup in tuples)
        {
            Random rng = new Random();
            var shuffled = primitives.OrderBy(a => rng.Next()).ToArray<string>();
            var filledTuple = string.Format(tup, shuffled.ToArray<string>());
            // Console.WriteLine(filledTuple);
            ICharStream stream = CharStreams.fromString(filledTuple);
            ITokenSource lexer = new LoraxLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            LoraxParser parser = new LoraxParser(tokens);
            parser.BuildParseTree = true;
            IParseTree tree = parser.tuple();
            Assert.IsTrue(parser.NumberOfSyntaxErrors <= 0);
        }
    }

    [TestMethod]
    public void TestTupleAccess()
    {
        foreach (var tup in tuples)
        {
            foreach (var access in tupleAccesses)
            {
                Random rng = new Random();
                var shuffled = primitives.OrderBy(a => rng.Next()).ToArray<string>();
                var filledTuple = string.Format(tup, shuffled.ToArray<string>());
                filledTuple += access;
                ICharStream stream = CharStreams.fromString(filledTuple);
                ITokenSource lexer = new LoraxLexer(stream);
                ITokenStream tokens = new CommonTokenStream(lexer);
                LoraxParser parser = new LoraxParser(tokens);
                parser.BuildParseTree = true;
                IParseTree tree = parser.tupleAccess();
                Assert.IsTrue(parser.NumberOfSyntaxErrors <= 0);
            }
        }
    }

    [TestMethod]
    public void TestTrees()
    {
        Random rng = new Random();
        foreach (var tree in trees)
        {
            var shuffled = nodeValues.OrderBy(a => rng.Next()).ToArray<string>();
            var filledTree = string.Format(tree, shuffled.ToArray<string>());
            // Console.WriteLine(filledTree);
            ICharStream stream = CharStreams.fromString(filledTree);
            ITokenSource lexer = new LoraxLexer(stream);
            ITokenStream tokens = new CommonTokenStream(lexer);
            LoraxParser parser = new LoraxParser(tokens);
            parser.BuildParseTree = true;
            IParseTree _tree = parser.treeLiteral();
            Assert.IsTrue(parser.NumberOfSyntaxErrors <= 0);
        }
    }

    [TestMethod]
    public void TestTreeAccess()
    {
        foreach (var tree in filledTrees)
        {
            foreach (var access in treeAccesses)
            {
                var treeAccess = tree + access;
                // Console.WriteLine(treeAccess);
                ICharStream stream = CharStreams.fromString(treeAccess);
                ITokenSource lexer = new LoraxLexer(stream);
                ITokenStream tokens = new CommonTokenStream(lexer);
                LoraxParser parser = new LoraxParser(tokens);
                parser.BuildParseTree = true;
                IParseTree _tree = parser.treeLiteral();
                Assert.IsTrue(parser.NumberOfSyntaxErrors <= 0);
            }
        }
    }
}