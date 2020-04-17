/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.Sim;

import compartido.Constantes;
import compartido.ErrorAnalisis;
import estructuras.Sim.Simbolo.Rol;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author rich
 */
public class TablaSimbolos {

    public String nombre;
    Map<String, Simbolo> tabla = new LinkedHashMap<>();
    int conParametro = 0;

    public TablaSimbolos() {
        this.nombre = "";
    }

    public TablaSimbolos(String nombre) {
        this.nombre = nombre;
    }

    public String getCadenaTabla() {
        String cad = "";
        for (String key : this.tabla.keySet()) {
            Simbolo simbolo = this.tabla.get(key);
            cad += simbolo.getFila();
        }
        return cad;
    }

    public String getReporteTabla() {
        String cad = "";
        cad += "<table>" + Simbolo.getCabecera() + this.getCadenaTabla() + "</table>";
        return cad;
    }

    public boolean containsKey(String key) {
        return this.tabla.containsKey(key);
    }

    public Simbolo getKey(String Key) {
        if (this.containsKey(Key)) {
            return this.tabla.get(Key);
        }
        return null;
    }

    public Simbolo getParametro(int index) {
        for (String key : this.tabla.keySet()) {
            Simbolo simbolo = this.tabla.get(key);
            if (simbolo.numeroParametro == index) {
                return simbolo;
            }
        }
        return null;
    }

    public void add(Simbolo simbolo) {
        if (this.containsKey(simbolo.nombre)) {
            System.err.println("Error: este simbolo ya existe" + simbolo.nombre);
            Constantes.addError(
                    new ErrorAnalisis(
                            ErrorAnalisis.TipoError.SEMANTICO,
                            -1,
                            - 1,
                            "El identificador " + simbolo.nombre + " ya  existe."
                    )
            );
        } else {
            if (simbolo.rol == Rol.PARAMETRO) {
                simbolo.numeroParametro = this.conParametro;
                this.conParametro++;
            }
            this.tabla.put(simbolo.nombre, simbolo);
        }
    }

    public TablaSimbolos getClon() {
        TablaSimbolos clon = new TablaSimbolos(this.nombre + "");
        for (String key : this.tabla.keySet()) {
            clon.add(this.tabla.get(key).getClon());
        }
        return clon;
    }

}
