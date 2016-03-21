package com.parametrizaciongenerics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Imprime<String> impString = new Imprime<String>("Hola mundo");  
    impString.imprimir();  
  
    Imprime<Integer> impInteger = new Imprime<Integer>(143);  
    impInteger.imprimir();  
    
    Divisor<Integer> divideAlgo = new Divisor<Integer>(20);
    divideAlgo.dividir();
    
    Sumador<Integer,Integer> sumarDosNumeros = new Sumador<Integer, Integer>(20, 20);
    sumarDosNumeros.sumar();
    
    
    
    ImprimeAlRevez imprimeAlRevez = new ImprimeAlRevez();
    
    String cadena = "Hola";  
    Integer entero = new Integer(12);  
    Float flotante = new Float(13.6);  
    Object objeto = new Object();  
  
    imprimeAlRevez.imprimir_reves(cadena);  
    imprimeAlRevez.imprimir_reves(entero);  
    imprimeAlRevez.imprimir_reves(flotante);  
    imprimeAlRevez.imprimir_reves(objeto); 
    
    
    
    }
}
