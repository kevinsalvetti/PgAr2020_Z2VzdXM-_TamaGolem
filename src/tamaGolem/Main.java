package tamaGolem;

import java.util.ArrayList;

import mylib.*;

public class Main {

	private final static String MESS_BENVENUTO = "BENVENUTO IN TAMAGOLEM!";
	private final static String CHOOSE_OPTIONS = "Scegli cosa fare: ";
	private final static String MESS_ARRIVEDERCI = "Nel nome del padre, del figlio e dello spirito santo\nAndate in pace!";
	private final static String MESS_ERROR = "ATTENZIONE INPUT NON VALIDO!";

	private final static String OXYGEN = "oxygen";
	private final static String HYDROGEN = "hydrogen";
	private final static String RADON = "radon";
	private final static String CAESIUM = "caesium";

	private final static String[] MAIN_MENU_ITEMS = { "Vai allo scontro" };

	private final static int MAX_VITA_GOLEM = 5; // DA settare

	private final static int NUM_TAMAGOLEM_PER_GIOCATORE = 2; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> scortaComune = new ArrayList<String>();

		System.out.println(MESS_BENVENUTO + "\n\n");

		MyMenu principale = new MyMenu(CHOOSE_OPTIONS, MAIN_MENU_ITEMS);
		boolean fine = false;

		do {
			int voceSelezionata = principale.scegli();

			switch (voceSelezionata) {
			case 1:

				// crea Giocatore

				Giocatore giocatore1 = new Giocatore("giocatore 1");

				addscortaComune(scortaComune);

				

				for (int i = 0; i < NUM_TAMAGOLEM_PER_GIOCATORE; i++) {
					
					Pietre pietreGiocatore1 = new Pietre();
					
					int count = i;

					System.out.println("\nGolem " + (++count) + " del Giocatore 1\n");

					TamaGolem Tama1 = new TamaGolem(MAX_VITA_GOLEM, pietreGiocatore1.MenuSceltaPietre(scortaComune));

					giocatore1.addSquadra(Tama1);
				}

				Giocatore giocatore2 = new Giocatore("giocatore 2");

				

				for (int j = 0; j < NUM_TAMAGOLEM_PER_GIOCATORE; j++) {
					
					Pietre pietreGiocatore2 = new Pietre();
					
					int count = j;

					System.out.println("\nGolem " + (++count) + " del Giocatore 2\n");

					TamaGolem Tama2 = new TamaGolem(MAX_VITA_GOLEM, pietreGiocatore2.MenuSceltaPietre(scortaComune));

					giocatore2.addSquadra(Tama2);
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

	/*
	 * aggiunta pietre alla scorta comune dalla quale tutti giiocatori estrarranno 
	 * le pietre che oreferiscono
	 */
	private static void addscortaComune(ArrayList<String> scortaComune) {

		scortaComune.add(OXYGEN);
		scortaComune.add(OXYGEN);
		scortaComune.add(OXYGEN);
		scortaComune.add(HYDROGEN);
		scortaComune.add(HYDROGEN);
		scortaComune.add(HYDROGEN);
		scortaComune.add(RADON);
		scortaComune.add(RADON);
		scortaComune.add(RADON);
		scortaComune.add(CAESIUM);
		scortaComune.add(CAESIUM);
		scortaComune.add(CAESIUM);
	}

}
