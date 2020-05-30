package tamaGolem;

public class Scontro {

	public void inizioBattaglia(Giocatore giocatore1, Giocatore giocatore2) {

		
		int i = 0;
		int j = 0;
		int end = 0;
		int ValoreMatrice  ; 
		
		Equilibrio equi = new Equilibrio();
		equi.Matrice();
		
		TamaGolem Golem1;
		TamaGolem Golem2;
		
		do {

			Golem1 = giocatore1.Evocazione(i); // evocazione primo Golem giocatore1

			Golem2 = giocatore2.Evocazione(j); // evocazione primo Golem giocatore2

			for ( int h = 0 ; h < 3 ;h++ ) {
				int valorePietra1 = Golem1.arrayPietre(h); 
				int valorePietra2 = Golem2.arrayPietre(h);
			
				ValoreMatrice = equi.matrice[valorePietra1][valorePietra2];
				System.out.println("ciao");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			/*
			 * 
			 * COMBATTIMENTO DA AGGIUNGERE
			 * 
			 * 
			 */
/*
			// CONTORLLO VINCITA
			if (giocatore1.Evocazione(i).isDie()) {

				if (giocatore1.squadraEmpty()) {
					System.out.println("Il giocatore 2 ha vinto");
					end = 1;
				} else
					giocatore1.Evocazione(i++); // secondo Golem

			}

			if (giocatore2.Evocazione(i).isDie()) {

				if (giocatore2.squadraEmpty()) {
					System.out.println("Il giocatore 2 ha vinto");
					end = 1;
				} else
					giocatore2.Evocazione(i++); // secondo Golem

			}

*/
		} while (end != 1);
	}

}
