package gerado;

// Generated from Desespero.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DesesperoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DesesperoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DesesperoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#funcoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncoes(DesesperoParser.FuncoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(DesesperoParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(DesesperoParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(DesesperoParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(DesesperoParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadaFuncao(DesesperoParser.ChamadaFuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#parametrosChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosChamada(DesesperoParser.ParametrosChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#condicionais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionais(DesesperoParser.CondicionaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#ifdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdes(DesesperoParser.IfdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#ifdeselse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdeselse(DesesperoParser.IfdeselseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#ifdeselseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfdeselseif(DesesperoParser.IfdeselseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#whiledes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhiledes(DesesperoParser.WhiledesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#fordes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFordes(DesesperoParser.FordesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#dodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDodes(DesesperoParser.DodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#switchdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchdes(DesesperoParser.SwitchdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(DesesperoParser.SwitchCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#defaultdes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultdes(DesesperoParser.DefaultdesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(DesesperoParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#multidimensional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultidimensional(DesesperoParser.MultidimensionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#declaracoesArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoesArray(DesesperoParser.DeclaracoesArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubArrayDeclaracoes(DesesperoParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#atribuicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicoes(DesesperoParser.AtribuicoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicoesIncEDec(DesesperoParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#tipoComVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoComVoid(DesesperoParser.TipoComVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(DesesperoParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(DesesperoParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(DesesperoParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#op_rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_rel(DesesperoParser.Op_relContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#op_neg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_neg(DesesperoParser.Op_negContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#op_bitwise}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_bitwise(DesesperoParser.Op_bitwiseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_arit_baixa(DesesperoParser.Op_arit_baixaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#op_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logica(DesesperoParser.Op_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DesesperoParser#val_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal_final(DesesperoParser.Val_finalContext ctx);
}