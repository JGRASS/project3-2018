package igrica;

import interfejs.IgricaInterfejs;
import sistemskeOperacije.SODaLiJePogodjenaRec;
import sistemskeOperacije.SODaLiSuPotroseniSviPokusaji;
import sistemskeOperacije.SODodajSlovo;
import sistemskeOperacije.SOSakrivenaRecNaPocetkuIgre;

/**
 * Klasa o igrici koja implementira interfejs IgricaInterfejs
 * 
 * @author Nemanja Rasic
 * 
 */
public class Igrica implements IgricaInterfejs {

	/**
	 * Atribut predstavlja rec koju igrac treba da pogodi.
	 */
	public static String recKojaSeTrazi;

	/**
	 * Atribut pokazuje koliko puta je igrac promasio u odabiru slova.
	 */
	private static int brojPromasaja;

	/**
	 * Atribut predstavlja rec koja je delimicno pogodjena.
	 */
	public static char[] recSaOtkrivenimSlovima;

	/**
	 * Kontstruktor inicijalizuje klasu i uvodi novu zadatu rec, pocinje da broji
	 * broj promasaja i inicijalizuje rec koja ce biti prikazana nakon pokusaja
	 * pogadjanja.
	 * 
	 * @param zadataRec
	 * 
	 */
	public Igrica(String zadataRec) {
		this.recKojaSeTrazi = zadataRec;
		brojPromasaja = 0;
		recSaOtkrivenimSlovima = sakrivenaRecNaPocetkuIgre();
	}

	/**
	 * Metoda vraca rec za kojom igrac traga.
	 * 
	 * @return recKojaSeTrazi
	 */
	public String getRecKojaSeTrazi() {
		return recKojaSeTrazi;
	}

	/**
	 * Metoda vraca broj promasaja pri pogadjanju igraca.
	 * 
	 * @return brojPromasaja
	 */
	public static int getBrojPromasaja() {
		return brojPromasaja;
	}

	/**
	 * Metoda koja postavlja brojPromasaja na zadatu vrednost
	 * 
	 * @param broj promasaja
	 * 
	 */
	public static void setBrojPromasaja(int broj) {
		brojPromasaja = broj;
	}

	/**
	 * Metoda vraca rec za prikaz nakon inicijalizacije igrice. Napravi se niz koji
	 * se sastoji od '_' na mestima gde su slova i ' ' u slucaju razmaka izmedju dve
	 * reci i sam niz ce biti prikazan igracu da bi se pokazalo koliko rec ima
	 * slova.
	 * 
	 * @return niz karaktera koji se prikazuju u vidu '_'
	 */
	@Override
	public char[] sakrivenaRecNaPocetkuIgre() {
		return SOSakrivenaRecNaPocetkuIgre.izvrsi(recKojaSeTrazi);
	}

	/**
	 * Metoda proverava da li je zadata rec pogodjena
	 * 
	 * @return Ukoliko je rec koju je korisnik uneo jednaka trazenoj reci onda
	 *         metoda vraca true, a u suprotnom vraca false.
	 */
	@Override
	public boolean daLiJePogodjenaRec() {
		return SODaLiJePogodjenaRec.izvrsi(recSaOtkrivenimSlovima);
	}

	/**
	 * Metoda proverava da li je igrac iskoristio sve pokusaje
	 * 
	 * @return U slucaju da je broj promasaja jednak 6 onda metoda vraca true i
	 *         igrac je izgubio, u protivnom vraca false jer igrac ima pravo da jos
	 *         traga za pojmom.
	 */
	@Override
	public boolean daLiSuPotroseniSviPokusaji() {
		if (brojPromasaja == 6)
			return true;
		return false;
	}

	/**
	 * 
	 * Metoda proverava da li se na nekom mestu u nizu karaktera nalazi slovo koje
	 * je prosledjeno kao parametar. Ukoliko jeste, onda se vrednost elemenata na
	 * tim mestima u nizu menja na to slovo i na kraju metoda vraca izmenjenu rec za
	 * prikaz u obliku niza u protivnom se povecava broj promasaja.
	 * 
	 * @param slovo
	 * @return recSaOtkrivenimSlovima.
	 * 
	 */

	@Override
	public char[] dodajSlovo(char slovo) {
		// TODO Auto-generated method stub
		return null;
	}

}
