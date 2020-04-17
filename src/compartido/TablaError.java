/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compartido;

import java.util.ArrayList;

/**
 *
 * @author rich
 */
public class TablaError {

    private ArrayList<ErrorAnalisis> listaErrores;

    public TablaError() {
        this.listaErrores = new ArrayList<>();
    }

    public void add(ErrorAnalisis error) {
        this.listaErrores.add(error);
    }

    public String getCadenaErrores() {
        String cad = "";
        for (ErrorAnalisis error : this.listaErrores) {
            cad += error.toString();
        }
        return cad;
    }

    public String toString() {
        return "<table>" + ErrorAnalisis.getCabecera() + this.getCadenaErrores() + "</table>";
    }
}
