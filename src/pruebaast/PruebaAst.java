/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaast;

import compartido.Archivo;
import compartido.Compilar;
import compartido.Constantes;
import estructuras.Ambiente;
import estructuras.Nodo;
import estructuras.Sim.TablaSimbolos;

/**
 *
 * @author rich
 */
public class PruebaAst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Constantes.salida = "";
        cup("entradaCup.txt");
        //cc("entradaCC.txt");
        
    }
    
    public static void cup(String nombreArchivo){
        Nodo resultado = Compilar.parserCup(Archivo.read(nombreArchivo));
        if(resultado != null){
            resultado.ejecutar(new Ambiente(new TablaSimbolos("main")));
            Archivo.createFile("salida.txt", Constantes.salida);
            System.out.println(resultado.grafo());
        }
    }
    public static void cc(String nombreArchivo){
        Nodo resultado = Compilar.parserJavaCC(Archivo.read(nombreArchivo));
        if(resultado != null){
            resultado.ejecutar(new Ambiente(new TablaSimbolos("main")));
            Archivo.createFile("salida.txt", Constantes.salida);
        }
    }
}
