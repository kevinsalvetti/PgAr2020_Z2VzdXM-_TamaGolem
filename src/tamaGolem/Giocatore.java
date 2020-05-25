package tamaGolem;

import java.util.ArrayList;

public class Giocatore {

	private static final int NUM_MAX_TAMAGOLEM = 3;
	
	private static final int MIN_VITA_TAMAGOLEM = 0;
	
	

	int count = 1;  // per tenere conto del numero di Golem nell' inserimento del nome 
	
	private String nome;
	ArrayList<TamaGolem> squadraGolem = new ArrayList<TamaGolem>();

	
	public Giocatore(String nome, ArrayList<TamaGolem> squadraGolem) {
		this.nome = nome;
		this.squadraGolem = squadraGolem;
	}

	
	

	
	
	
	
	
	
	
	
	public void eliminaTamaMorto() {

		for (int i = 0; i <= NUM_MAX_TAMAGOLEM; i++) {

			if (squadraGolem.get(i).getVita() <= MIN_VITA_TAMAGOLEM) {
				squadraGolem.remove(i);
			}
		}
	}
	
	public boolean perso() {
		if (squadraGolem.isEmpty()) {
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
