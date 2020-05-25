package tamaGolem;

import mylib.*;

public class Main {

	private final static String MESS_BENVENUTO = "BENVENUTO IN TAMAGOLEM!";
	private final static String INSERT_NOME_GIOCATORE = "Inserisci il tuo nome: ";
	private final static String CHOOSE_OPTIONS = "Scegli cosa fare: ";
	private static final String MESS_ARRIVEDERCI = "Nel nome del padre, del figlio e dello spirito santo\nAndate in pace!";
	private static final String MESS_ERROR = "ATTENZIONE, SEI STRONZO!";

	private final static String[] MAIN_MENU_ITEMS = { "Vai allo scontro"};

	private final static int NUM_PIETRE = 5;
	private final static int NUM_TAMAGOLEM = 3;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println(MESS_BENVENUTO + "\n\n");

		Scontro battaglia = new Scontro();

		MyMenu principale = new MyMenu(CHOOSE_OPTIONS, MAIN_MENU_ITEMS);

		boolean fine = false;

		do {
			int voceSelezionata = principale.scegli();

			switch (voceSelezionata) {
			case 1:
				// vai allo scontro
				
				battaglia.creaGiocatori();
				
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
