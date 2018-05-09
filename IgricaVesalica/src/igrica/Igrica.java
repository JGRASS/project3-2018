package igrica;

import interfejs.IgricaInterfejs;
import sistemskeOperacije.SODaLiJePogodjenaRec;
import sistemskeOperacije.SODaLiSuPotroseniSviPokusaji;
import sistemskeOperacije.SODodajSlovo;
import sistemskeOperacije.SOSakrivenaRecNaPocetkuIgre;

/**
 * Klasa o igrici.
 * 
 */
public class Igrica implements IgricaInterfejs {

	/**
	 * Atribut predstavlja rec koju igrac treba da pogodi.
	 */
	private String recKojaSeTrazi;

	/**
	 * Atribut pokazuje koliko puta je igrac promasio u odabiru slova.
	 */
	private static int brojPromasaja;

	/**
	 * Atribut predstavlja rec koja je delimicno pogodjena.
	 */
	public static char[] recSaOtkrivenimSlovima;

	/**
	 * @param zadataRec
	 *            Kontstruktor inicijalizuje klasu i uvodi novu zadatu rec, pocinje
	 *            da broji broj promasaja i inicijalizuje rec koja ce biti prikazana
	 *            nakon pokusaja pogadjanja.
	 */
	public Igrica(String zadataRec) {
		this.recKojaSeTrazi = zadataRec;
		brojPromasaja = 0;
		recSaOtkrivenimSlovima = sakrivenaRecNaPocetkuIgre();
	}

	/**
	 * @return recKojaSeTrazi Metoda vraca rec za kojom igrac traga.
	 */
	public String getRecKojaSeTrazi() {
		return recKojaSeTrazi;
	}

	/**
	 * @return brojPromasaja Metoda vraca broj promasaja pri pogadjanju igraca.
	 */
	public static int getBrojPromasaja() {
		return brojPromasaja;
	}

	/**
	 * 
	 * @param broj
	 * Metoda koja postavlja brojPromasaja na zadatu vrednost
	 */
	public static void setBrojPromasaja(int broj) {
		brojPromasaja = broj;
	}
	
	
	/**
	 * @param slovo
	 * @return recSaOtkrivenimSlovima.
	 * 
	 *         Metoda proverava da li se na nekom mestu u nizu karaktera nalazi
	 *         slovo koje je prosledjeno kao parametar. Ukoliko jeste, onda se
	 *         vrednost elemenata na tim mestima u nizu menja na to slovo i na kraju
	 *         metoda vraca izmenjenu rec za prikaz u obliku niza u protivnom se
	 *         povecava broj promasaja.
	 */
	@Override
	public char[] dodajSlovo(char slovo) {
		return SODodajSlovo.izvrsi(recKojaSeTrazi, slovo);
	}

	/**
	 * @return recZaPrikaz.toCharArray() Metoda vraca rec za prikaz nakon
	 *         inicijalizacije igrice. Napravi se niz koji se sastoji od 'X' na
	 *         mestima gde su slova i ' ' u slucaju razmaka izmedju dve reci i sam
	 *         niz ce biti prikazan igracu da bi se pokazalo koliko rec ima slova.
	 */
	@Override
	public char[] sakrivenaRecNaPocetkuIgre() {
		return SOSakrivenaRecNaPocetkuIgre.izvrsi(recKojaSeTrazi);
	}

	/**
	 * Ukoliko je rec koju je korisnik uneo jednaka trazenoj reci onda metoda vraca
	 * true, a u suprotnom vraca false.
	 * 
	 * @return boolean
	 */
	@Override
	public boolean daLiJePogodjenaRec() {
		return SODaLiJePogodjenaRec.izvrsi(recSaOtkrivenimSlovima);
	}

	/**
	 * U slucaju da je broj promasaja jednak 6 onda metoda vraca true i igrac je
	 * izgubio, u protivnom vraca false jer igrac ima pravo da jos traga za pojmom.
	 * 
	 * @return boolean
	 */
	@Override
	public boolean daLiSuPotroseniSviPokusaji() {
		return SODaLiSuPotroseniSviPokusaji.izvrsi();
	}

}
