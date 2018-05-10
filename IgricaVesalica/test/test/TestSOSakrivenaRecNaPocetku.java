package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sistemskeOperacije.SOSakrivenaRecNaPocetkuIgre;

/**
 * 
 * Klasa koja predstavlja test klase SOSakrivenaRecNaPocetku
 * @author Dusan Mitrovic
 */

public class TestSOSakrivenaRecNaPocetku {

	/**
	 * Metoda testira da li se prikazuje isti broj crtica koliko slova ima zadata
	 * rec
	 */
	@Test
	public void izvrsi() {
		String rec = "Crna Gora";
		char[] r = SOSakrivenaRecNaPocetkuIgre.izvrsi(rec);
		assertEquals("____ ____", String.valueOf(r));
	}

}
