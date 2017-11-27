package arrieta.com;

import java.sql.Array;

public class Juego {

	
		public boolean valido(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s) {
		
		 int[] anArray = { i,j,k,l,m,n,o,p,q,r,s};
		
		 
	        int size=anArray.length;
	        
	        if (size == 10) {
	        	return true;
	        }
	         return false;	
		
	}
}
