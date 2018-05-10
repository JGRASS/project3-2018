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
	 */
	public static void izvrsi(int brojPromasaja, char[] recSaOtkrivenimSlovima, String zadataRec) {
		Igrica igra= new Igrica(null);
		igra.setBrojPromasaja(brojPromasaja);
		igra.setRecKojaSeTrazi(zadataRec);
		igra.setRecSaOtkrivenimSlovima(recSaOtkrivenimSlovima);
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("sacuvanaIgra.out")));
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
