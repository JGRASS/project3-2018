package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sistemskeOperacije.SODaLiJePogodjenaRec;

/**
 * 
 * Klasa koja predstavlja test klase SODaLiJePogodjenaRec
 * @author Dusan Mitrovic
 */
public class TestSODaLiJePogodjenaRec {

	/**
	 * Metoda koja proverava da li je rec pogodjena ili ne
	 */
	@Test
	public void testIzvrsi() {
		String rec = "Bra_il";
		char[] r = rec.toCharArray();
		assertFalse(SODaLiJePogodjenaRec.izvrsi(r));
		
	}
}
