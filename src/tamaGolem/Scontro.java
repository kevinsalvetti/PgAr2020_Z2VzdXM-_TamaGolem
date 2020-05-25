package tamaGolem;

import java.util.ArrayList;

public class Scontro {
	
	private final static String INSERT_NOME_GIOCATORE = "Inserisci il nome del Giocatore ";

	private static final int NUM_MAX_TAMAGOLEM = 3;
	
	public void creaGiocatori() {
		Giocatore Giocatore1 = nuovoGiocatore();
		Giocatore Giocatore2 = nuovoGiocatore();
	}
	
	private static Giocatore nuovoGiocatore() {
	
	Giocatore giocatoreCreato = new Giocatore(mylib.InputDati.leggiStringaNonVuota(INSERT_NOME_GIOCATORE),_);
	
	return giocatoreCreato;
	
}

	private static ArrayList<TamaGolem> squadraGolem() {
		
			
			
					
		return squadraGolem();
	}
	
}
