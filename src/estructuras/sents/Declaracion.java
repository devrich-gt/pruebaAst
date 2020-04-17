/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.sents;

import compartido.Constantes;
import compartido.ErrorAnalisis;
import estructuras.Ambiente;
import estructuras.*;
import estructuras.Sim.Simbolo;
import estructuras.exp.*;

/**
 *
 * @author rich
 */
public class Declaracion extends Nodo {

    private Id id;
    private Expresion exp;

    public Declaracion(Id id) {
        this.id = id;
        this.exp = new ValorExpresion();
    }

    public Declaracion(Id id, Expresion exp) {
        this(id);
        this.exp = exp;
    }

    public Declaracion(Id id, int fila, int columna) {
        this(id);
        this.fila = fila;
        this.columna = columna;
    }

    public Declaracion(Id id, Expresion exp, int fila, int columna) {
        this(id, exp);
        this.fila = fila;
        this.columna = columna;
    }

    @Override
    public String grafo() {
        String cad = "";
        cad += this.hashCode() + "[label=\"" + this.getClass().getSimpleName() + "\"];\n";
        cad += this.hashCode() + " -> " + this.id.hashCode() + ";\n";
        cad += this.id.grafo();
        cad += this.hashCode() + " -> " + this.exp.hashCode() + ";\n";
        cad += this.exp.grafo();
        return cad;
    }

    @Override
    public Valor ejecutar(Ambiente ambiente) {
        if (ambiente.contains(this.id.identificador)) {
            Constantes.addError(
                    new ErrorAnalisis(
                            ErrorAnalisis.TipoError.SEMANTICO,
                            this.fila,
                            this.columna,
                            "La variable ya esxiste en este contexto: " + id.identificador));
        } else {
            Valor valorExp;
            try {
                valorExp = this.exp.ejecutar(ambiente);
            } catch (Exception e) {
                valorExp = new Valor();
            }
            Simbolo nuevo = new Simbolo(id.identificador, valorExp);
            ambiente.addSimbolo(nuevo);
        }
        return new Valor();
    }

}
