/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OP
 */
public class Identificador {

    public enum Tipo {

        INTEIRO, TEXTO, REAL, LOGICO, BINARIO, HEXADECIMAL, VOID
    }
    String nome;
    Tipo tipo;
    boolean inicializada;
    boolean usada;
    Escopo escopo;
    boolean parametro;
    int posicaoParametro;
    int dimensoes;
    int qtdArmazenada;
    boolean funcao;

    public Identificador(String nome, Tipo tipo, boolean inicializada, boolean usada, Escopo escopo, boolean parametro, int posicaoParametro, int dimensoes, int qtdArmazenada, boolean funcao)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.inicializada = inicializada;
        this.usada = usada;
        this.escopo = escopo;
        this.parametro = parametro;
        this.posicaoParametro = posicaoParametro;
        this.dimensoes = dimensoes;
        this.qtdArmazenada = qtdArmazenada;
        this.funcao = funcao;
    }
    public Identificador(String nome, Tipo tipo, boolean inicializada, boolean usada, Escopo escopo, boolean parametro, int posicaoParametro, int dimensoes, boolean funcao)
    {
        this.nome = nome;
        this.tipo = tipo;
        this.inicializada = inicializada;
        this.usada = usada;
        this.escopo = escopo;
        this.parametro = parametro;
        this.posicaoParametro = posicaoParametro;
        this.dimensoes = dimensoes;
        this.qtdArmazenada = 1;
        this.funcao = funcao;
    }

    public int getQtdArmazenada()
    {
        return qtdArmazenada;
    }
    
    
    public static boolean verificaSeExiste(String idName,List<Identificador> idList){
        for (Identificador id : idList)
        {
            if(id.getNome().equals(idName)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Pega a lista de ids que são parametros da função passada.
     * @param escopoFuncao
     * @param tabelaSimbolos
     * @return 
     */
    public static List<Identificador> getParametrosFuncao(Escopo escopoFuncao,List<Identificador> tabelaSimbolos){
        List<Identificador> ids = new ArrayList();
        for (Identificador identificador : tabelaSimbolos) {
            if(identificador.isParametro() && escopoFuncao.equals(identificador.getEscopo())){
                ids.add(identificador);
            }
        }
        return ids;
    }
    
    /**
     * Retorna o identificador, olhando os escopos
     *
     * @param nomeVariavel
     * @param tabelaSimbolos
     * @param escopoAtual
     * @return
     */
    public static Identificador getId(String nomeVariavel, List<Identificador> tabelaSimbolos, Escopo escopoAtual) {
        for (Identificador variavel : tabelaSimbolos) {
            if (variavel.getNome().equals(nomeVariavel)) {
                Escopo EscopoAtualVerificado = escopoAtual;
                while (EscopoAtualVerificado != null) {
                    if (variavel.getEscopo() == EscopoAtualVerificado) {
                        return variavel;
                    }
                    EscopoAtualVerificado = EscopoAtualVerificado.getPai();
                }
            }
        }
        return null;
    }

    /**
     * Retorna o identificador, o primeiro achado. (cuidado podem haver varias
     * variaveis com o mesmo nome em escopos diferentes), recomendado para achar
     * funções.
     *
     * @param nomeVariavel
     * @param tabelaSimbolos
     * @return
     */
    public static Identificador getUNSAFEId(String nomeVariavel, List<Identificador> tabelaSimbolos) {
        for (Identificador variavel : tabelaSimbolos) {
            if (variavel.getNome().equals(nomeVariavel)) {
                return variavel;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public boolean isInicializada() {
        return inicializada;
    }

    public void setInicializada(boolean inicializada) {
        this.inicializada = inicializada;
    }

    public boolean isUsada() {
        return usada;
    }

    public void setUsada(boolean usada) {
        this.usada = usada;
    }

    public Escopo getEscopo() {
        return escopo;
    }

    public void setEscopo(Escopo escopo) {
        this.escopo = escopo;
    }

    public boolean isParametro() {
        return parametro;
    }

    public void setParametro(boolean parametro) {
        this.parametro = parametro;
    }

    public int getPosicaoParametro() {
        return posicaoParametro;
    }

    public void setPosicaoParametro(int posicaoParametro) {
        this.posicaoParametro = posicaoParametro;
    }

    public int getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(int dimensoes) {
        this.dimensoes = dimensoes;
    }

    public boolean isFuncao() {
        return funcao;
    }

    public void setFuncao(boolean funcao) {
        this.funcao = funcao;
    }

}
