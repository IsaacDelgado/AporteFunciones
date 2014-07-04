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
public class ejercicio9 {
    public boolean ej9(int x){
    
    
         int cont=0; boolean sol;
        for (int i = 0; i < 2; i++) 
        {
            if (x>0)
            {
                i=2;
            }
            else
            {
                i=0;
                System.out.println("Debe de Ingresar Valores Enteros Positivos es Decir Numeros Mayores a 0");
                
            }  
        }        
        long[] arreglo=new long[x];
        for (int i = 0; i < arreglo.length; i++) 
        {
            arreglo[i]=i*i;           
        }
        for (int i = 0; i < arreglo.length; i++) 
        {
            if (x==arreglo[i])
            {
                i=arreglo.length;
                cont=1;
            }
        }
        if (cont==1 || x==1)
        {
            sol=true;
       
        }
        else
        {
            sol=false;
    
        }        
    return sol;
    }
    }

