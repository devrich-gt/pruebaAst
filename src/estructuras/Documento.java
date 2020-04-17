/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import estructuras.exp.Valor;
import estructuras.sents.Sentencias;

/**
 *
 * @author rich
 */
public class Documento extends Nodo {

    private Sentencias sents;

    public Documento() {
        this.sents = new Sentencias();
    }

    public Documento(Sentencias sents) {
        this.sents = sents;
    }

    public void setSents(Sentencias sents) {
        this.sents = sents;
    }

    @Override
    public String grafo() {
        String cad = "";
        cad += this.hashCode() + "[label=\"" + this.getClass().getSimpleName() + "\"];\n";

        cad += this.hashCode() + " -> " + sents.hashCode() + ";\n";
        cad += this.sents.grafo();
        return cad;
    }

    @Override
    public Valor ejecutar(Ambiente ambiente) {
        return this.sents.ejecutar(ambiente);
    }

}
