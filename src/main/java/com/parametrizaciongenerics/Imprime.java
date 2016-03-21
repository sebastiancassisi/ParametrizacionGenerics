package com.parametrizaciongenerics;

/*
 clase que almacene un objeto, con su getter y setter, y que permita imprimir la cadena que lo representa.
 */
public class Imprime<T> {

    private T objeto;

    public Imprime(T objeto) {
        this.objeto = objeto;
    }

    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {
        return objeto;
    }

    public void imprimir() {
        System.out.println(objeto.toString());
    }

}
