package sistemskeOperacije;

import java.util.Random;

/**
 * Klasa koja predstavlja sistemsku operaciju nasumicnog biranja broja
 *
 */
public class SOOdaberiRandomBroj {

	/**
	 * Metoda generise random broj koji oznacava indeks reci koju ce igrac
	 * pogadjati.
	 * 
	 * @return indeks reci
	 */
	public static int izvrsi() {
		Random rand = new Random();
		int randomBroj = rand.nextInt(15); // mozda treba + 1 da bi se koristio i 15. zanimanje
		return randomBroj;
	}

}
