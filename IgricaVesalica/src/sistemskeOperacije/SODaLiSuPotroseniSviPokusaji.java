package sistemskeOperacije;

import igrica.Igrica;

/**
 * Klasa koja predstavlja sistemsku operaciju proveravanja broja pokusaja
 *
 */
public class SODaLiSuPotroseniSviPokusaji {

	/**
	 * Metoda proverava da li je igrac iskoristio sve pokusaje ili mu je ostalo jos
	 * 
	 * @return true, ukoliko je igrac iskoristio sve pokusaje, u suprotnom false
	 */
	public static boolean izvrsi() {
		if (Igrica.getBrojPromasaja() >= 6) {
			return true;
		}
		return false;

	}
}
