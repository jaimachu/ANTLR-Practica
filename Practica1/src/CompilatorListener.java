// Generated from Compilator.g4 by ANTLR 4.12.0

    import java.util.HashMap;
    import java.io.File;
    import java.io.FileWriter;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilatorParser}.
 */
public interface CompilatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CompilatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CompilatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(CompilatorParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(CompilatorParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(CompilatorParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(CompilatorParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#ctedef}.
	 * @param ctx the parse tree
	 */
	void enterCtedef(CompilatorParser.CtedefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#ctedef}.
	 * @param ctx the parse tree
	 */
	void exitCtedef(CompilatorParser.CtedefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(CompilatorParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(CompilatorParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(CompilatorParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(CompilatorParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#vardefP}.
	 * @param ctx the parse tree
	 */
	void enterVardefP(CompilatorParser.VardefPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#vardefP}.
	 * @param ctx the parse tree
	 */
	void exitVardefP(CompilatorParser.VardefPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#tbas}.
	 * @param ctx the parse tree
	 */
	void enterTbas(CompilatorParser.TbasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#tbas}.
	 * @param ctx the parse tree
	 */
	void exitTbas(CompilatorParser.TbasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#tvoid}.
	 * @param ctx the parse tree
	 */
	void enterTvoid(CompilatorParser.TvoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#tvoid}.
	 * @param ctx the parse tree
	 */
	void exitTvoid(CompilatorParser.TvoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#funlist}.
	 * @param ctx the parse tree
	 */
	void enterFunlist(CompilatorParser.FunlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#funlist}.
	 * @param ctx the parse tree
	 */
	void exitFunlist(CompilatorParser.FunlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(CompilatorParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(CompilatorParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#funchead}.
	 * @param ctx the parse tree
	 */
	void enterFunchead(CompilatorParser.FuncheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#funchead}.
	 * @param ctx the parse tree
	 */
	void exitFunchead(CompilatorParser.FuncheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#typedef1}.
	 * @param ctx the parse tree
	 */
	void enterTypedef1(CompilatorParser.Typedef1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#typedef1}.
	 * @param ctx the parse tree
	 */
	void exitTypedef1(CompilatorParser.Typedef1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#typedef2}.
	 * @param ctx the parse tree
	 */
	void enterTypedef2(CompilatorParser.Typedef2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#typedef2}.
	 * @param ctx the parse tree
	 */
	void exitTypedef2(CompilatorParser.Typedef2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#typedef2P}.
	 * @param ctx the parse tree
	 */
	void enterTypedef2P(CompilatorParser.Typedef2PContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#typedef2P}.
	 * @param ctx the parse tree
	 */
	void exitTypedef2P(CompilatorParser.Typedef2PContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(CompilatorParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(CompilatorParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#mainhead}.
	 * @param ctx the parse tree
	 */
	void enterMainhead(CompilatorParser.MainheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#mainhead}.
	 * @param ctx the parse tree
	 */
	void exitMainhead(CompilatorParser.MainheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(CompilatorParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(CompilatorParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(CompilatorParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(CompilatorParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#returnn}.
	 * @param ctx the parse tree
	 */
	void enterReturnn(CompilatorParser.ReturnnContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#returnn}.
	 * @param ctx the parse tree
	 */
	void exitReturnn(CompilatorParser.ReturnnContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#asig}.
	 * @param ctx the parse tree
	 */
	void enterAsig(CompilatorParser.AsigContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#asig}.
	 * @param ctx the parse tree
	 */
	void exitAsig(CompilatorParser.AsigContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CompilatorParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CompilatorParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#expP}.
	 * @param ctx the parse tree
	 */
	void enterExpP(CompilatorParser.ExpPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#expP}.
	 * @param ctx the parse tree
	 */
	void exitExpP(CompilatorParser.ExpPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(CompilatorParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(CompilatorParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CompilatorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CompilatorParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#funccall}.
	 * @param ctx the parse tree
	 */
	void enterFunccall(CompilatorParser.FunccallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#funccall}.
	 * @param ctx the parse tree
	 */
	void exitFunccall(CompilatorParser.FunccallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(CompilatorParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(CompilatorParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(CompilatorParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(CompilatorParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#explistP}.
	 * @param ctx the parse tree
	 */
	void enterExplistP(CompilatorParser.ExplistPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#explistP}.
	 * @param ctx the parse tree
	 */
	void exitExplistP(CompilatorParser.ExplistPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#ifr}.
	 * @param ctx the parse tree
	 */
	void enterIfr(CompilatorParser.IfrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#ifr}.
	 * @param ctx the parse tree
	 */
	void exitIfr(CompilatorParser.IfrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#elseP}.
	 * @param ctx the parse tree
	 */
	void enterElseP(CompilatorParser.ElsePContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#elseP}.
	 * @param ctx the parse tree
	 */
	void exitElseP(CompilatorParser.ElsePContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#elser}.
	 * @param ctx the parse tree
	 */
	void enterElser(CompilatorParser.ElserContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#elser}.
	 * @param ctx the parse tree
	 */
	void exitElser(CompilatorParser.ElserContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#whiler}.
	 * @param ctx the parse tree
	 */
	void enterWhiler(CompilatorParser.WhilerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#whiler}.
	 * @param ctx the parse tree
	 */
	void exitWhiler(CompilatorParser.WhilerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#dowhiler}.
	 * @param ctx the parse tree
	 */
	void enterDowhiler(CompilatorParser.DowhilerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#dowhiler}.
	 * @param ctx the parse tree
	 */
	void exitDowhiler(CompilatorParser.DowhilerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#forr}.
	 * @param ctx the parse tree
	 */
	void enterForr(CompilatorParser.ForrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#forr}.
	 * @param ctx the parse tree
	 */
	void exitForr(CompilatorParser.ForrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#forP}.
	 * @param ctx the parse tree
	 */
	void enterForP(CompilatorParser.ForPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#forP}.
	 * @param ctx the parse tree
	 */
	void exitForP(CompilatorParser.ForPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#expcond}.
	 * @param ctx the parse tree
	 */
	void enterExpcond(CompilatorParser.ExpcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#expcond}.
	 * @param ctx the parse tree
	 */
	void exitExpcond(CompilatorParser.ExpcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#expcondP}.
	 * @param ctx the parse tree
	 */
	void enterExpcondP(CompilatorParser.ExpcondPContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#expcondP}.
	 * @param ctx the parse tree
	 */
	void exitExpcondP(CompilatorParser.ExpcondPContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#oplog}.
	 * @param ctx the parse tree
	 */
	void enterOplog(CompilatorParser.OplogContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#oplog}.
	 * @param ctx the parse tree
	 */
	void exitOplog(CompilatorParser.OplogContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void enterFactorcond(CompilatorParser.FactorcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#factorcond}.
	 * @param ctx the parse tree
	 */
	void exitFactorcond(CompilatorParser.FactorcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilatorParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void enterOpcomp(CompilatorParser.OpcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilatorParser#opcomp}.
	 * @param ctx the parse tree
	 */
	void exitOpcomp(CompilatorParser.OpcompContext ctx);
}