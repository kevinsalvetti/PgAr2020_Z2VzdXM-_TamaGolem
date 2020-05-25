package tamaGolem;

import java.util.ArrayList;

public class Giocatore {

	private static final int NUM_MAX_TAMAGOLEM = 3;
	private static final int MAX_VITA_TAMAGOLEM = 100;

	private static final String INSERT_NOME_GOLEM = "Inserisci il nome del TamaGolem";

	private String nome;

	ArrayList<TamaGolem> squadraGolem = new ArrayList<TamaGolem>();

	public Giocatore(String nome, ArrayList<TamaGolem> _Golem) {
		this.nome = nome;
		this.squadraGolem = _Golem;
	}

	int count = 1;

	public TamaGolem evocazioneGolem() {

		TamaGolem Golem = new TamaGolem(mylib.InputDati.leggiStringaNonVuota(INSERT_NOME_GOLEM + count),
				MAX_VITA_TAMAGOLEM, null); // null a pietre non essendo ancora create

		count++;
		if (count == 4)
			count = 0;

		return Golem;
	}
	
	
	
	
	
}
/*
 * public void eliminaTamaMorto() {
 * 
 * for (int i = 0; i <= NUM_MAX_TAMAGOLEM; i++) {
 * 
 * if (squadraTamaGolem.get(i).getVita() <= MIN_VITA_TAMAGOLEM) {
 * squadraTamaGolem.remove(i); } } }
 * 
 * public boolean perso() { if (squadraTamaGolem.isEmpty()) { return true; }
 * else return false; }
 * 
 * public String getNome() { return nome; }
 * 
 * public void setNome(String nome) { this.nome = nome; }
 * 
 * }
 */
