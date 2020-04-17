/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.sents;

import compartido.Constantes;
import compartido.ErrorAnalisis;
import estructuras.Ambiente;
import estructuras.Nodo;
import estructuras.Sim.Simbolo;
import estructuras.exp.*;

/**
 *
 * @author rich
 */
public class Asignacion extends Nodo {

    public Id id;
    public Expresion exp;

    public Asignacion(Id id, Expresion exp) {
        this.id = id;
        this.exp = exp;
    }

    public Asignacion(Id id, Expresion exp, int fila, int columna) {
        this(id,exp);
    }
    
    @Override
    public String grafo() {
        String cad = "";
        cad += this.hashCode() + "[label= \" " + this.getClass().getSimpleName() + "\"];\n";
        cad += this.hashCode() + " -> " + this.id.hashCode() + ";\n";
        cad += this.id.grafo();
        cad += this.hashCode() + " -> " + this.exp.hashCode() + ";\n";
        cad += this.exp.grafo();
        return cad;

    }

    @Override
    public Valor ejecutar(Ambiente ambiente) {
        Valor valorAsignacion;
        try {
            valorAsignacion = this.exp.ejecutar(ambiente);
        } catch (Exception e) {
            valorAsignacion = new Valor();
        }
        Simbolo simVar = ambiente.getSimbolo(this.id.identificador);
        if (simVar != null) {
            simVar.valor = valorAsignacion;
        } else {
            Constantes.addError(
                    new ErrorAnalisis(
                            ErrorAnalisis.TipoError.SEMANTICO,
                            this.fila,
                            this.columna,
                            "La variable no esxiste en este contexto: " + id.identificador));
        }
        return new Valor();
    }

}
