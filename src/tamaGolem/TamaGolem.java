package tamaGolem;

public class TamaGolem {

	private final static int MIN_VITA_GOLEM = 0;
	
	//private String nome;
	private int vita;
	private String[] pietre;

	public TamaGolem(/*String nome,*/ int vita, String[] pietre) {
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

	public String[] getPietre() {
		return pietre;
	}

	public void setPietre(String[] pietre) {
		this.pietre = pietre;
	}

	public boolean isDie() {
		return (getVita() == MIN_VITA_GOLEM);
	}
	
	
}
