/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compartido;

/**
 *
 * @author rich
 */
public class ErrorAnalisis {

    public enum TipoError {
        LEXICO, SINTACTICO, SEMANTICO
    }

    private int fila;
    private int columna;
    private TipoError tipo;
    private String descripcion;
    private String origen;

    public ErrorAnalisis() {
        this.fila = -1;
        this.columna = -1;
        this.tipo = TipoError.SEMANTICO;
        this.descripcion = "";
        this.origen = "";
    }

    public ErrorAnalisis(ErrorAnalisis.TipoError tipo, int fila, int columna, String descripcion) {
        this();
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public ErrorAnalisis(ErrorAnalisis.TipoError tipo, int fila, int columna, String descripcion, String origen) {
        this(tipo, fila, columna, descripcion);
        this.origen = origen;
    }

    public static String getCabecera() {
        String cad = "<tr>";
        cad += "<td>TIPO</td>";
        cad += "<td>FILA</td>";
        cad += "<td>COLUMNA</td>";
        cad += "<td>DESCRPCION</td>";
        cad += "<td>ORIGEN</td>";
        cad += "</tr>";
        return cad;
    }

    @Override
    public String toString() {
        String cad = "<tr>";
        cad += "<td>" + this.tipo + "</td>";
        cad += "<td>" + this.fila + "</td>";
        cad += "<td>" + this.columna + "</td>";
        cad += "<td>" + this.descripcion + "</td>";
        cad += "<td>" + this.origen + "</td>";
        cad += "</tr>";
        return cad;
    }
}
