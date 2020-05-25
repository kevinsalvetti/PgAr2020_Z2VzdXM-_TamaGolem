package tamaGolem;

import java.util.ArrayList;

public class Giocatore {

	private final static int NUM_MAX_TAMAGOLEM = 3;
	

	private final static int MIN_VITA_TAMAGOLEM = 0;

	private final static String INSER_NOME = "Inserisci il nome del TamaGolem";

	private String nome;
	private ArrayList<TamaGolem> squadraTamaGolem;

	public Giocatore(String nome) {
		this.nome = nome;
	}


	
	public void Giocatore() {
		
		Giocatore Giocatore1 = nuovoGiocatore();
		Giocatore Giocatore2 = nuovoGiocatore();
	}
	
	
	private static Giocatore nuovoGiocatore() {
		String nome1 = "gigio";
		Giocatore giocatoreCreato = new Giocatore(nome1);
		
		return giocatoreCreato;
		
	}




	public void evocazioneTama() {

		for (int i = 0; i <= NUM_MAX_TAMAGOLEM; i++) {
			
			//TamaGolem tama = new TamaGolem(nome, MAX_VITA_TAMAGOLEM, null); // null a pietre non essendo ancora create
			
			
			//squadraTamaGolem.add(creaTama());
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
