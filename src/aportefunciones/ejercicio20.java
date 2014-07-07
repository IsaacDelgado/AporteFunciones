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
public class ejercicio20 {
    public int ej20(int x){
        int total = x;
        int count = 0;
	  for(int numParts=1; numParts<=total; ++numParts) {
	    count += ejr20(x, numParts);
	  }
	  return count;
    }
    
    public int ejr20(int sum, int numParts) {
	  if ( numParts > sum ) {
	    return 0;
	  } else if ( numParts == sum ) {
	    return 1;
	  } else {
	    return ejr20(sum-1, numParts-1) +
	           ejr20(sum-numParts, numParts);
	  }
	}  
}
