package tamaGolem;

public class Scontro {

	private static final String RIVELAZIONE_EQUILIBRIO = " MATRICE DELLA RIVELAZIONE DELL ' EQUILIBRIO";

	/*
	 * metodo che gestisce la battaglia
	 */
	public void inizioBattaglia(Giocatore giocatore1, Giocatore giocatore2) {

		int i = 0;
		int j = 0;
		int end = 0;
		int ValoreMatrice;

		Equilibrio equi = new Equilibrio();
		equi.creaMatrice();
		;

		TamaGolem GolemG1;
		TamaGolem GolemG2;

		do {

			GolemG1 = giocatore1.Evocazione(i); // evocazione primo Golem giocatore1

			GolemG2 = giocatore2.Evocazione(j); // evocazione primo Golem giocatore2

			for (int h = 0; h < 3; h++) {

				int valorePietraG1 = GolemG1.arrayPietre(h);
				int valorePietraG2 = GolemG2.arrayPietre(h);

				ValoreMatrice = equi.matrice[valorePietraG1][valorePietraG2];

				if (ValoreMatrice < 0) {
					GolemG1.setVita(GolemG1.getVita() - Math.abs(ValoreMatrice));
					System.out.println("Golem del giocatore 1 perde " + Math.abs(ValoreMatrice) + "vita");
				} else
					GolemG2.setVita(GolemG2.getVita() - Math.abs(ValoreMatrice));
				System.out.println("Golem del giocatore 2 perde " + Math.abs(ValoreMatrice) + "vita");

				if (giocatore1.Evocazione(i).isDie()) {
					
					giocatore1.eliminaGolemDie(i);

					if (giocatore1.squadraEmpty()) {
						System.out.println("Il giocatore 2 ha vinto");
						rivelazioneEquilibrio(equi);

						end = 1;
					} else
						giocatore1.Evocazione(i); // secondo Golem

				}

				if (giocatore2.Evocazione(j).isDie()) {
					
					giocatore2.eliminaGolemDie(j);

					if (giocatore1.squadraEmpty()) {
						System.out.println("Il giocatore 2 ha vinto");
						rivelazioneEquilibrio(equi);
						equi.stampaMatrice();
						end = 1;
					} else
						giocatore1.Evocazione(j); // secondo Golem

				}

			}

		} while (end != 1);
	}

	/*
	 * metodo per la stampa della matrice dell'equilibrio
	 */
	private void rivelazioneEquilibrio(Equilibrio equi) {
		// TODO Auto-generated method stub
		System.out.println(RIVELAZIONE_EQUILIBRIO);
		equi.stampaMatrice();

	}

}
