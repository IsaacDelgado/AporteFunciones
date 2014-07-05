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
public class ejercicio16 {
    public int ej16(int x,int y,int z) {
        
        int [] cadena = null;
        
        int valor=z-y;
        int resltado=0,i=0;
        if (x>255||y>255||z>255||x<=0||y<=0||z<=0) {
            resltado=-1;
            i=z;
        }
        else{
            if (y>z) {
            resltado=0;
            i=z;
            }
        }
        
        for (int j =i; j < z; j++) {
            
            x=x*valor;
            valor=valor+2;
            cadena[j]=x;
            
        }
        for (int m = 0; m <z; m++) {
            if (m>(y-1)) {
              resltado=resltado+cadena[m];  
            }

        }
        
        
        return ( resltado);
    }
    
}
