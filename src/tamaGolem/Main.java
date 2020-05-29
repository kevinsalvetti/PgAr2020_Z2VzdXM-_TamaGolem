package tamaGolem;

import mylib.*;

public class Main {

	private final static String MESS_BENVENUTO = "BENVENUTO IN TAMAGOLEM!";
	private final static String CHOOSE_OPTIONS = "Scegli cosa fare: ";
	private static final String MESS_ARRIVEDERCI = "Nel nome del padre, del figlio e dello spirito santo\nAndate in pace!";
	private static final String MESS_ERROR = "ATTENZIONE, SEI STRONZO!";

	private static final int MAX_PIETRE_GOLEM = 3;

	private static final String INSER_PIETRE = "Quale pietre voi inserire nel Golem ?";

	private final static String[] MAIN_MENU_ITEMS = { "Vai allo scontro" };

	private final static int MAX_VITA_GOLEM = 100; // DA settare

	private final static int NUM_TAMAGOLEM = 3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(MESS_BENVENUTO + "\n\n");

		MyMenu principale = new MyMenu(CHOOSE_OPTIONS, MAIN_MENU_ITEMS);

		boolean fine = false;

		do {
			int voceSelezionata = principale.scegli();

			switch (voceSelezionata) {
			case 1:
				// Creazione equilibrio

				/*
				 * 
				 * 
				 * 
				 */

				// crea Giocatore

				Giocatore giocatore1 = new Giocatore("giocatore 1");
				Pietre pietreGiocatore1 = new Pietre();
				
				for (int i = 0; i < NUM_TAMAGOLEM; i++) {
					pietreGiocatore1.MenuScelta();
					giocatore1.addSquadra(new TamaGolem(MAX_VITA_GOLEM,pietreGiocatore1.pietreTamaGolem )); 
				}

				Giocatore giocatore2 = new Giocatore("giocatore 2");
				Pietre pietreGiocatore2 = new Pietre();
				
				for (int i = 0; i < NUM_TAMAGOLEM; i++) {
					pietreGiocatore2.MenuScelta();
					giocatore2.addSquadra(new TamaGolem(MAX_VITA_GOLEM, pietreGiocatore2.pietreTamaGolem)); 
				}

				// vai allo scontro

				Scontro battaglia = new Scontro();

				battaglia.inizioBattaglia(giocatore1, giocatore2);

				break;

			case 0:
				fine = true;
				System.out.println(MESS_ARRIVEDERCI);
				break;

			default:
				System.out.println(MESS_ERROR);
				break;
			}

		} while (!fine);

	}

}
