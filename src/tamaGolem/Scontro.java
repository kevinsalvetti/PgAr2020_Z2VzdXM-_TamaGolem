package tamaGolem;

import java.util.ArrayList;

public class Scontro {

	private final static String INSERT_NOME_GIOCATORE = "Inserisci il nome del Giocatore ";

	private static final int NUM_MAX_TAMAGOLEM = 3;
	private static final int MAX_VITA_TAMAGOLEM = 100;
	private static final String INSERT_NOME_GOLEM = "Inserisci il nome del TamaGolem";

	public void creaGiocatori() {
		Giocatore Giocatore1 = new Giocatore(nomeGiocatore(), cresquadraGolem());
		Giocatore Giocatore2 = new Giocatore(nomeGiocatore(), cresquadraGolem());
	}

	private static String nomeGiocatore() {
		return mylib.InputDati.leggiStringaNonVuota(INSERT_NOME_GIOCATORE);
	}

	private ArrayList<TamaGolem> cresquadraGolem() {
		for (int i = 0; i < 2; i++) {

			cresquadraGolem().add(creaGolem()); // ************
		}
		return null;
	}

	private TamaGolem creaGolem() {

		TamaGolem Golem = new TamaGolem(nomeGolem(), MAX_VITA_TAMAGOLEM, null); // null a pietre non essendo ancora
																				// create

		return Golem;
	}

	private static String nomeGolem() {
		return mylib.InputDati.leggiStringaNonVuota(INSERT_NOME_GOLEM);
	}

}
