/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.Sim;

import estructuras.Nodo;
import estructuras.exp.TipoDato;
import estructuras.exp.Valor;

/**
 *
 * @author rich
 */
public class Simbolo {

    public enum Rol {
        CLASE, CONSTRUCTOR, VARIABLE, FUNCION, PARAMETRO
    }

    public enum Ambito {
        LOCAL, GLOBAL
    }
    public String nombre = "";
    public Simbolo.Rol rol = Simbolo.Rol.VARIABLE;
    public String ambito = "";
    public TipoDato tipo = new TipoDato();
    public Valor valor = new Valor();
    public String ambitoClase;

    public Nodo ptrNodo;
    public TablaSimbolos tabla = new TablaSimbolos();
    public int numeroParametro = 0;

    public Simbolo(){}
    
    public Simbolo(String nombre,Valor valor) {
        this.nombre = nombre;
        this.rol = Rol.VARIABLE;
        this.ambito = Ambito.GLOBAL.toString();
        this.ambitoClase = "";
        this.valor = valor;
    }   
    
    
    public static String getCabecera() {
        String cadena = "";
        cadena += "<tr>\n";
        cadena += "\t<td>NOMBRE</td>\n";
        cadena += "\t<td>ROL</td>\n";
        cadena += "\t<td>TIPO</td>\n";
        cadena += "\t<td>AMBITO</td>\n";
        cadena += "\t<td>AMBITO G</td>\n";
        cadena += "\t<td>Valor</td>\n";
        cadena += "</tr>\n";
        return cadena;
    }

    public String getFila() {
        String cadena = "";
        cadena += "<tr>\n";
        cadena += "\t<td>" + this.nombre + "</td>\n";
        cadena += "\t<td>" + this.rol + "</td>\n";
        cadena += "\t<td>" + this.valor.tipo + "</td>\n";
        cadena += "\t<td>" + this.ambito + "</td>\n";
        cadena += "\t<td>" + this.ambitoClase + "</td>\n";
        cadena += "\t<td>" + this.numeroParametro + "</td>\n";
        cadena += "\t<td>" + this.valor.toString() + "</td>\n";
        cadena += "</tr>\n";
        cadena += this.tabla.getCadenaTabla();
        return cadena;
    }

    @Override
    public String toString() {
        return "(" + this.valor.tipo + ")" + this.valor.toString();
    }

    public Simbolo getClon() {
        Simbolo clon = new Simbolo();

        clon.nombre = this.nombre;
        clon.rol = this.rol;
        clon.ambito = this.ambito;
        clon.tipo = this.tipo.getClon();
        clon.valor = this.valor.getClon();
        clon.ambitoClase = this.ambitoClase;
        clon.tabla = this.tabla.getClon();
        clon.numeroParametro = this.numeroParametro;
        clon.ptrNodo = this.ptrNodo;

        return clon;

    }

    public boolean containsKey(String key) {
        return this.tabla.containsKey(key);
    }

    public Simbolo getKey(String key) {
        return this.tabla.getKey(key);
    }

}
