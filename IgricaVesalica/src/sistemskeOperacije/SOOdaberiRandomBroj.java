package sistemskeOperacije;

import java.util.Random;

public class SOOdaberiRandomBroj {
	
	/**
	 * @return randomBroj
	 *  Metoda generise random broj koji oznacava indeks reci koju
	 *         ce igrac pokagadjati.
	 */
	public static int izvrsi() {
		Random rand = new Random();
		int randomBroj = rand.nextInt(15); // mozda treba + 1 da bi se koristio i 15. zanimanje
		return randomBroj;
	}

}
