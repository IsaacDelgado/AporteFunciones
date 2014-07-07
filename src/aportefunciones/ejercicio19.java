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
public class ejercicio19 {
    public int ej19(int x){
        int coc = 0, res=0,binario = 0;
        while (x >= 2){
                coc = x / 2;
                res = x % 2;
                x = coc;
                if (res == 1) {
                    binario++;
            }
        }
        return binario;
    }
}
