/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aportefunciones;

import java.util.Arrays;
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
       case 6:
           ejerc6();
           break;
       case 7:
           ejerc7();
           break;
       case 8:
           ejerc8();
           break;
       case 9:
           ejerc9();
           break;
       case 10:
           ejerc10();
           break;
      case 11:
           ejerc11();
           break;
//      case 12:
//           ejerc12();
//           break;
     case 13:
           ejerc13();
           break;
     case 14:
           ejerc14();
           break;
//     case 15:
//           ejerc15();
//           break;
     case 16:
           ejerc16();
           break;
    case 17:
           ejerc17();
           break;
    case 18:
           ejerc18();
           break;
        
      default:
          if (op>24||op<=0) {
              System.out.println("*********Error********\n"
                            + "Entrada fuera de Rango" );
          }else{
          System.out.println("**********Error*********\n"
                            + "Ejercicio No Encontrado" );
          }
           
           break;
      }
        

        
    }
     public static int PedirX(){
     Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese Valor X");
        int x = entrada.nextInt();
        return x ;
     }
    public int valorx(){return PedirX();}
    public int valory(){return PedirY();}
    public int valorz(){return PedirZ();}
    
    public static int PedirY(){
     Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese Valor Y");
       int y= entrada.nextInt();
       return y ;
        }
    public static int PedirZ(){
     Scanner entrada=new Scanner(System.in);
       System.out.println("Ingrese Valor Z");
       int z= entrada.nextInt();
       return z ;
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
        System.out.println("El resultado de la función es: "+ejr5.ej5(arreglo));
    }
        public static void ejerc6(){
         ejercicio6 ejr6=new ejercicio6();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun6());
        String s1 = Cadena1();
        System.out.println("El resultado de la función es: "+ejr6.ej6(s1));
    }
        public static void ejerc7(){
         ejercicio7 ejr7=new ejercicio7();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun7());
        String s1 = Cadena1();
        System.out.println("El resultado de la función es: "+ejr7.ej7(s1));
    }
        public static void ejerc8(){
         ejercicio8 ejr8=new ejercicio8();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun8());
        String s1 = Cadena1();
        System.out.println("El resultado de la función es: "+ejr8.ej8(s1));
    }
         public static void ejerc9(){
         ejercicio9 ejr9=new ejercicio9();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun9());
        int x = PedirX();
        System.out.println("El resultado de la función es: "+ejr9.ej9(x));
    }
        public static void ejerc10(){
         ejercicio10 ejr10=new ejercicio10();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun10());
        int x = PedirX();
        int y = PedirY();
        System.out.println("El resultado de la función es: "+ejr10.ej10(x,y));
    }
        public static void ejerc11(){
         ejercicio11 ejr11=new ejercicio11();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun11());
        int [][]matriz = new int [PedirX()][PedirY()];
        
        System.out.println("El resultado de la función es: "+ejr11.ej11(matriz));
        }
        public static void ejerc13(){
         ejercicio13 ejr13=new ejercicio13();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun13());
        int []array = new int [PedirX()];
        
        System.out.println("El resultado de la función es: "+Arrays.toString(ejr13.ej13(array)));
    }
        public static void ejerc14(){
         ejercicio14 ejr14=new ejercicio14();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun14());
        int x = PedirX();
        int y = PedirY();
        int z=PedirZ();
        System.out.println("El resultado de la función es: "+ejr14.ej14(x,y,z));
    }
         public static void ejerc16(){
         ejercicio16 ejr16=new ejercicio16();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun16());
        int x = PedirX();
        int y = PedirY();
        int z=PedirZ();
        System.out.println("El resultado de la función es: "+ejr16.ej16(x,y,z));
    }
         public static void ejerc17(){
         ejercicio17 ejr17=new ejercicio17();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun17());
        String s1=Cadena1();
        System.out.println("El resultado de la función es: "+ejr17.ej17(s1));
         }
        public static void ejerc18(){
         ejercicio18 ejr18=new ejercicio18();
         enunciados enunc=new enunciados();
        System.out.println(enunc.enun18());
        String array[]= new String [PedirX()];
            for (int i = 0; i < array.length; i++) {
               array[i]= Cadena1();
            }
        System.out.println("El resultado de la función es: "+Arrays.toString(ejr18.ej18(array)));
         }

    
}
