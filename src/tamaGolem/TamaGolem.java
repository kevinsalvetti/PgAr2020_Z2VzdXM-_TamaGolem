package tamaGolem;

import java.util.ArrayList;

public class TamaGolem {

	private final static int MIN_VITA_GOLEM = 0;
	
	//private String nome;
	private int vita;
	private ArrayList<Integer> pietre;

	public TamaGolem(/*String nome,*/ int vita, ArrayList<Integer> pietre) {
		//this.nome = nome;
		this.vita = vita;
		this.pietre = pietre;
	}

//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}

	public int getVita() {
		return vita;
	}

	public void setVita(int vita) {
		this.vita = vita;
	}

	public ArrayList<Integer> getPietre() {
		return pietre;
	}

	public void setPietre(ArrayList<Integer> pietre) {
		this.pietre = pietre;
	}
	
	public int arrayPietre(int i) {
		return pietre.get(i);
	}

	public boolean isDie() {
		return (getVita() == MIN_VITA_GOLEM);
	}
	
	public void addPietra(int P) {
		pietre.add(P);
	}
	
}
