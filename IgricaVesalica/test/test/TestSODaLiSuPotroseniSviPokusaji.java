package test;

import static org.junit.Assert.*;

import org.junit.Test;

import igrica.Igrica;
import sistemskeOperacije.SODaLiSuPotroseniSviPokusaji;

/**
 * 
 * Klasa koja predstavlja test klase SODaLiSuPotroseniSviPokusaji
 * @author Dusan Mitrovic
 */
public class TestSODaLiSuPotroseniSviPokusaji {

	
	/**
	 * Metoda testira metodu koja proverava da li je korisnik iskoristio sve
	 * pokusaje kada unese proizvoljna slova
	 */
	@Test
	public void testIzvrsi() {
		Igrica ig = new Igrica("Zvezda");
		ig.dodajSlovo('B');
		ig.dodajSlovo('S');
		ig.dodajSlovo('R');
		ig.dodajSlovo('K');
		ig.dodajSlovo('C');
		ig.dodajSlovo('Z');
		assertFalse(SODaLiSuPotroseniSviPokusaji.izvrsi());
	}

}
