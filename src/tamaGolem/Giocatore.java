package tamaGolem;

import java.util.ArrayList;

public class Giocatore {

	private String nome;
	private ArrayList<TamaGolem> squadraGolem;

	/*
	 * istanziamento del costruttore del giocatore
	 */
	public Giocatore(String _nome) {
		this.nome = _nome;
		this.squadraGolem = new ArrayList<TamaGolem>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TamaGolem addSquadra(TamaGolem golem) {
		squadraGolem.add(golem);
		return golem;
	}

	public TamaGolem Evocazione(int i) {
		return squadraGolem.get(i);
	}

	public TamaGolem eliminaGolemDie(int i) {
		return squadraGolem.remove(i);
	}

	public boolean squadraEmpty() {
		if (squadraGolem.isEmpty())
			return true;
		else
			return false;

	}
}