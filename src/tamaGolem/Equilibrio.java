package tamaGolem;

public class Equilibrio {

	private final static int DIM_RIGHE = 4;
	private final static int DIM_COLONNE = 4;
	private final static int MAGGIORE = 3;
	private final static int MINORE = -3;

	/*
	 * crea l'algoritmo per la matrice 
	 */
	public void creaMatrice() {

		// matrice [i][j];

		int matrice[][];
		matrice = new int[DIM_RIGHE][DIM_COLONNE];

		// ciclo per riempire la matrice
		for (int i = 0; i < DIM_COLONNE; i++) {
			for (int j = 0; j < DIM_RIGHE; j++) {
				if (i == j) {
					matrice[i][j] = 0;

				} else if (i == 0 && j == 1) {
					matrice[i][j] = mylib.EstrazioniCasuali.estraiIntero(MINORE, MAGGIORE);
				} else if (i == 0 && j == 2) {
					matrice[i][j] = mylib.EstrazioniCasuali.estraiIntero(MINORE, MAGGIORE) - 1;
				} else if (i == 0 && j == 3) {
					matrice[i][j] = (matrice[i][1] + matrice[i][2]) * -1;
				} else if (i == 1 && j == 0) {
					matrice[i][j] = -(matrice[0][1]);
				} else if (i == 1 && j == 2) {
					matrice[i][j] = mylib.EstrazioniCasuali.estraiIntero(MINORE, MAGGIORE) - 1;
				} else if (i == 1 && j == 3) {
					matrice[i][j] = (matrice[1][0] + matrice[1][2]) * -1;
				} else if (i == 2 && j == 0) {
					matrice[i][j] = -(matrice[0][2]);
				} else if (i == 2 && j == 1) {
					matrice[i][j] = -(matrice[1][2]);
				} else if (i == 2 && j == 3) {
					matrice[i][j] = -(matrice[2][0] + matrice[2][1]);
				} else if (i == 3 && j == 0) {
					matrice[i][j] = -(matrice[0][3]);
				} else if (i == 3 && j == 1) {
					matrice[i][j] = -(matrice[1][3]);
				} else if (i == 3 && j == 2) {
					matrice[i][j] = -(matrice[2][3]);
				}

			}
		}

		// ciclo per stampare la matrice
		for (int i = 0; i < DIM_COLONNE; i++) {
			for (int j = 0; j < DIM_RIGHE; j++) {

				System.out.print(matrice[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
}
