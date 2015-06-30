/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import executargramatica.Tabela;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OP
 */
public class Escopo {

    private final String nome;
    private List<Escopo> subEscopos = new ArrayList();
    private final Escopo pai;

    public Escopo(String nome)
    {
        this.nome = nome;
        this.pai = null;
    }
    private Escopo(String nome, Escopo pai)
    {
        this.nome = nome;
        this.pai = pai;
    }
    
    /**
     * Cria um escopo novo e retorna ele.
     *
     * @param nome
     * @param escopoAtual escopo a ser adicionado o novo
     * @return 
     */
    public static Escopo criaEVaiEscopoNovo(String nome,Escopo escopoAtual) {
        Escopo novo = new Escopo(nome, escopoAtual);
        escopoAtual.getSubEscopos().add(novo);
        return novo;
    }
    
    public static boolean verificaSeExisteNoEscopo(String nome,List<Identificador> tabelaSimbolos, Escopo escopoAtual) {
        for (Identificador id : tabelaSimbolos) {
            if (id.getEscopo() == escopoAtual && id.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public Escopo getPai()
    {
        return pai;
    }

    public List<Escopo> getSubEscopos()
    {
        return subEscopos;
    }

    public void setSubEscopos(List<Escopo> subEscopos)
    {
        this.subEscopos = subEscopos;
    }

    public String getNome()
    {
        return nome;
    }

    @Override
    public String toString()
    {
        if (this.getPai() != null)
        {
            return this.getPai() + "->" + this.nome;
        }else{
            return this.nome;
        }
    }

}
