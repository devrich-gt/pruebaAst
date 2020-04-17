/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.sents;

import compartido.Constantes;
import estructuras.Ambiente;
import estructuras.Nodo;
import estructuras.exp.*;

/**
 *
 * @author rich
 */
public class Imprimir extends Nodo {

    public Expresion exp;
    
    public Imprimir(Expresion exp, int fila, int columna){
        this.exp = exp;
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public String grafo() {
        String cad = "";
        cad += this.hashCode() + "[label=\"" + this.getClass().getSimpleName() + "\"];\n";
        cad += this.hashCode() + " -> " + this.exp.hashCode() + ";\n";
        cad += this.exp.grafo();
        return cad;
    }

    @Override
    public Valor ejecutar(Ambiente ambiente) {
        Valor valorExp;
        try {
            valorExp = this.exp.ejecutar(ambiente);
        } catch (Exception e) {
            valorExp = new Valor();
        }
        Constantes.setSalida(valorExp.toString());
        return valorExp;
    }

}
