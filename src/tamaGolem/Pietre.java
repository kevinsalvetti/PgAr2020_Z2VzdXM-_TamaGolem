package tamaGolem;

import java.util.ArrayList;

public class Pietre {

	private final static String DESCRIZIONE = "Sono rimaste %d pietre del tipo %s";
	private final static String DISPONIBILITA = "Scegliere tra le pietre disponibili: %s";

	private final static int NUMERO_PIETRE_TOTALI = 10;

	ArrayList<Pietre> scortaComune;
	ArrayList<Pietre> pietreTamaGolem;

	public enum Pietra {
		OXYGEN,
		HYDROGEN,
		RADON,
		CAESIUM,
		XENON
	}

	public Pietre() {
		this.scortaComune = new ArrayList<Pietre>();
		this.pietreTamaGolem = new ArrayList<Pietre>();
	}

	
	
	public Pietre aggiungiPietre() {
		scortaComune.add();
		
		return _pietre;
	}

	public Pietre sceltaPietre(int i) {
		return scortaComune.get(i);
	}

	
	public String toString() {
		return String.format(DISPONIBILITA, );
	}

}
