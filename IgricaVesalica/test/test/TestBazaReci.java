package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bazaPodataka.BazaReci;

/**
 * Klasa koja testira klasu BazaReci
 * 
 * @author Dusan Mitrovic
 *
 */
public class TestBazaReci {

	/**
	 * Metoda testira get metodu za kategoriju zivotinje kada je u pitanju duzina
	 * niza reci koje spadaju u tu kategoriju
	 */
	@Test
	public void testGetZivotinjeVelicina() {
		assertEquals(15, BazaReci.getZivotinje().length);
	}

	/**
	 * Metoda testira get metodu za kategoriju drzave kada je u pitanju duzina niza
	 * reci koje spadaju u tu kategoriju
	 */
	@Test
	public void testGetDrzaveVelicina() {
		assertEquals(15, BazaReci.getDrzave().length);
	}

	/**
	 * Metoda testira get metodu za kategoriju evropski glavni gradovi kada je u
	 * pitanju duzina niza reci koje spadaju u tu kategoriju
	 */
	@Test
	public void testGetEvropskiGlavniGradoviVelicina() {
		assertEquals(15, BazaReci.getEvropskiGlavniGradovi().length);
	}

	/**
	 * Metoda testira get metodu za kategoriju muzicki instrumenti kada je u pitanju
	 * duzina niza reci koje spadaju u tu kategoriju
	 */
	@Test
	public void testGetMuzickiInstrumentiVelicina() {
		assertEquals(15, BazaReci.getMuzickiInstrumenti().length);
	}

	/**
	 * Metoda testira get metodu za kategoriju zanimanja kada je u pitanju duzina
	 * niza reci koje spadaju u tu kategoriju
	 */
	@Test
	public void testGetZanimanjaVelicina() {
		assertEquals(15, BazaReci.getZanimanja().length);
	}

	/**
	 * Metoda testira get metodu za kategoriju povrce kada je u pitanju duzina niza
	 * reci koje spadaju u tu kategoriju
	 */
	@Test
	public void testGetPovrceVelicina() {
		assertEquals(15, BazaReci.getPovrce().length);
	}

	/**
	 * Metoda testira get metodu za kategoriju voce kada je u pitanju duzina niza
	 * reci koje spadaju u tu kategoriju
	 */
	@Test
	public void testGetVoceVelicina() {
		assertEquals(15, BazaReci.getVoce().length);
	}

	/**
	 * Metoda testira get metodu za kategoriju sportovi kada je u pitanju duzina
	 * niza reci koje spadaju u tu kategoriju
	 */
	@Test
	public void testGetSportoviVelicina() {
		assertEquals(15, BazaReci.getSportovi().length);
	}

	/**
	 * Metoda testira get metodu za kategoriju zivotinje kada je u pitanju peta rec
	 * u nizu reci koje pripadaju toj kategoriji
	 */
	@Test
	public void testGetZivotinjeVratiPetu() {
		assertEquals("Zlatna ribica", BazaReci.getZivotinje()[4]);
	}

	/**
	 * Metoda testira get metodu za kategoriju drzave kada je u pitanju peta rec u
	 * nizu reci koje pripadaju toj kategoriji
	 */
	@Test
	public void testGetDrzaveVratiPetu() {
		assertEquals("Italija", BazaReci.getDrzave()[4]);
	}

	/**
	 * Metoda testira get metodu za kategoriju evropski glavni gradovi kada je u
	 * pitanju peta rec u nizu reci koje pripadaju toj kategoriji
	 */
	@Test
	public void testGetEvropskiGlavniGradoviVratiPetu() {
		assertEquals("Riga", BazaReci.getEvropskiGlavniGradovi()[4]);
	}

	/**
	 * Metoda testira get metodu za kategoriju muzicki instrumenti kada je u pitanju
	 * peta rec u nizu reci koje pripadaju toj kategoriji
	 */
	@Test
	public void testGetMuzickiInstrumentiVratiPetu() {
		assertEquals("Oboa", BazaReci.getMuzickiInstrumenti()[4]);
	}

	/**
	 * Metoda testira get metodu za kategoriju zanimanja kada je u pitanju peta rec
	 * u nizu reci koje pripadaju toj kategoriji
	 */
	@Test
	public void testGetZanimanjaVratiPetu() {
		assertEquals("Pilot", BazaReci.getZanimanja()[4]);
	}

	/**
	 * Metoda testira get metodu za kategoriju povrce kada je u pitanju peta rec u
	 * nizu reci koje pripadaju toj kategoriji
	 */
	@Test
	public void testGetPovrceVratiPetu() {
		assertEquals("Blitva", BazaReci.getPovrce()[4]);
	}

	/**
	 * Metoda testira get metodu za kategoriju voce kada je u pitanju peta rec u
	 * nizu reci koje pripadaju toj kategoriji
	 */
	@Test
	public void testGetVoceVratiPetu() {
		assertEquals("Kivi", BazaReci.getVoce()[4]);
	}

	/**
	 * Metoda testira get metodu za kategoriju sportovi kada je u pitanju peta rec u
	 * nizu reci koje pripadaju toj kategoriji
	 */
	@Test
	public void testGetSportoviVratiPetu() {
		assertEquals("Stoni tenis", BazaReci.getSportovi()[4]);
	}

}
