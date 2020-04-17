/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compartido;

import analizador.*;
import estructuras.Nodo;
import java.io.BufferedReader;
import java.io.StringReader;

/**
 *
 * @author rich
 */
public class Compilar {
    private Compilar() {
    }

    public static Nodo parserCup(String entrada) {

        try {
            System.out.println("iniciando parser script...");
            CupSintactico sin = new CupSintactico(
                    new CupLexico(
                            new BufferedReader(
                                    new StringReader(entrada))
                    )
            );
            sin.parse();
            System.out.println("parser script finalizado correctamente.");
            return sin.raiz;
        } catch (Exception ex) {
            System.out.println("error script generando analisis:");
            System.out.println(ex.toString());
            return null;
        }

    }
}
