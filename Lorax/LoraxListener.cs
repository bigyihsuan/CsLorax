//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.10.1
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Lorax.g4 by ANTLR 4.10.1

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="LoraxParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.10.1")]
[System.CLSCompliant(false)]
public interface ILoraxListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="LoraxParser.treeLiteral"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTreeLiteral([NotNull] LoraxParser.TreeLiteralContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LoraxParser.treeLiteral"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTreeLiteral([NotNull] LoraxParser.TreeLiteralContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LoraxParser.treeChild"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTreeChild([NotNull] LoraxParser.TreeChildContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LoraxParser.treeChild"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTreeChild([NotNull] LoraxParser.TreeChildContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LoraxParser.nodeValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterNodeValue([NotNull] LoraxParser.NodeValueContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LoraxParser.nodeValue"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitNodeValue([NotNull] LoraxParser.NodeValueContext context);
}
