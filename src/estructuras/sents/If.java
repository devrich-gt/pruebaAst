/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.sents;

import estructuras.Ambiente;
import estructuras.Nodo;
import estructuras.Sim.TablaSimbolos;
import estructuras.exp.*;

/**
 *
 * @author rich
 */
public class If extends Nodo {

    public Expresion condicion;
    public Sentencias sentencias;

    public If(Expresion condicion, Sentencias sentencias, int fila, int columna) {
        this.condicion = condicion;
        this.sentencias = sentencias;
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public String grafo() {
        String cad = "";
        cad += this.hashCode() + "[label= \" " + this.getClass().getSimpleName() + "\"];\n";
        cad += this.hashCode() + " -> " + this.condicion.hashCode() + ";\n";
        cad += this.condicion.grafo();
        cad += this.hashCode() + " -> " + this.sentencias.hashCode() + ";\n";
        cad += this.sentencias.grafo();
        return cad;
    }

    @Override
    public Valor ejecutar(Ambiente ambiente) {
        Valor valorCondicion = this.condicion.ejecutar(ambiente);
        String nombreIf = this.hashCode() + "";
        if (valorCondicion.getBool()) {
            ambiente.addAmbiente(new TablaSimbolos(nombreIf));
            this.sentencias.ejecutar(ambiente);
            ambiente.pop();
            return new Valor(true);
        } else {
            return new Valor(false);
        }
    }
}
