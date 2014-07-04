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
public class ejercicio10 {
   
    public int ej10(int x,int y) {
        
        int sumaResiduo=0;
        
         
        for (int i = x; i <= y; i++) {
            sumaResiduo=0; 
            for (int j = 1  ; j < i; j++) {
                if ((i % j)==0) {
                    sumaResiduo =sumaResiduo+j;
                }
                if ((i==y)&&((i%j)!=0)) {
                    sumaResiduo=0; 
                }
            }
            if (sumaResiduo==i) {
                
                i=y;
            }
        }
            if(sumaResiduo==0) {
                System.out.println("no hay números perfectos ente "+ x+" y "+y);
            }
            
            return sumaResiduo;
    }
}
