package sistemskeOperacije;

import igrica.Igrica;

/**
 * Klasa koja predstavlja sistemsku operaciju proveravanja da li se slovo nalazi
 * u zadatoj reci
 * 
 */

public class SODodajSlovo {

	/**
	 * Metoda proverava da li se slovo koje je korisnik izabrao nalazi u zadatoj
	 * reci i ukoliko se nalazi, umesto '_' ispisuje pogodjeno slovo, ukoliko ne,
	 * metoda vraca nepromenjen niz karaktera od '_' i vec pogodjenih slova
	 * 
	 * @param zadata
	 *            rec koju korisnik treba da pogodi
	 * @param slovo
	 *            za koje korisnik misli da se nalazi u zadatoj reci
	 * @return niz karaktera od '_' i slova koja je korisnik vec pogodio
	 */
	public static char[] izvrsi(String recKojaSeTrazi, char slovo) {

		if (recKojaSeTrazi.toUpperCase().indexOf(slovo) != -1) {

			for (int i = 0; i < recKojaSeTrazi.toUpperCase().length(); i++) {

				if (recKojaSeTrazi.toUpperCase().charAt(i) == slovo) {

					Igrica.recSaOtkrivenimSlovima[i] = slovo;

				}

			}

			return Igrica.recSaOtkrivenimSlovima;

		} else {

			Igrica.setBrojPromasaja(Igrica.getBrojPromasaja() + 1);

			return Igrica.recSaOtkrivenimSlovima;

		}

	}

}
