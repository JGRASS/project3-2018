package sistemskeOperacije;

/**
 * Klasa koja predstavlja sistemsku operaciju proveravanja da li je rec
 * pogodjena
 *
 */
public class SODaLiJePogodjenaRec {

	/**
	 * Metoda proverava da li se na jos nekom mestu nalazi '_' ili su pogodjena sva
	 * slova
	 * 
	 * @param niz
	 *            karaktera od zadate reci koja treba da se pogodi
	 * @return true, ukoliko je korisnik pogodio sva slova, u suprotnom false
	 */
	public static boolean izvrsi(char[] recSaOtkrivenimSlovima) {
		for (int i = 0; i < recSaOtkrivenimSlovima.length; i++) {
			if (recSaOtkrivenimSlovima[i] == '_')
				return false;
		}
		return true;

	}

}
