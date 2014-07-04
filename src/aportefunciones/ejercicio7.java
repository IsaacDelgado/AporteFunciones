/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aportefunciones;

/**
 *
 * @author V1C70R MU3N735
 */
public class ejercicio7 {
    public String ej7(String s1)
    {
     int convertidor;
        char x;
        String a="";
             
        
        int dimension = s1.length();    
        char [] frase= s1.toCharArray();    
        for (int i = 0; i < dimension; i++)
        {
            if (s1.codePointAt(i)>=65 && s1.codePointAt(i)<=90)
            {
                convertidor = s1.codePointAt(i);
                convertidor =convertidor+32;
                x=(char)convertidor; 
                a=a+x;                    
            }
            else                  
            {
                a=a+frase[i];                    
            }          
        }
        return a;
    }
}
