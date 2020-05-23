package tamaGolem;

import java.util.ArrayList;

public class Giocatore {

	private final static int NUM_MAX_TAMAGOLEM = 3;
	private final static int MAX_VITA_TAMAGOLEM = 100; // da settare

	private final static int MIN_VITA_TAMAGOLEM = 0;

	private final static String INSER_NOME = "Inserisci il nome del TamaGolem";

	private String nome;
	private ArrayList<TamaGolem> squadraTamaGolem;

	public Giocatore(String nome) {
		this.nome = nome;
	}

	public void evocazione() {

		for (int i = 0; i <= NUM_MAX_TAMAGOLEM; i++) {

			TamaGolem tama = new TamaGolem(nome, MAX_VITA_TAMAGOLEM, null); // null a pietre non essendo ancora create

			squadraTamaGolem.add(tama);
		}

	}

	public void eliminaTamaMorto() {

		for (int i = 0; i <= NUM_MAX_TAMAGOLEM; i++) {

			if (squadraTamaGolem.get(i).getVita() <= MIN_VITA_TAMAGOLEM) {
				squadraTamaGolem.remove(i);
			}
		}
	}

	public boolean perso() {
		if (squadraTamaGolem.isEmpty()) {
			return true;
		} else
			return false;
	}

}
