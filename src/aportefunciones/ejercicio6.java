/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aportefunciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Isaac
 */
public class ejercicio6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Salida="";
        String frase=JOptionPane.showInputDialog(null,"Ingrese una frase","--->Ingrese la Frase Aquí<---");
        String []cadena=frase.split(" ");
        for(int i=cadena.length-1;i>=0;i--)
        {
            Salida=Salida+cadena[i]+" ";            
        }
        JOptionPane.showMessageDialog(null,"Frase Original ->"+ frase+"\n"+"Frase Invertida ->"+Salida,"Invertir Frase",JOptionPane.PLAIN_MESSAGE);
    }
    
}
