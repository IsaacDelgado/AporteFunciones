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
        Scanner entrada=new Scanner(System.in);
        System.out.println("****************************************\n"
                         + "*************** MENU********************\n"
                         + "Elija uno de los Ejercicios del 1 al 24\n");
        
        int op = entrada.nextInt();
        
        switch ( op ) {
      case 1:
           ejerc1();
           break;
      case 2:
           ejerc2();
           break;
      case 3:
           ejerc3();
           break;
      case 4:
           ejerc4();
           break;
      case 5:
           ejerc5();
           break;
//       case 6:
//           ejerc6();
//           break;
//       case 7:
//           ejerc7();
//           break;
      default:
           System.out.println("*********Error********\n"
                            + "Entrada fuera de Rango" );
           break;
      }
        
        
        
        
//        ejerc1();
//        ejerc2();
//        ejerc3();
//        ejerc4();
        
    }
     public static int PedirX(){
     Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese Valor X");
        int x = entrada.nextInt();
        return x ;
        
        }
    public static int PedirY(){
     Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese Valor Y");
       int y= entrada.nextInt();
       return y ;
        }
        public static String Cadena1(){
     Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese la primera frase");
       String s1= entrada.nextLine();
       return s1 ;
        }
         public static String Cadena2(){
     Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese la segunda frase");
       String s2= entrada.nextLine();
       return s2 ;
        }
    public static void ejerc1(){
    ejercicio1 ejr1=new ejercicio1();
    enunciados enunc=new enunciados();
        System.out.println(enunc.enun1());
        int x = PedirX();
        int y = PedirY(); 
        System.out.println("El resultado de la función es: "+ejr1.ej1(x,y));
        
    }
    public static void ejerc2(){
        ejercicio2 ejr2=new ejercicio2();
        enunciados enunc=new enunciados();
        System.out.println(enunc.enun2());
        int x = PedirX();
        int y = PedirY(); 
        System.out.println("El resultado de la función es: "+ejr2.ej2(x,y));
    }
    
    public static void ejerc3(){
    ejercicio3 ejr3=new ejercicio3();
        enunciados enunc=new enunciados();
        System.out.println(enunc.enun3());
        int x = PedirX();
        int y = PedirY(); 
        System.out.println("El resultado de la función es: "+ejr3.ej3(x,y));
    }
     public static void ejerc4(){
    ejercicio4 ejr4=new ejercicio4();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun4());
        String s1 = Cadena1();
        String s2 = Cadena2();
        System.out.println("El resultado de la función es: "+ejr4.ej4(s1 , s2));
    }
          public static void ejerc5(){
         ejercicio5 ejr5=new ejercicio5();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun5());
        int arreglo[]=new int [PedirX()];
        System.out.println(ejr5.ej5(arreglo));
    }


    
}
