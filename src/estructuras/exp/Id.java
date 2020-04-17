/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.exp;

import compartido.Constantes;
import compartido.ErrorAnalisis;
import estructuras.Ambiente;
import estructuras.Nodo;
import estructuras.Sim.Simbolo;

/**
 *
 * @author rich
 */
public class Id extends Expresion {

    public String identificador;

    public Id(String idVal) {
        this.fila = 0;
        this.columna = 0;
        this.identificador = idVal;
    }

    public Id(String idVal, int fila, int columna) {
        this(idVal);
        this.fila = 0;
        this.columna = 0;
    }

    @Override
    public String grafo() {
        return this.hashCode() + "[label= \" " + this.getClass().getSimpleName() + " : \n" + this.identificador + "\"];\n";
    }

    @Override
    public Valor ejecutar(Ambiente ambiente) {
        try {
            Simbolo simId = ambiente.getSimbolo(this.identificador);
            if (simId != null) {
                return simId.valor;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Constantes.addError(
                new ErrorAnalisis(
                        ErrorAnalisis.TipoError.SEMANTICO,
                        this.fila,
                        this.columna,
                        "El identificador " + this.identificador + " no existe."
                )
        );
        return new Valor();
    }

}
