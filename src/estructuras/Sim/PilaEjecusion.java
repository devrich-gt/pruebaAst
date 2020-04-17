/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.Sim;

import java.util.Stack;

/**
 *
 * @author rich
 */
public class PilaEjecusion {
    public Stack<TablaSimbolos> miPila;

    public PilaEjecusion() {
        this.miPila = new Stack<>();
    }

    public void add(TablaSimbolos tabla) {
        this.miPila.push(tabla);
    }

    public TablaSimbolos pop() {
        return miPila.pop();
    }

    public TablaSimbolos peek() {
        return miPila.peek();
    }

    public void addSim(Simbolo simbolo) {
        this.peek().add(simbolo);
    }

    public Simbolo buscar(String id) {
        for (TablaSimbolos tabla : this.miPila) {
            if (tabla.containsKey(id)) {
                return tabla.getKey(id);
            }
        }
        return null;
    }
    
    public boolean contains(String id) {
        for (TablaSimbolos tabla : this.miPila) {
            if (tabla.containsKey(id)) {
                return true;
            }
        }
        return false;
    }

    public String reportePila() {
        String cadena = Simbolo.getCabecera();
        for (TablaSimbolos tabla : this.miPila) {
            cadena += tabla.getCadenaTabla();
        }
        return cadena;
    }
    
    public String reportePilaTable() {
        String cadena = "<table>" + Simbolo.getCabecera();
        this.reportePila();
        cadena += "</table>";
        return cadena;
    }
}
