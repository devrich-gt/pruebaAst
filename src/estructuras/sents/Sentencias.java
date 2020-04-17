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
public class Sentencias extends Nodo {

    private ArrayList<Nodo> sents;

    public Sentencias() {
        this.fila = 0;
        this.columna = 0;
        this.sents = new ArrayList<>();
    }

    public Sentencias(int fila, int columna) {
        this();
        this.fila = fila;
        this.columna = columna;
    }

    public void add(Nodo nuevo) {
        this.sents.add(nuevo);
    }

    @Override
    public String grafo() {
        String cad = "";
        cad += this.hashCode() + "[label=\"" + this.getClass().getSimpleName() + "\"];\n";
        
        for (Nodo sent : this.sents) {
            cad += this.hashCode() + " -> " + sent.hashCode() + ";\n";
            cad += sent.grafo();
        }
        return cad;
    }

    @Override
    public Valor ejecutar(Ambiente ambiente) {
        for (Nodo sent : this.sents) {
            sent.ejecutar(ambiente);
        }
        return new Valor();
    }

}
