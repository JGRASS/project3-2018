package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import igrica.Igrica;

public class TestIgrica {

	@Test
	public void testGetRecKojaSeTraziInicijalizacija() {
		Igrica ig = new Igrica("Zvezda");
		assertEquals("Zvezda", ig.getRecKojaSeTrazi());
	}

	@Test
	public void testGetBrojPromasajaInicijalizacija() {
		Igrica ig = new Igrica("Zvezda");
		assertEquals(0, ig.getBrojPromasaja());
	}
	
	@Test
	public void testSetBrojPromasaja() {
		Igrica ig = new Igrica("Zvezda");
		ig.setBrojPromasaja(10);
		assertEquals(10, ig.getBrojPromasaja());
	}
	
	@Test
	public void testSakrivenaRecNaPocetkuIgre() {
		Igrica ig = new Igrica("Zvezda");
		char[] rec = ig.sakrivenaRecNaPocetkuIgre();
		String r = String.valueOf(rec);
		
		assertEquals("______", r);
	}
	
	@Test
	public void testDaLiJePogodjenarecInicijalizacija() {
		Igrica ig = new Igrica("Zvezda");
		assertEquals(false, ig.daLiJePogodjenaRec());
	}
	
	@Test
	public void testDaLiSuPotroseniSviPokusaji() {
		Igrica ig = new Igrica("Zvezda");
		ig.setBrojPromasaja(7);
		assertEquals(true, ig.daLiSuPotroseniSviPokusaji());
	}
	
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
		assertEquals(true,ig.daLiSuPotroseniSviPokusaji());
		
	}
	
	
}
