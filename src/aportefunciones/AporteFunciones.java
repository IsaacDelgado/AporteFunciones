/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aportefunciones;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class AporteFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ejerc1();
        
    }

    public static void ejerc1(){
    ejercicio1 ejr1=new ejercicio1();
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese Valor X");
        int x = entrada.nextInt();
        System.out.println("Ingrese Valor Y");
        int y= entrada.nextInt();

        System.out.println("El resultado de la función es: "+ejr1.ej1(x,y));
    }
    
}
