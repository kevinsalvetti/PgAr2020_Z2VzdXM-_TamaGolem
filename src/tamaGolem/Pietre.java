package tamaGolem;

import java.util.ArrayList;

public class Pietre {

	private final static String OXYGEN = "oxygen";
	private final static String HYDROGEN = "hydrogen";
	private final static String RADON = "radon";
	private final static String CAESIUM = "caesium";

	private final static String CHOOSE_OPTIONS = "\nChe pietre vuoi inserire -->\t";
	private final static int MAX_PIETRE_GOLEM = 3;
	private static final String MESS_ERROR = "ATTENZIONE INPUT NON VALIDO!";
	private static final String MESS_ERRORE_INSERIMENTO = "ATTENZIONE L' ELEMENTO è ESAURITO SCEGLINE UN' ALTRO";

	ArrayList<Integer> pietreTamaGolem;

	private int oxygen = 0;
	private int hydrogen = 1;
	private int radon = 2;
	private int caesium = 3;

	public Pietre() {
		this.pietreTamaGolem = new ArrayList<Integer>();
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

	public ArrayList<Integer> MenuSceltaPietre(ArrayList<String> scortaComune) {

		System.out.println("\nINSERISCI 3 PIETRE (SCRIVENDO IL NOME DELLE PIETRE)\n");
		do {
			System.out.println("LISTA DEGLI ELEMENTI DISPONIBILI\n");
			System.out.println(scortaComune.toString());

			String voceselezionata = mylib.InputDati.leggiStringa(CHOOSE_OPTIONS);

			switch (voceselezionata) {

			case OXYGEN:
				if (scortaComune.contains(OXYGEN)) {
					pietreTamaGolem.add(oxygen);
					scortaComune.remove(OXYGEN);
				} else
					System.out.println(MESS_ERRORE_INSERIMENTO);
				break;
			case HYDROGEN:
				if (scortaComune.contains(HYDROGEN)) {
					pietreTamaGolem.add(hydrogen);
					scortaComune.remove(HYDROGEN);
				} else
					System.out.println(MESS_ERRORE_INSERIMENTO);

				break;
			case RADON:
				if (scortaComune.contains(RADON)) {
					pietreTamaGolem.add(radon);
					scortaComune.remove(RADON);
				} else
					System.out.println(MESS_ERRORE_INSERIMENTO);

				break;
			case CAESIUM:
				if (scortaComune.contains(CAESIUM)) {
					pietreTamaGolem.add(caesium);
					scortaComune.remove(CAESIUM);
				} else
					System.out.println(MESS_ERRORE_INSERIMENTO);

				break;
			default:
				System.out.println(MESS_ERROR);
				break;

			}

		} while (pietreTamaGolem.size() < MAX_PIETRE_GOLEM);

		return pietreTamaGolem; // da cambiare
	}

}
