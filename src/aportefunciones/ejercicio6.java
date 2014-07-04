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
public class ejercicio6 {
    /**
     * @param args the command line arguments
     */
public String ej6(String s1){
        String Salida="";
        
        String []cadena=s1.split(" ");
        for(int i=cadena.length-1;i>=0;i--)
        {
            Salida=Salida+cadena[i]+" ";            
        }
        
        System.out.println("Frase Original ->\n"+ s1+"\n"+"Frase Invertida ->");
        return Salida;    
}

    
}
