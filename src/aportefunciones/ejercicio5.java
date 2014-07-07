/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aportefunciones;

import java.util.Scanner;

/**
 *
 * @author V1C70R MU3N735
 */
public class ejercicio5 {
    
       
        public int [] ej5(int arreglo[]){
            Scanner entrada=new Scanner(System.in);
        
        
        int c=0;long result = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el valor número "+(i+1)+" del vector");
            int valor=entrada.nextInt();

            arreglo[i]=valor;
        }
         int i, j, vectorAux;
         for(i=0;i<arreglo.length-1;i++)
              for(j=0;j<arreglo.length-i-1;j++)
                   if(arreglo[j+1]<arreglo[j]){
                      vectorAux=arreglo[j+1];
                      arreglo[j+1]=arreglo[j];
                      arreglo[j]=vectorAux;
                   } 
         System.out.println("Vector con numeros ingresados \n");
         for ( i = 0; i < arreglo.length; i++) {
             System.out.println( arreglo[i]) ; 
        }
         System.out.println(" \n El vector sin numeros repetidos \n" );
         int a1;
         for ( i = 0; i < arreglo.length; i++) {
             if (i==0) {
                 System.out.println(arreglo[i]);
             }
             else
             {
                 a1=i-1;
                 vectorAux=arreglo[i];
             if (vectorAux==arreglo[a1]) {
                 
             }else{
                 System.out.println(arreglo[i]);
             }
             }
             
              
            
        }
    return  arreglo;
}}
