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
 * @author Paulo Eduardo Martins
 */
public class AssemblyName {

    private final String assemblyName;
    private final Identificador id;

    public AssemblyName(String assemblyName, Identificador id)
    {
        this.assemblyName = assemblyName;
        this.id = id;
    }    
    
    
    public static List<AssemblyName> getMatrix(List<Identificador> tabelaSimbolos)
    {
        int numb = 1,numbFun = 1;
        List<AssemblyName> anlist = new ArrayList();
        for (Identificador identificador : tabelaSimbolos)
        {
            if(!identificador.isFuncao()){
                anlist.add(new AssemblyName("var" + numb + identificador.getNome(), identificador));
                numb++;
            }else{
                if(identificador.getNome().equals("main")){
                    anlist.add(new AssemblyName("main", identificador));
                }else{
                    anlist.add(new AssemblyName("func" + numbFun + identificador.getNome(), identificador));
                    numbFun++;
                }
            }
        }
        return anlist;
    }

    @Override
    public String toString()
    {
        return assemblyName;
    }

    public Identificador getId()
    {
        return id;
    }
    
    public static AssemblyName findAN(List<AssemblyName> anlist, Identificador id){
        for (AssemblyName anlist1 : anlist)
        {
            if(anlist1.getId().equals(id)){
                return anlist1;
            }
        }
        return null;
    }
    
}
