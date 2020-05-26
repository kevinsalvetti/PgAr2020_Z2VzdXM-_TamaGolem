package tamaGolem;

import java.util.ArrayList;

import mylib.*;

public class Main {

	private final static String MESS_BENVENUTO = "BENVENUTO IN TAMAGOLEM!";
	private final static String CHOOSE_OPTIONS = "Scegli cosa fare: ";
	private static final String MESS_ARRIVEDERCI = "Nel nome del padre, del figlio e dello spirito santo\nAndate in pace!";
	private static final String MESS_ERROR = "ATTENZIONE, SEI STRONZO!";

	private final static String[] MAIN_MENU_ITEMS = { "Vai allo scontro" };

	
	private final static int MAX_VITA_GOLEM = 100; // DA settare
	
	
	private final static int NUM_PIETRE = 5;
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
				// vai allo scontro

				Giocatore giocatore1 = new Giocatore("giocatore 1");
				
				for (int i = 0; i < 3 ; i++) {
					giocatore1.addSquadra(new TamaGolem(MAX_VITA_GOLEM, null));	
				}
				
				Giocatore giocatore2 = new Giocatore("giocatore 2");
				for (int i = 0; i < 3 ; i++) {
					giocatore2.addSquadra(new TamaGolem(MAX_VITA_GOLEM, null));	
				}
				
				Scontro battaglia = new Scontro(); 
				
				battaglia.inizioBattaglia(giocatore1 , giocatore2);
				
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
