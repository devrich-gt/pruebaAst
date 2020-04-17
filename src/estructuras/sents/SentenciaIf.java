/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.sents;

import estructuras.Ambiente;
import estructuras.Nodo;
import estructuras.exp.Valor;
import java.util.ArrayList;

/**
 *
 * @author rich
 */
public class SentenciaIf extends Nodo {
    public ArrayList<If> lista;

    public SentenciaIf() {
        this.lista = new ArrayList<>();
    }

    
    public void add(If sif){
        this.lista.add(sif);
    }


    @Override
    public String grafo() {
        String cad = "";
        cad += this.hashCode() + "[label= \" " + this.getClass().getSimpleName() + "\"];\n";
        for (If sIf : this.lista) {
            cad += this.hashCode() + " -> " + sIf.hashCode() + ";\n";
            cad += sIf.grafo();
        }
        return cad;
    }

    @Override
    public Valor ejecutar(Ambiente ambiente) {
        for(If sIf : this.lista){
            Valor valorIf = sIf.ejecutar(ambiente);
            if(valorIf.getBool()){
                break;
            }
        }
        return new Valor();
    }
}
