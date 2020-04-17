package compartido;

import compartido.*;

/**
 *
 * @author rich
 */
public class Constantes {
    public static String salida = "";
    public static String NULL = "null";
    public static TablaError errores = new TablaError();
    
    public static void addError(ErrorAnalisis error){
        Constantes.errores.add(error);
    }
    
    public static void setSalida(String imprimir){
        Constantes.salida += imprimir + "\n";
    }

}
