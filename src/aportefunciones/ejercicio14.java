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
public class ejercicio14 {
     public int ej14(int x,int y,int z) {
        // TODO code application logic here
        int res1=0, res2=0, aux=0; ;

      
        if(z%2!=0) 
        {            
            z=z+1;
            aux=1;
        }
        int[] array= new int[z];
        int[] array2= new int[z];
        for(int k=0;k<z;k=k+2)
        {          
                array[k]=x;
                array2[k]=y;
                array[k+1]=y;
                array2[k+1]=x;
                res1=array[k];
                res2=array2[k];
                if(aux==0)
                {                  
                   res1=array[k+1];
                   res2=array2[k+1]; 
                }
                x++;
                y++;                           
        }
        
        System.out.println(res1+""+res2+" ");  
        return res1+res2;
    }
}
