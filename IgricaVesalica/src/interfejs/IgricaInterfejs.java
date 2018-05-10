package interfejs;

/**
 * Klasa koja predstavlja interfejs koji sadrzi metode koje su neophodne za
 * funkcionisanje igrice
 * 
 * @author Nemanja Rasic
 *
 */
public interface IgricaInterfejs {

	/**
	 * Metoda proverava da li se izabrano slovo nalazi u zadatoj reci
	 * 
	 * @param slovo
	 *            koje je igrac izabrao
	 * @return niz karaktera reci koja treba da se pogodi
	 */
	public char[] dodajSlovo(char slovo);

	/**
	 * Metoda skriva zadatu rec na pocetku igre
	 * 
	 * @return
	 */
	public char[] sakrivenaRecNaPocetkuIgre();

	/**
	 * Metoda proverava da li je igrac pogodio rec
	 * 
	 * @return true, ako je igrac pogodio rec ili false, ako nije pogodio
	 */
	public boolean daLiJePogodjenaRec();

	/**
	 * Metoda proverava da li je igrac iskoristio svih 6 pokusaja
	 * 
	 * @return true, ako je igrac istrosio sve pokusaje ili false, ako i dalje ima
	 *         mogucnost za gresku
	 */
	public boolean daLiSuPotroseniSviPokusaji();

}
