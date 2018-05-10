package interfejs;

/**
 * Metoda koja predstavlja interfejs sa metodom koja pokrece igricu
 * 
 * @author Nemanja Rasic
 *
 */

public interface IgracInterfejs {

	/**
	 * 
	 * Metoda vraca niz karaktera koji se sastoji od _ na mestima na koja se nalaze
	 * slova i praznim mestima ako ima vise od jedne reci.
	 * 
	 * @param kategorija
	 *            iz koje se bira rec
	 * @return niz karaktera koji se sastoje od _ na mestima slova zadate reci
	 */
	public char[] pokreniIgricu(String kategorija);

}
