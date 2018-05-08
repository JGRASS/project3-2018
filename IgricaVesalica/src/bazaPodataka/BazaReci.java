package bazaPodataka;

/**
 * Klasa u kojoj se nalaze kategorije i reci koje se pogadjaju za svaku
 * kategoriju.
 * 
 * @author Milica Zukanovic
 * @version 1.0
 *
 */
public class BazaReci {
	/**
	 * Atribut koji predstavlja niz od 15 pojmova za kategoriju zivotinje
	 */
	public static String[] zivotinje = new String[] { "Zebra", "Pas", "Slon", "Zmija", "Zlatna ribica", "Pauk", "Ovca",
			"Koza", "Petao", "Krokodil", "Hijena", "Mungos", "Koala", "Majmun", "Zec" };

	/**
	 * Atribut koji predstavlja niz od 15 pojmova za kategoriju drzave
	 */
	public static String[] drzave = new String[] { "Srbija", "Kina", "Portugalija", "Francuska", "Italija", "Sudan",
			"Zimbabve", "Irak", "Kazahstan", "Mongolija", "Brazil", "Argentina", "Urungvaj", "Crna Gora", "Izrael" };

	/**
	 * Atribut koji predstavlja niz od 15 pojmova za kategoriju evropski glavni
	 * gradovi
	 */
	public static String[] evropskiGlavniGradovi = new String[] { "Beograd", "Madrid", "Pariz", "Rim", "Riga",
			"Amsterdam", "Podgorica", "Zagreb", "Sarajevo", "Atina", "Tirana", "Brisel", "Kopenhagen", "Helsinki",
			"Rejkjavik" };

	/**
	 * Atribut koji predstavlja niz od 15 pojmova za kategoriju muzicki instrumenti
	 */
	public static String[] muzickiInstrumenti = new String[] { "Gitara", "Violina", "Klavir", "Daire", "Oboa", "Viola",
			"Vuvuzela", "Rog", "Saksofon", "Gusle", "Tamburica", "Triangl", "Zvono", "Truba", "Flauta" };

	/**
	 * Atribut koji predstavlja niz od 15 pojmova za kategoriju zanimanja
	 */
	public static String[] zanimanja = new String[] { "Advokat", "Glumac", "Doktor", "Profesor", "Pilot", "Pekar",
			"Apotekar", "Arhitekta", "Farmaceut", "Fizioterapeut", "Barmen", "Konobar", "Medicinska sestra",
			"Policajac", "Babica" };

	/**
	 * Atribut koji predstavlja niz od 15 pojmova za kategoriju povrce
	 */
	public static String[] povrce = new String[] { "Krompir", "Zelena salata", "Paprika", "Krastavac", "Blitva",
			"Bundeva", "Boranija", "Cvekla", "Celer", "Repa", "Rotkvica", "Keleraba", "Tikvica", "Rabarbara",
			"Avokado" };

	/**
	 * Atribut koji predstavlja niz od 15 pojmova za kategoriju voce
	 */
	public static String[] voce = new String[] { "Mango", "Jagoda", "Malina", "Banana", "Kivi", "Kupina", "Borovnica",
			"Brusnica", "Kajsija", "Breskva", "Nektarina", "Aronija", "Grejpfrut", "Ribizla", "Jabuka" };

	/**
	 * Atribut koji predstavlja niz od 15 pojmova za kategoriju sportovi
	 */
	public static String[] sportovi = new String[] { "Atletika", "Aikido", "Karate", "Fudbal", "Stoni tenis", "Tenis",
			"Badminton", "Skeleton", "Pikado", "Akrobatika", "Skejtbord", "Golf", "Bejzbol", "Lakros", "Odbojka" };

	/**
	 * Metoda vraca pojmove za kategoriju zivotinje
	 * 
	 * @return niz Stringova za kategoriju zivotinje
	 */
	public static String[] getZivotinje() {
		return zivotinje;
	}

	/**
	 * Metoda vraca pojmove za kategoriju drzave
	 * 
	 * @return niz Stringova za kategoriju drzave
	 */
	public static String[] getDrzave() {
		return drzave;
	}

	/**
	 * Metoda vraca pojmove za kategoriju evropski glavni gradovi
	 * 
	 * @return niz Stringova za kategoriju evropski glavni gradovi
	 */
	public static String[] getEvropskiGlavniGradovi() {
		return evropskiGlavniGradovi;
	}

	/**
	 * Metoda vraca pojmove za kategoriju muzicki instrumenti
	 * 
	 * @return niz Stringova za kategoriju muzicki instrumenti
	 */
	public static String[] getMuzickiInstrumenti() {
		return muzickiInstrumenti;
	}

	/**
	 * Metoda vraca pojmove za kategoriju zanimanja
	 * 
	 * @return niz Stringova za kategoriju zanimanja
	 */
	public static String[] getZanimanja() {
		return zanimanja;
	}

	/**
	 * Metoda vraca pojmove za kategoriju povrce
	 * 
	 * @return niz Stringova za kategoriju povrce
	 */
	public static String[] getPovrce() {
		return povrce;
	}

	/**
	 * Metoda vraca pojmove za kategoriju voce
	 * 
	 * @return niz Stringova za kategoriju voce
	 */
	public static String[] getVoce() {
		return voce;
	}

	/**
	 * Metoda vraca pojmove za kategoriju sportovi
	 * 
	 * @return niz Stringova za kategoriju sportovi
	 */
	public static String[] getSportovi() {
		return sportovi;
	}

}
