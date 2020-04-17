/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.exp;

import compartido.Constantes;

/**
 *
 * @author rich
 */
public class Valor {

    public TipoDato tipo;
    public Object val;

    public Valor() {
        this.tipo = new TipoDato();
        this.val = new Nulo();
    }

    public Valor(TipoDato tipo, Object val) {
        this();
        this.tipo = tipo;
        this.val = val;
    }

    public Valor(boolean bool) {
        this();
        this.tipo = new TipoDato(TipoDato.TipoDatoPrimitivo.BOOLEAN);
        this.val = bool;
    }

    public Valor(double doble) {
        this();
        this.tipo = new TipoDato(TipoDato.TipoDatoPrimitivo.DOUBLE);
        this.val = doble;
    }

    public Valor(int bool) {
        this();
        this.tipo = new TipoDato(TipoDato.TipoDatoPrimitivo.INT);
        this.val = bool;
    }

    public Valor(char bool) {
        this();
        this.tipo = new TipoDato(TipoDato.TipoDatoPrimitivo.CHAR);
        this.val = bool;
    }

    public Valor(String bool) {
        this();
        this.tipo = new TipoDato(TipoDato.TipoDatoPrimitivo.STRING);
        this.val = bool;
    }

    public Valor getClon() {
        Valor valorClon = new Valor();
        valorClon.tipo = this.tipo.getClon();
        valorClon.val = this.val;
        return valorClon;
    }

    @Override
    public String toString() {
        return this.val.toString();
    }

    /**
     * resultado de un valor booleano para las condiciones
     *
     * @return
     */
    public boolean getBool() {
        try {
            return (boolean) this.val;
        } catch (Exception e) {
            System.out.println("val: " + e.getMessage());
            return false;
        }
    }

}
