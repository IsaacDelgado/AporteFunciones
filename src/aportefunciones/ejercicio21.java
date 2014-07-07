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
public class ejercicio21 {
    public static int[][] generarMatrizCaracol(int n, int x) {
        
   int[][] M = new int[n + 1][n + 1];
   for (int a = 1; a <= n / 2; a++) {
      for (int i = a; i <= n - a; i++) {
         M[a][i] = x;
         x++;
      }
      for (int i = a; i <= n - a; i++) {
         M[i][n - a + 1] = x;
         x++;
      }
      for (int i = n - a + 1; i >= a + 1; i--) {
         M[n - a + 1][i] = x;
         x++;
      }
      for (int i = n - a + 1; i >= a + 1; i--) {
         M[i][a] = x;
         x++;
      }
   }
   if (n % 2 == 1) {
      M[n / 2 + 1][n / 2 + 1] = x;
   }
   return M;
}
}
