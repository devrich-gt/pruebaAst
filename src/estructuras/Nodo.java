/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import estructuras.exp.Valor;

/**
 *
 * @author rich
 */
public abstract class Nodo {

    public int fila = 0;
    public int columna = 0;

    public abstract String grafo();

    public abstract Valor ejecutar(Ambiente ambiente);
}
