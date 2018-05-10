package sistemskeOperacije;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import igrica.Igrica;

/**
 * Klasa koja predstavlja sistemsku operaciju ucitavanja sacuvane igre
 */
public class SOUcitajIgru {
	
	public static Igrica izvrsi() {
		try {
			ObjectInputStream in= new ObjectInputStream(new FileInputStream("sacuvanaIgra.out"));
			Igrica igra=(Igrica)( in.readObject());
			in.close();
			return igra;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
