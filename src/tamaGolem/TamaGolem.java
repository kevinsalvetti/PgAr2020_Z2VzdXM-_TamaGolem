package tamaGolem;

public class TamaGolem {

	private String nome;
	private int vita;
	private String[] pietre;

	public TamaGolem(String _nome, int _vita, String[] _pietre) {
		this.nome = _nome;
		this.vita = _vita;
		this.pietre = _pietre;
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
		vita = vita;
	}

	public String[] getPietre() {
		return pietre;
	}

	public void setPietre(String[] pietre) {
		this.pietre = pietre;
	}

	public boolean isDie() {
		return getVita() == 0;
	}

}
