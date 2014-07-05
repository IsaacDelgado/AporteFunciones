/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aportefunciones;
import java.awt.List;
import java.util.Scanner;
/**
 *
 * @author V1C70R MU3N735
 */
public class ejercicio13 {
    public int[] ej13(int[] array){
        Scanner entrada=new Scanner(System.in);
       
    int array1[] = new int[array.length];
    
    int cont = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese el valor # "+i+" en el vector");
            array[i]=entrada.nextInt();
            
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array1[cont] = array[i];
                cont++;
                }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                array1[cont] = array[i];
                cont++;
                }
        }
        return array1;
    }
    
}
