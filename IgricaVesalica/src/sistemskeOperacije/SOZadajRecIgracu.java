package sistemskeOperacije;

import bazaPodataka.BazaReci;

/**
 * 
 * Klasa koja predstavlja sistemsku operaciju koja zadaje rec korisniku
 *
 */
public class SOZadajRecIgracu {

	/**
	 * Metoda prepoznaje koju je kategoriju korisnik izabrao i vraca rec iz te
	 * kategorije koju korisnik treba da pogodi
	 * 
	 * @param kategorija
	 *            koju je korisnik izabrao
	 * @return izabrana rec iz kategorije
	 */
	public static String izvrsi(String kategorija) {

		String[] reciIzKategorije = null;
		switch (kategorija.toLowerCase()) {
		case "zivotinje":
			reciIzKategorije = BazaReci.getZivotinje();
			break;
		case "drzave":
			reciIzKategorije = BazaReci.getDrzave();
			break;
		case "evropski gradovi":
			reciIzKategorije = BazaReci.getEvropskiGlavniGradovi();
			break;
		case "muzicki instrumenti":
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
		int indeksReci = SOOdaberiRandomBroj.izvrsi();
		return reciIzKategorije[indeksReci];

	}

}
