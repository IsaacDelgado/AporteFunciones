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
public class ejercicio18 {
        public String[] ej18(String[] array){
            
        for(int i=0;i<array.length;i++) {
            for(int j=0;j<array.length-i;j++) {
                if (array[j].compareTo(array[j+1])>0) {
                    String aux;
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
        }
     return array;
    }
}
