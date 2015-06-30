// Generated from Desespero.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DesesperoParser}.
 */
public interface DesesperoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DesesperoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DesesperoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(DesesperoParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(DesesperoParser.FuncoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(DesesperoParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(DesesperoParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(DesesperoParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(DesesperoParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(DesesperoParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(DesesperoParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(DesesperoParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(DesesperoParser.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(DesesperoParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(DesesperoParser.ChamadaFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void enterParametrosChamada(DesesperoParser.ParametrosChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#parametrosChamada}.
	 * @param ctx the parse tree
	 */
	void exitParametrosChamada(DesesperoParser.ParametrosChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#condicionais}.
	 * @param ctx the parse tree
	 */
	void enterCondicionais(DesesperoParser.CondicionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#condicionais}.
	 * @param ctx the parse tree
	 */
	void exitCondicionais(DesesperoParser.CondicionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void enterIfdes(DesesperoParser.IfdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#ifdes}.
	 * @param ctx the parse tree
	 */
	void exitIfdes(DesesperoParser.IfdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselse(DesesperoParser.IfdeselseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#ifdeselse}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselse(DesesperoParser.IfdeselseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void enterIfdeselseif(DesesperoParser.IfdeselseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#ifdeselseif}.
	 * @param ctx the parse tree
	 */
	void exitIfdeselseif(DesesperoParser.IfdeselseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void enterWhiledes(DesesperoParser.WhiledesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#whiledes}.
	 * @param ctx the parse tree
	 */
	void exitWhiledes(DesesperoParser.WhiledesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#fordes}.
	 * @param ctx the parse tree
	 */
	void enterFordes(DesesperoParser.FordesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#fordes}.
	 * @param ctx the parse tree
	 */
	void exitFordes(DesesperoParser.FordesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#dodes}.
	 * @param ctx the parse tree
	 */
	void enterDodes(DesesperoParser.DodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#dodes}.
	 * @param ctx the parse tree
	 */
	void exitDodes(DesesperoParser.DodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void enterSwitchdes(DesesperoParser.SwitchdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#switchdes}.
	 * @param ctx the parse tree
	 */
	void exitSwitchdes(DesesperoParser.SwitchdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(DesesperoParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(DesesperoParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void enterDefaultdes(DesesperoParser.DefaultdesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#defaultdes}.
	 * @param ctx the parse tree
	 */
	void exitDefaultdes(DesesperoParser.DefaultdesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(DesesperoParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(DesesperoParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#multidimensional}.
	 * @param ctx the parse tree
	 */
	void enterMultidimensional(DesesperoParser.MultidimensionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#multidimensional}.
	 * @param ctx the parse tree
	 */
	void exitMultidimensional(DesesperoParser.MultidimensionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#declaracoesArray}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoesArray(DesesperoParser.DeclaracoesArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#declaracoesArray}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoesArray(DesesperoParser.DeclaracoesArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterSubArrayDeclaracoes(DesesperoParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#subArrayDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitSubArrayDeclaracoes(DesesperoParser.SubArrayDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#atribuicoes}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicoes(DesesperoParser.AtribuicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#atribuicoes}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicoes(DesesperoParser.AtribuicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicoesIncEDec(DesesperoParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#atribuicoesIncEDec}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicoesIncEDec(DesesperoParser.AtribuicoesIncEDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#tipoComVoid}.
	 * @param ctx the parse tree
	 */
	void enterTipoComVoid(DesesperoParser.TipoComVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#tipoComVoid}.
	 * @param ctx the parse tree
	 */
	void exitTipoComVoid(DesesperoParser.TipoComVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(DesesperoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(DesesperoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(DesesperoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(DesesperoParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(DesesperoParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(DesesperoParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void enterOp_rel(DesesperoParser.Op_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#op_rel}.
	 * @param ctx the parse tree
	 */
	void exitOp_rel(DesesperoParser.Op_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void enterOp_neg(DesesperoParser.Op_negContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#op_neg}.
	 * @param ctx the parse tree
	 */
	void exitOp_neg(DesesperoParser.Op_negContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void enterOp_bitwise(DesesperoParser.Op_bitwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#op_bitwise}.
	 * @param ctx the parse tree
	 */
	void exitOp_bitwise(DesesperoParser.Op_bitwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 */
	void enterOp_arit_baixa(DesesperoParser.Op_arit_baixaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#op_arit_baixa}.
	 * @param ctx the parse tree
	 */
	void exitOp_arit_baixa(DesesperoParser.Op_arit_baixaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void enterOp_logica(DesesperoParser.Op_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#op_logica}.
	 * @param ctx the parse tree
	 */
	void exitOp_logica(DesesperoParser.Op_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DesesperoParser#val_final}.
	 * @param ctx the parse tree
	 */
	void enterVal_final(DesesperoParser.Val_finalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DesesperoParser#val_final}.
	 * @param ctx the parse tree
	 */
	void exitVal_final(DesesperoParser.Val_finalContext ctx);
}