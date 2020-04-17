/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.exp;

import estructuras.Ambiente;

/**
 *
 * @author rich
 */
public class ValorExpresion extends Expresion {

    public ValorExpresion() {
        this.valor = new Valor();
        this.fila = 0;
        this.columna = 0;
    }

    public ValorExpresion(Valor valor) {
        this.valor = valor;
        this.fila = 0;
        this.columna = 0;
    }

    public ValorExpresion(Valor valor, int fila, int columna) {
        this(valor);
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public String grafo() {
        return this.hashCode() + "[label= \" " + this.getClass().getSimpleName() + " : \n" + this.valor.toString() + "\"];\n";
    }

    @Override
    public Valor ejecutar(Ambiente ambiente) {
        return this.valor.getClon();
    }

}
