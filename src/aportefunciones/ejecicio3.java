/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aportefunciones;

import java.awt.Event;

/**
 *
 * @author V1C70R MU3N735
 */
public class ejecicio3 {
    public int ej3(int x,int y){
        int[] f1=new int[y];
        if (x<=0 ||y<=0 || x>255||y>255 )
        {
            return -1;
        }
        else
        {
             
             f1[0]=x;
             int n1;
            
            for (int i = 1;i<f1.length; i++) 
            {
               n1=x/(i+1);
               f1[i]=n1;           
            }
            for (int i = 0; i < f1.length; i++) 
            { 
              if(i==(y-1))
                {
                    return (f1[i]);
                   
                }  
              
            }
        }
       return f1[255] ;
    }
}


