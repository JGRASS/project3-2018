package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import igrica.Igrica;

/**
 * Klasa koja testira klasu Igrica
 * 
 * @author Dusan Mitrovic
 *
 */
public class TestIgrica {

	/**
	 * Metoda testira get metodu od atributa koji predstavlja rec koju korisnik
	 * treba da pogodi
	 */
	@Test
	public void testGetRecKojaSeTraziInicijalizacija() {
		Igrica ig = new Igrica("Zvezda");
		assertEquals("Zvezda", ig.getRecKojaSeTrazi());
	}

	/**
	 * Metoda testira get metodu atributa koji predstavlja broj promasaja koji
	 * korisnik ima
	 */
	@Test
	public void testGetBrojPromasajaInicijalizacija() {
		Igrica ig = new Igrica("Zvezda");
		assertEquals(0, ig.getBrojPromasaja());
	}

	/**
	 * Metoda testira set metodu atributa koji predstavlja broj promasaja koji
	 * korisnik ima
	 */
	@Test
	public void testSetBrojPromasaja() {
		Igrica ig = new Igrica("Zvezda");
		ig.setBrojPromasaja(10);
		assertEquals(10, ig.getBrojPromasaja());
	}

	/**
	 * Metoda testira da li se prikazuje isti broj crtica koliko slova ima zadata
	 * rec
	 */
	@Test
	public void testSakrivenaRecNaPocetkuIgre() {
		Igrica ig = new Igrica("Zvezda");
		char[] rec = ig.sakrivenaRecNaPocetkuIgre();
		String r = String.valueOf(rec);

		assertEquals("______", r);
	}

	/**
	 * Metoda testira metodu koja proverava da li je korisnik pogodio sva slova u
	 * zadatoj reci
	 */
	@Test
	public void testDaLiJePogodjenarecInicijalizacija() {
		Igrica ig = new Igrica("Zvezda");
		assertEquals(false, ig.daLiJePogodjenaRec());
	}

	/**
	 * Metoda testira metodu koja proverava da li je korisnik iskoristio sve
	 * pokusaje kada je broj pokusaja veci od dozvoljenog
	 */
	@Test
	public void testDaLiSuPotroseniSviPokusaji() {
		Igrica ig = new Igrica("Zvezda");
		ig.setBrojPromasaja(7);
		assertEquals(true, ig.daLiSuPotroseniSviPokusaji());
	}

	/**
	 * Metoda testira metodu koja proverava da li je korisnik iskoristio sve
	 * pokusaje kada unese slova koja se ne nalaze u zadatoj reci
	 */
	@Test
	public void testDaLiSuPotroseniSviPokusajiPriDodavanjuSlova() {
		Igrica ig = new Igrica("Zvezda");
		ig.dodajSlovo('t');
		ig.dodajSlovo('s');
		ig.dodajSlovo('e');
		ig.dodajSlovo('z');
		ig.dodajSlovo('b');
		ig.dodajSlovo('c');
		ig.dodajSlovo('g');
		ig.dodajSlovo('l');
		assertEquals(true, ig.daLiSuPotroseniSviPokusaji());

	}

}
