package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sistemskeOperacije.SOZadajRecIgracu;

/**
 * 
 * Klasa koja predstavlja test klase SOZadajRecIgracu
 * @author Dusan Mitrovic
 */
public class TestSOZadajRecIgracu {

	/**
	 * 
	 * Metoda koja provera da li se zadaje rec igracu
	 */
	@Test
	public void testIzvrsi() {
		String rec = null;
		rec = SOZadajRecIgracu.izvrsi("Voce");
		assertNotEquals(null, rec);
	}

}
