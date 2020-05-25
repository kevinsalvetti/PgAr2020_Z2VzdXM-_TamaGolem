package tamaGolem;

public class TamaGolem {

	private final static int MAX_VITA_TAMAGOLEM = 100; // da settare
	
	private String nome;
	private int vita;
	//private String[] pietre;

	public TamaGolem(String _nome, int _vita, String[] _pietre) {
		this.nome = _nome;
		this.vita = _vita;
		//this.pietre = _pietre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVita() {
		return vita;
	}

	public void setVita(int vita) {
		this.vita = vita;
	}

//	public String[] getPietre() {
//		return pietre;
//	}
//
//	public void setPietre(String[] pietre) {
//		this.pietre = pietre;
//	}

	public boolean isDie() {
		return getVita() == 0;
	}

	
	public TamaGolem creaTama () {
		
		TamaGolem tama = new TamaGolem(nome, MAX_VITA_TAMAGOLEM, null);
		nome = "tama";
		tama.setNome(nome);
		tama.setVita(MAX_VITA_TAMAGOLEM);
		//tama.setPietre(pietre);
		
		return creaTama();
	}
}
