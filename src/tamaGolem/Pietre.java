package tamaGolem;

import java.util.ArrayList;

public class Pietre {

	private final static String DESCRIZIONE = "Sono rimaste %d pietre del tipo %s";
	private final static String DISPONIBILITA = "Scegliere tra le pietre disponibili: %s";

	private final static int NUMERO_PIETRE_TOTALI = 10;

	ArrayList<Integer> scortaComune;
	ArrayList<Integer> pietreTamaGolem;

	private int oxygen = 0;
	private int hydrogen = 0;
	private int radon = 0;
	private int caesium = 0;

	public Pietre() {
		this.scortaComune = new ArrayList<Integer>();
	}

	public void aggiungiPietreOxygen() {
		scortaComune.add(oxygen);

	}

	public void aggiungiPietreHydrogen() {
		scortaComune.add(hydrogen);

	}

	public void aggiungiPietreRadon() {
		scortaComune.add(radon);

	}

	public void aggiungiPietreCaesium() {
		scortaComune.add(caesium);

	}

	public int getOxygen() {
		return oxygen;
	}

	public void setOxygen(int oxygen) {
		this.oxygen = oxygen;
	}

	public int getHydrogen() {
		return hydrogen;
	}

	public void setHydrogen(int hydrogen) {
		this.hydrogen = hydrogen;
	}

	public int getRadon() {
		return radon;
	}

	public void setRadon(int radon) {
		this.radon = radon;
	}

	public int getCaesium() {
		return caesium;
	}

	public void setCaesium(int caesium) {
		this.caesium = caesium;
	}

	public int sceltaPietre(int i) {
		return scortaComune.get(i);
	}

	public String toString() {
		return String.format(DISPONIBILITA);
	}

}
