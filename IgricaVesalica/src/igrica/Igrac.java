package igrica;

import java.util.Random;

import bazaPodataka.BazaReci;
import interfejs.IgracInterfejs;
import sistemskeOperacije.SOZadajRecIgracu;

/**
 * Klasa o igracu koja implementira interfejs IgracInterfejs
 * 
 * @author Nemanja Rasic
 * 
 */

public class Igrac implements IgracInterfejs {

	/**
	 * Privatni atribut predstavlja igricu koja je inicijalizovana.
	 */
	private Igrica igrica;

	/**
	 * 
	 * Metoda vraca niz karaktera koji se sastoji od _ na mestima na koja se nalaze
	 * slova i praznim mestima ako ima vise od jedne reci.
	 * 
	 * @param kategorija
	 *            Kategorija reci koju je igrac odabrao.
	 * 
	 * @return igrica.vratiRecZaPrikaz().
	 * 
	 * 
	 */
	@Override
	public char[] pokreniIgricu(String kategorija) {
		igrica = new Igrica(zadajRecIgracu(kategorija));
		return igrica.sakrivenaRecNaPocetkuIgre();
	}

	/**
	 * Metoda bira jednu od reci baze za izabranu kategoriju
	 * 
	 * @param kategorija
	 *            Kategorija reci koju je igrac odabrao.
	 * @return reciIzKategorije[indeksReci] U zavisnosti od izabrane kategorije bira
	 *         se jedan random rec na indeksu indeksReci iz te kategorije i data rec
	 *         se vraca kao String.
	 */
	public static String zadajRecIgracu(String kategorija) {
		return SOZadajRecIgracu.izvrsi(kategorija);
	}

}
