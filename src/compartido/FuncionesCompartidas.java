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
public class FuncionesCompartidas {
    public static String getString(String cadena) {
        if (cadena.length() == 2) {
            cadena = cadena.replace("\"", "");
            cadena = cadena.replace("'", "");
        } else if (cadena.length() > 2) {
            //primero remover las comillas de inicio
            cadena = cadena.substring(1, cadena.length() - 1);
            cadena = cadena.replace("\\n", "\n");
            cadena = cadena.replace("\\'", "\'");
            cadena = cadena.replace("\\t", "\t");
            cadena = cadena.replace("\\\"", "\"");
        }
        return cadena;
    }

    public static String getStringG(String cadena) {

        cadena = cadena.replace("\"", "\\\"");
        cadena = cadena.replace("\\", "");

        return cadena;
    }
}
