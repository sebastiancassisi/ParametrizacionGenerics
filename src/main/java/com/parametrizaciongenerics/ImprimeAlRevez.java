/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parametrizaciongenerics;

/**
 *
 * @author cassisi
 */
public class ImprimeAlRevez {
    
    public <T> void imprimir_reves(T objeto) {  
    StringBuilder sb = new StringBuilder(objeto.toString());  
    System.out.println(sb.reverse());  
  }  
    
    
}
