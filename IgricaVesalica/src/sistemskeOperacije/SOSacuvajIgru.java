package sistemskeOperacije;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import igrica.Igrica;

/**
 * Klasa koja predstvalja sistemsku operaciju cuvanja igrice
 *
 */
public class SOSacuvajIgru {

	/**
	 * Metoda cuva trenutne podatke u trenutku kada korisnik zeli da sacuva igricu
	 * 
	 * @param brojPromasaja
	 *            koji korisnik ima
	 * @param recSaOtkrivenimSlovima
	 *            rec koju je korisnik delimicno pogodio
	 * @param zadataRec
	 *            rec koju korisnik treba da pogodi
	 * @param kategorija
	 *            kojoj pripada zadata rec
	 */
	public static void izvrsi(int brojPromasaja, char[] recSaOtkrivenimSlovima, String zadataRec, String kategorija) {
		Igrica igra = new Igrica(zadataRec);
		igra.setBrojPromasaja(brojPromasaja);
		igra.setRecSaOtkrivenimSlovima(recSaOtkrivenimSlovima);
		igra.setKategorija(kategorija);

		try {
			ObjectOutputStream out = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream("sacuvanaIgra.out")));
			out.writeObject(igra);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
