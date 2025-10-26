// Generated from EasyLanguage.g4 by ANTLR 4.12.0
package br.edu.cefsa.compiler.parser;

    import br.edu.cefsa.compiler.datastructures.Symbol;
    import br.edu.cefsa.compiler.datastructures.Variable;
    import br.edu.cefsa.compiler.datastructures.SymbolTable;
    import br.edu.cefsa.compiler.datastructures.Function;
    import br.edu.cefsa.compiler.exceptions.SemanticException;
    import br.edu.cefsa.compiler.abstractsyntaxtree.Program;
    import br.edu.cefsa.compiler.abstractsyntaxtree.AbstractCommand;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandLeitura;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandEscrita;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandAtribuicao;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandAtribuicaoArrayItem;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandDecisao;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandFor;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandWhile;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandArrayInit;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandFunction;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandReturn;
    import br.edu.cefsa.compiler.abstractsyntaxtree.CommandCallFunction;
    import java.util.ArrayList;
    import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EasyLanguageParser}.
 */
public interface EasyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EasyLanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EasyLanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(EasyLanguageParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(EasyLanguageParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(EasyLanguageParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(EasyLanguageParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#declareItem}.
	 * @param ctx the parse tree
	 */
	void enterDeclareItem(EasyLanguageParser.DeclareItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#declareItem}.
	 * @param ctx the parse tree
	 */
	void exitDeclareItem(EasyLanguageParser.DeclareItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(EasyLanguageParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(EasyLanguageParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(EasyLanguageParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(EasyLanguageParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(EasyLanguageParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(EasyLanguageParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(EasyLanguageParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(EasyLanguageParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(EasyLanguageParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(EasyLanguageParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(EasyLanguageParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(EasyLanguageParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdattribarrayitem}.
	 * @param ctx the parse tree
	 */
	void enterCmdattribarrayitem(EasyLanguageParser.CmdattribarrayitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdattribarrayitem}.
	 * @param ctx the parse tree
	 */
	void exitCmdattribarrayitem(EasyLanguageParser.CmdattribarrayitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void enterCmdselecao(EasyLanguageParser.CmdselecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdselecao}.
	 * @param ctx the parse tree
	 */
	void exitCmdselecao(EasyLanguageParser.CmdselecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdfor}.
	 * @param ctx the parse tree
	 */
	void enterCmdfor(EasyLanguageParser.CmdforContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdfor}.
	 * @param ctx the parse tree
	 */
	void exitCmdfor(EasyLanguageParser.CmdforContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void enterCmdwhile(EasyLanguageParser.CmdwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdwhile}.
	 * @param ctx the parse tree
	 */
	void exitCmdwhile(EasyLanguageParser.CmdwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdarray}.
	 * @param ctx the parse tree
	 */
	void enterCmdarray(EasyLanguageParser.CmdarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdarray}.
	 * @param ctx the parse tree
	 */
	void exitCmdarray(EasyLanguageParser.CmdarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdfuncao}.
	 * @param ctx the parse tree
	 */
	void enterCmdfuncao(EasyLanguageParser.CmdfuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdfuncao}.
	 * @param ctx the parse tree
	 */
	void exitCmdfuncao(EasyLanguageParser.CmdfuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(EasyLanguageParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(EasyLanguageParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(EasyLanguageParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(EasyLanguageParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(EasyLanguageParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(EasyLanguageParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#cmdChamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamadaFuncao(EasyLanguageParser.CmdChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#cmdChamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamadaFuncao(EasyLanguageParser.CmdChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentos(EasyLanguageParser.ListaArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentos(EasyLanguageParser.ListaArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(EasyLanguageParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(EasyLanguageParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(EasyLanguageParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(EasyLanguageParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(EasyLanguageParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(EasyLanguageParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EasyLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EasyLanguageParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EasyLanguageParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(EasyLanguageParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EasyLanguageParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(EasyLanguageParser.TermoContext ctx);
}