package tamaGolem;
import java.util.Random;

public class Equilibrio {
	
	private final static int DIM_RIGHE = 4;
	private final static int DIM_COLONNE = 4;
	private final static double MAGGIORE = 3;
	private final static double MINORE = -3;
	
	public void creaMatrice() {
	
	int matrice [][];
	matrice = new int[DIM_RIGHE][DIM_COLONNE];
		
				
	//ciclo per riempire la matrice
	for(int i=0; i<=DIM_COLONNE; i++) {
	      for(int j=0; j<=DIM_RIGHE; j++) {
	    	  
	    	  if(matrice[i] == matrice[j]) {
	    		  matrice[i][j] = 0;		  
	    	  }
	    	  else if(matrice[i] != matrice[j])
	    	  {
	    		 matrice[i][j] = (int) Math.max(MAGGIORE, Math.random()*MINORE);
	    		 
	    	  }
	   		
	      }
	      
	    
	    }	

	
	//ciclo per stampare la matrice
	for(int i=0; i<=DIM_COLONNE; i++) {
		for(int j=0; j<=DIM_RIGHE; j++) {
			
			System.out.println(matrice[DIM_RIGHE][DIM_COLONNE]+ " ");
			
		}
		System.out.println("");		
	}
	
	
	}
	
	

}
