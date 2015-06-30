/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package executargramatica;

import gerado.DesesperoBaseVisitor;
import gerado.DesesperoParser;
import java.util.List;
import modelo.AssemblyName;
import modelo.FuncoesPadroes;
import modelo.Identificador;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author OP
 */
public class VisitanteDoDesesperoGeradorBipide extends VisitanteDoDesespero {

    private final StringBuilder header = new StringBuilder();
    private final StringBuilder codigo = new StringBuilder();
    private final List<AssemblyName> anlist;
    private int maiorNumTemporariosNecessarios = 0;
    private int numTemporariosNecessarios = 0;

    public VisitanteDoDesesperoGeradorBipide(List<Identificador> tabelaSimbolos) {
        super(tabelaSimbolos);
        anlist = AssemblyName.getMatrix(tabelaSimbolos);
        geradorData();
        codigo.append(".text\n");
    }

    public String getCodigo() {
        StringBuilder finalCode = new StringBuilder();
        finalCode.append(header);
        for (int i = 1; i <= maiorNumTemporariosNecessarios; i++) {
            finalCode.append("temp");
            finalCode.append(i);
            finalCode.append(": 0\n");
        }
        finalCode.append(codigo);
        return finalCode.toString();
    }

    private int getOneTemp() {
        numTemporariosNecessarios++;
        if (maiorNumTemporariosNecessarios < numTemporariosNecessarios) {
            maiorNumTemporariosNecessarios = numTemporariosNecessarios;
        }
        return numTemporariosNecessarios;
    }

    private int releaseTheTemp() {
        numTemporariosNecessarios--;
        return numTemporariosNecessarios;
    }

    private void geradorData() {
        header.append(".data\n");
        for (Identificador identificador : tabelaSimbolos) {
            if (!identificador.isFuncao()) {
                if (identificador.getTipo() != Identificador.Tipo.INTEIRO) {
                    throw new ParseCancellationException(identificador.getTipo() + " NOT SUPPORTED BY BIPIDE");
                }
                header.append(AssemblyName.findAN(anlist, identificador));
                header.append(": ");
                for (int i = 0; i < identificador.getQtdArmazenada(); i++) {
                    if (i == identificador.getQtdArmazenada() - 1) {
                        header.append("0\n");
                    } else {
                        header.append("0,");
                    }
                }
            }
        }
    }

    @Override
    public Object visitTipoComVoid(DesesperoParser.TipoComVoidContext ctx) {
        return super.visitTipoComVoid(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressao(DesesperoParser.ExpressaoContext ctx) {
        //Primeira operação
        primeiraOperacao(ctx);
        //Demais Operações
        int tempNum;
        DesesperoParser.Op_relContext rel = null;
        for (int i = 1; i < ctx.val_final().size(); i++) {
            if(ctx.operations(i - 1).op_rel() != null){
                tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LDI", "0");
                rel = ctx.operations(i - 1).op_rel();
            }
            resolveValFinalEOperando(ctx.operations(i - 1), ctx.val_final(i));
        }
        if(rel != null){
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp"+(tempNum-1));
            comando("SUB", "temp"+tempNum);
            releaseTheTemp();
            releaseTheTemp();
            
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    private void resolveSalto(DesesperoParser.Op_relContext rel,int tempNum, boolean anti_form){
        if(rel.DIFERENTE() != null){
            if(anti_form){
                comando(null, null);
            }else{
                
            }
        }
        if(rel.IDENTICO() != null){
            
        }
        if(rel.MAIOROUIGUAL() != null){
            
        }
        if(rel.MAIORQUE() != null){
            
        }
        if(rel.MENOROUIGUAL() != null){
            
        }
        if(rel.MENORQUE() != null){
            
        }
    }
    
    private void primeiraOperacao(DesesperoParser.ExpressaoContext ctx) {
        DesesperoParser.Val_finalContext valctx = ctx.val_final(0);
        //Carregar valor inteiro imediato
        if (valctx.CONSTINTEIRO() != null) {
            comando("LDI", valctx.CONSTINTEIRO().getSymbol().getText());
        }
        //Carrega valor de um ID
        if (valctx.ID() != null) {
            if (valctx.multidimensional() != null) {
                //Carregar valor de vetor
                comando("LDI", valctx.multidimensional().CONSTINTEIRO(0).getSymbol().getText());
                comando("STO", "$indr");
                comando("LDV", findAN(valctx.ID().getSymbol().getText()).toString());
            } else {
                //Carregar valor de variavel
                String varName = findAN(valctx.ID().getText()).toString();
                comando("LD", varName);
            }
        }

        //Chama função
        if (valctx.chamadaFuncao() != null) {
            visitChamadaFuncao(valctx.chamadaFuncao());
        }

        //Resolve outra expressão
        if (valctx.expressao() != null) {
            visitExpressao(valctx.expressao());
        }

        if (ctx.op_neg() != null) {
            if (ctx.op_neg().MENOS() != null) {
                reverteSinalAcc();
            }
        }
    }

    private void resolveValFinalEOperando(DesesperoParser.OperationsContext opctx, DesesperoParser.Val_finalContext valctx) {
        if (opctx.op_arit_baixa() != null) {
            if (opctx.op_arit_baixa().MAIS() != null) {
                resolveOpAritmeticaMaisOuNegacaoMenos(valctx, true);
            }
        }
        if (opctx.op_neg() != null) {
            if (opctx.op_neg().MENOS() != null) {
                resolveOpAritmeticaMaisOuNegacaoMenos(valctx, false);
            }
        }
    }
    private void resolveOpRelacional(){
        
    }
    
    private void resolveOpAritmeticaMaisOuNegacaoMenos(DesesperoParser.Val_finalContext valctx, boolean operacaoMais) {
        //ADD ou SUB valor inteiro imediato
        if (valctx.CONSTINTEIRO() != null) {
            if (operacaoMais) {
                comando("ADDI", valctx.CONSTINTEIRO().getSymbol().getText());
            } else {
                comando("SUBI", valctx.CONSTINTEIRO().getSymbol().getText());
            }
            return;
        }

        //Carrega valor de um ID
        if (valctx.ID() != null) {
            if (valctx.multidimensional() != null) {
                //Carregar valor de vetor
                int tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LDI", valctx.multidimensional().CONSTINTEIRO(0).getSymbol().getText());
                comando("STO", "$indr");
                comando("LDV", findAN(valctx.ID().getSymbol().getText()).toString());
                tempNum = getOneTemp();
                comando("STO", "temp" + tempNum);
                comando("LD", "temp" + (tempNum - 1));
                if (operacaoMais) {
                    comando("ADD", "temp" + tempNum);
                } else {
                    comando("SUB", "temp" + tempNum);
                }
                releaseTheTemp();
                releaseTheTemp();
                return;

            } else {
                //Carregar valor de variavel
                String varName = findAN(valctx.ID().getText()).toString();
                if (operacaoMais) {
                    comando("ADD", varName);
                } else {
                    comando("SUB", varName);
                }
                return;
            }
        }

        //Chama função
        if (valctx.chamadaFuncao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitChamadaFuncao(valctx.chamadaFuncao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (operacaoMais) {
                comando("ADD", "temp" + tempNum);
            } else {
                comando("SUB", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }

        //Resolve outra expressão
        if (valctx.expressao() != null) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitExpressao(valctx.expressao());
            tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LD", "temp" + (tempNum - 1));
            if (operacaoMais) {
                comando("ADD", "temp" + tempNum);
            } else {
                comando("SUB", "temp" + tempNum);
            }
            releaseTheTemp();
            releaseTheTemp();
            return;
        }
        throw new ParseCancellationException("Outras operações não identificadas" + valctx.getText());

    }

    private void comando(String comando, String operador) {
        codigo.append(comando);
        codigo.append(" ");
        codigo.append(operador);
        codigo.append("\n");
    }

    @Override
    public Object visitVal_final(DesesperoParser.Val_finalContext ctx) {
        if (ctx.CONSTINTEIRO() != null) {

        }
        return super.visitVal_final(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_logica(DesesperoParser.Op_logicaContext ctx) {
        return super.visitOp_logica(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_bitwise(DesesperoParser.Op_bitwiseContext ctx) {
        return super.visitOp_bitwise(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOperations(DesesperoParser.OperationsContext ctx) {
        return super.visitOperations(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    private void reverteSinalAcc() {
        int tempNum = getOneTemp();
        comando("STO", "temp" + tempNum);
        comando("LDI", "0");
        comando("SUB", "temp" + tempNum);
        releaseTheTemp();
    }

    @Override
    public Object visitParametrosChamada(DesesperoParser.ParametrosChamadaContext ctx) {
        return super.visitParametrosChamada(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitTipo(DesesperoParser.TipoContext ctx) {
        return super.visitTipo(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSwitchCase(DesesperoParser.SwitchCaseContext ctx) {
        return super.visitSwitchCase(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_arit_baixa(DesesperoParser.Op_arit_baixaContext ctx) {
        return super.visitOp_arit_baixa(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitParametros(DesesperoParser.ParametrosContext ctx) {
        return super.visitParametros(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSwitchdes(DesesperoParser.SwitchdesContext ctx) {
        return super.visitSwitchdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFuncoes(DesesperoParser.FuncoesContext ctx) {
        if (ctx.ID() == null) {
            return null;
        }
        AssemblyName an = findAN(ctx.ID().getText());
        escopoAtual = vaiEscopoFilho(an.getId().getNome());
        codigo.append(an.toString());
        codigo.append(": \n");
        visitBloco(ctx.bloco()); //To change body of generated methods, choose Tools | Templates.
        if (an.toString().equals("main")) {
            codigo.append("HLT\n");
        } else {
            codigo.append("RETURN\n");
        }
        retornaEscopoPai();
        visitFuncoes(ctx.funcoes());
        return null;
    }

    @Override
    public Object visitIfdeselse(DesesperoParser.IfdeselseContext ctx) {
        return super.visitIfdeselse(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIfdes(DesesperoParser.IfdesContext ctx) {
        return super.visitIfdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCondicionais(DesesperoParser.CondicionaisContext ctx) {
        return super.visitCondicionais(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMultidimensional(DesesperoParser.MultidimensionalContext ctx) {
        return super.visitMultidimensional(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaracoesArray(DesesperoParser.DeclaracoesArrayContext ctx) {
        return super.visitDeclaracoesArray(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitSubArrayDeclaracoes(DesesperoParser.SubArrayDeclaracoesContext ctx) {
        return super.visitSubArrayDeclaracoes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAtribuicoes(DesesperoParser.AtribuicoesContext ctx) {
        AssemblyName variavel = findAN(ctx.ID().getText());
        if (variavel.getId().getDimensoes() == 0) {
            visitExpressao(ctx.expressao());
            comando("STO", variavel.toString());
        } else {
            visitExpressao(ctx.expressao());
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            comando("LDI", String.valueOf(ctx.multidimensional().CONSTINTEIRO(0)));
            comando("STO", "$indr");
            comando("LD", "temp" + tempNum);
            releaseTheTemp();
            comando("STOV", variavel.toString());
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitComandos(DesesperoParser.ComandosContext ctx) {
        return super.visitComandos(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFordes(DesesperoParser.FordesContext ctx) {
        return super.visitFordes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitWhiledes(DesesperoParser.WhiledesContext ctx) {
        return super.visitWhiledes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    private AssemblyName findAN(String name) {
        return AssemblyName.findAN(anlist, Identificador.getId(name, tabelaSimbolos, escopoAtual));
    }

    @Override
    public Object visitDeclaracoes(DesesperoParser.DeclaracoesContext ctx) {
        if (ctx.IGUAL() != null) {
            AssemblyName variavel = findAN(ctx.ID().getText());
            if (ctx.multidimensional() == null) {
                visitExpressao(ctx.expressao());
                comando("STO", variavel.toString());
            } else {
                int iMax = Integer.parseInt(ctx.multidimensional().CONSTINTEIRO(0).getSymbol().getText());
                for (int i = 0; i < iMax; i++) {
                    visitExpressao(ctx.declaracoesArray().subArrayDeclaracoes(0).expressao(i));
                    int tempNum = getOneTemp();
                    comando("STO", "temp" + tempNum);
                    comando("LDI", String.valueOf(i));
                    comando("STO", "$indr");
                    comando("LD", "temp" + tempNum);
                    comando("STOV", variavel.toString());
                    releaseTheTemp();
                }
            }
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDodes(DesesperoParser.DodesContext ctx) {
        return super.visitDodes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_rel(DesesperoParser.Op_relContext ctx) {
        return super.visitOp_rel(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitBloco(DesesperoParser.BlocoContext ctx) {
        return super.visitBloco(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitAtribuicoesIncEDec(DesesperoParser.AtribuicoesIncEDecContext ctx) {
        return super.visitAtribuicoesIncEDec(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitProg(DesesperoParser.ProgContext ctx) {
        escopoAtual = Identificador.getUNSAFEId("main", tabelaSimbolos).getEscopo();
        //JUMP TO MAIN
        return super.visitProg(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitChamadaFuncao(DesesperoParser.ChamadaFuncaoContext ctx) {
        if (FuncoesPadroes.getNome(FuncoesPadroes.NomeDescente.LEIA).equals(ctx.ID().getSymbol().getText())) {
            comando("LD", "$in_port");
        } else if (FuncoesPadroes.getNome(FuncoesPadroes.NomeDescente.ESCREVA).equals(ctx.ID().getSymbol().getText())) {
            int tempNum = getOneTemp();
            comando("STO", "temp" + tempNum);
            visitExpressao(ctx.parametrosChamada().expressao(0));
            comando("STO", "$out_port");
            comando("LD", "temp" + tempNum);
            releaseTheTemp();

        } else {
            //PRECISA DOS PARAMETROS !!!! //TODO INCOMPLETE
            String funName = findAN(ctx.ID().getText()).toString();
            comando("CALL", funName);
        }
        return null; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitIfdeselseif(DesesperoParser.IfdeselseifContext ctx) {
        return super.visitIfdeselseif(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitRetorno(DesesperoParser.RetornoContext ctx) {
        return super.visitRetorno(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDefaultdes(DesesperoParser.DefaultdesContext ctx) {
        return super.visitDefaultdes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_neg(DesesperoParser.Op_negContext ctx) {
        return super.visitOp_neg(ctx); //To change body of generated methods, choose Tools | Templates.
    }
}
