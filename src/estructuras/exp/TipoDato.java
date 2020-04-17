/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.exp;

import estructuras.Ambiente;
import estructuras.Nodo;
import estructuras.exp.Valor;

/**
 *
 * @author rich
 */
public class TipoDato extends Nodo {

    public enum TipoDatoPrimitivo {
        INT, DOUBLE, BOOLEAN, CHAR, STRING, NULL, OBJETO, VOID
    }

    public TipoDatoPrimitivo tipoDatoPrimitivo;

    public TipoDato() {
        this.tipoDatoPrimitivo = TipoDatoPrimitivo.NULL;
        this.fila = 0;
        this.columna = 0;
    }

    public TipoDato(TipoDatoPrimitivo tipoDatoPrimitivo) {
        this();
        this.tipoDatoPrimitivo = tipoDatoPrimitivo;
    }

    public TipoDato(TipoDatoPrimitivo tipoDatoPrimitivo, int fila, int columna) {
        this();
        this.tipoDatoPrimitivo = tipoDatoPrimitivo;
        this.fila = fila;
        this.columna = columna;
    }

    public TipoDato getClon() {
        return new TipoDato(
                this.tipoDatoPrimitivo,
                this.fila,
                this.columna
        );
    }

    @Override
    public Valor ejecutar(Ambiente Ambiente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String grafo() {
        String cad = "";
        cad += this.hashCode() + "[label = \"" + this.getClass().getSimpleName() + " : \n" + this.toString() + "\" ];\n";
        return cad;
    }

    public boolean esString() {
        return this.tipoDatoPrimitivo == TipoDatoPrimitivo.STRING;
    }

    public boolean esDouble() {
        return this.tipoDatoPrimitivo == TipoDatoPrimitivo.DOUBLE;
    }

    public boolean esBoolean() {
        return this.tipoDatoPrimitivo == TipoDatoPrimitivo.BOOLEAN;
    }

    public boolean esInt() {
        return this.tipoDatoPrimitivo == TipoDatoPrimitivo.INT;
    }

    public boolean esChar() {
        return this.tipoDatoPrimitivo == TipoDatoPrimitivo.CHAR;
    }

    public boolean esNull() {
        return this.tipoDatoPrimitivo == TipoDatoPrimitivo.NULL;
    }

    public boolean esNumerico() {
        return this.tipoDatoPrimitivo == TipoDatoPrimitivo.DOUBLE
                || this.tipoDatoPrimitivo == TipoDatoPrimitivo.INT
                || this.tipoDatoPrimitivo == TipoDatoPrimitivo.CHAR;
    }

    @Override
    public String toString() {
        return this.tipoDatoPrimitivo.toString();
    }
}
