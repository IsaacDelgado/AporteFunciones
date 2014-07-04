/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aportefunciones;



/**
 *
 * @author Isaac
 */
public class ejercicio8 {
    
    public int ej8(String s1) {
        // TODO code application logic here
        int contador=0;
        s1=" "+s1;
        int tamano= s1.length();
        char[] cadena=s1.toCharArray();
        

        for (int i = 0; i < tamano; i++) {
            if ((cadena[i]=='a')||cadena[i]=='A') {
                contador++;
                for (int j = i; j < tamano; j++) {
                    if (cadena[i]==' ') {
                        i=j;
                        j=tamano;
                    }
                }
            }
            
           
        }
        if (contador==0) {
            System.out.println("No hay Palabras que contengas la letra 'a'");
        }
        else{
            System.out.println("El número de palabras que contienen la letra a es : ");
        }
        return contador;
    }
    
}
