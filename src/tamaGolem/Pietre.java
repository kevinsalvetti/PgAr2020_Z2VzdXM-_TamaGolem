package tamaGolem;

import java.util.ArrayList;

public class Pietre {

	private final static String INSERT_PIETRE = "Che pietre vuoi inserire ?\n1.Oxygen\n2.Hydrogen\n3.Radon\n4.Caesium";
	
	int valorePietra = 0;
	
	ArrayList<Integer> scortaComune;
	ArrayList<Pietre> pietreTamaGolem;

	private Pietre oxygen ;
	private Pietre hydrogen ;
	private Pietre radon ;
	private Pietre caesium ;

	public Pietre() {
		this.scortaComune = new ArrayList<Integer>();
	}

	public void aggiungiPietreOxygen() {
		pietreTamaGolem.add(oxygen);
		
	}

	public void aggiungiPietreHydrogen() {
		pietreTamaGolem.add(hydrogen);

	}

	public void aggiungiPietreRadon() {
		pietreTamaGolem.add(radon);

	}

	public void aggiungiPietreCaesium() {
		pietreTamaGolem.add(caesium);

	}

	public Pietre getOxygen() {
		return oxygen;
	}

	public void setOxygen(Pietre oxygen) {
		this.oxygen = oxygen;
	}

	public Pietre getHydrogen() {
		return hydrogen;
	}

	public void setHydrogen(Pietre hydrogen) {
		this.hydrogen = hydrogen;
	}

	public Pietre getRadon() {
		return radon;
	}

	public void setRadon(Pietre radon) {
		this.radon = radon;
	}

	public Pietre getCaesium() {
		return caesium;
	}

	public void setCaesium(Pietre caesium) {
		this.caesium = caesium;
	}

	public int sceltaPietre(int i) {
		return scortaComune.get(i);
	}

	public void stampaPietre() {
		scortaComune.toString();
	}
	
	
	public void MenuScelta() {
		int scelta = 0;
		System.out.println("quale pietre vuoi inserire ? ");
		System.out.println("1.Oxygen\n2.Hydrogen\n3.Radon\n4.Caesium");
		
		mylib.InputDati.leggiIntero(INSERT_PIETRE, 1, 4);
		
		switch(scelta) {
		case 1:
			aggiungiPietreOxygen();
			break;
		case 2:
			aggiungiPietreHydrogen();
			break;
		case 3:
			aggiungiPietreRadon();
			break;
		case 4:
			aggiungiPietreCaesium();
			break;
		
			
		}
	}
	
	
}
