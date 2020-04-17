/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import estructuras.Sim.PilaEjecusion;
import estructuras.Sim.Simbolo;
import estructuras.Sim.TablaSimbolos;

/**
 *
 * @author rich
 */
public class Ambiente {
    
    public PilaEjecusion ambienteEjecusion = new PilaEjecusion();

    public Ambiente(TablaSimbolos tabla) {
        this.ambienteEjecusion.add(tabla);
    }
    
   
    
    public boolean contains(String id) {
        return this.ambienteEjecusion.contains(id);
    }

    public void addSimbolo(Simbolo nuevo) {
        this.ambienteEjecusion.addSim(nuevo);
    }

    public void addAmbiente(TablaSimbolos tabla) {
        this.ambienteEjecusion.add(tabla);
    }

    public Simbolo getSimbolo(String id) {
        return  this.ambienteEjecusion.buscar(id);
    }
    
    public TablaSimbolos pop() {
        return this.ambienteEjecusion.pop();
    }
    
}
