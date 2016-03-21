package com.parametrizaciongenerics;

// En este caso lo uso para limitar los tipos con los que se puede parametrizar nuestra clase. Como es una division, me interesa que solo puedan entrar clases de tipo numerica.

public class Divisor<T extends Number> {
  private T numero;

  public Divisor(T numero) {
    this.numero = numero;
  }

  public void dividir() {
    System.out.println(numero.doubleValue() / 2);
  }
}