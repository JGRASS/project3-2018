package igrica;

import java.util.Random;

import bazaPodataka.BazaReci;
import interfejs.IgracInterfejs;

/**
 * Klasa o igracu.
 * 
 */

public class Igrac implements IgracInterfejs {

	/**
	 * Privatni atribut predstavlja igricu koja je inicijalizovana.
	 */
	private Igrica igrica;

	/**
	 * Privatni atribut predstavlja indeks iz niza stringa odredjene kategorije koju
	 * je igrac odabrao.
	 */
	private int indeksReci;

	/**
	 * Metoda vraca indeks reci koju igrac pogadja iz odredjene kategorije.
	 * 
	 * @return indeksReci
	 */
	public int getIndeksReci() {
		return indeksReci;
	}

	/**
	 * @param kategorija
	 *            Kategorija reci koju je igrac odabrao.
	 * 
	 * @return igrica.vratiRecZaPrikaz().
	 * 
	 *         Metoda vraca niz karaktera koji se sastoji od X na mestima na koja se
	 *         nalaze slova i praznim mestima ako ima vise od jedne reci.
	 */
	@Override
	public char[] pokreniIgricu(String kategorija) {
		igrica = new Igrica(zadajRecIgracu(kategorija));
		return igrica.sakrivenaRecNaPocetkuIgre();
	}

	/**
	 * @param kategorija
	 *            Kategorija reci koju je igrac odabrao.
	 * @return reciIzKategorije[indeksReci] U zavisnosti od izabrane kategorije bira
	 *         se jedan random rec na indeksu indeksReci iz te kategorije i data rec
	 *         se vraca kao String.
	 */
	private String zadajRecIgracu(String kategorija) {
		String[] reciIzKategorije = null;
		switch (kategorija.toLowerCase()) {
		case "zivotinje":
			reciIzKategorije = BazaReci.getZivotinje();
			break;
		case "drzave":
			reciIzKategorije = BazaReci.getDrzave();
			break;
		case "evropskiGlavniGradovi":
			reciIzKategorije = BazaReci.getEvropskiGlavniGradovi();
			break;
		case "muzickiInstrumenti":
			reciIzKategorije = BazaReci.getMuzickiInstrumenti();
			break;
		case "zanimanja":
			reciIzKategorije = BazaReci.getZanimanja();
			break;
		case "povrce":
			reciIzKategorije = BazaReci.getPovrce();
			break;
		case "voce":
			reciIzKategorije = BazaReci.getVoce();
			break;
		case "sportovi":
			reciIzKategorije = BazaReci.getSportovi();
			break;
		}
		indeksReci = odaberiRandomBroj();
		return reciIzKategorije[indeksReci];
	}

	/**
	 * @return randomBroj Metoda generise random broj koji oznacava indeks reci koju
	 *         ce igrac pokagadjati.
	 */
	private int odaberiRandomBroj() {
		Random rand = new Random();
		int randomBroj = rand.nextInt(15); // mozda treba + 1 da bi se koristio i 15. zanimanje
		return randomBroj;
	}

}
