package sistemskeOperacije;

/**
 * Klasa predstavlja sistemsku operaciju koja skriva rec na pocetku igre
 *
 */
public class SOSakrivenaRecNaPocetkuIgre {

	/**
	 * Metoda pravi niz karaktera koji ce biti prikazan korisniku i umesto slova
	 * stavlja '_', a ukoliko u zadatoj reci postoji ' ', on ostaje
	 * 
	 * @param rec
	 *            koju korisnik treba da pogodi
	 * @return niz karaktera od onoliko '_' koliko se slova nalazi u reci
	 */
	public static char[] izvrsi(String recKojaSeTrazi) {
		String recZaPrikaz = "";
		for (int i = 0; i < recKojaSeTrazi.length(); i++) {
			if (recKojaSeTrazi.charAt(i) != ' ')
				recZaPrikaz += '_';
			else
				recZaPrikaz += ' ';
		}
		return recZaPrikaz.toCharArray();

	}

}
