package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bazaPodataka.BazaReci;

public class TestBazaReci {

	@Test
	public void testGetZivotinjeVelicina(){
		assertEquals(15,BazaReci.getZivotinje().length);		
	}
	
	@Test
	public void testGetDrzaveVelicina() {
		assertEquals(15,BazaReci.getDrzave().length);
	}
	
	@Test
	public void testGetEvropskiGlavniGradoviVelicina() {
		assertEquals(15,BazaReci.getEvropskiGlavniGradovi().length);
	}
	
	@Test
	public void testGetMuzickiInstrumentiVelicina() {
		assertEquals(15,BazaReci.getMuzickiInstrumenti().length);
	}
	
	@Test
	public void testGetZanimanjaVelicina() {
		assertEquals(15,BazaReci.getZanimanja().length);
	}
	
	@Test
	public void testGetPovrceVelicina() {
		assertEquals(15,BazaReci.getPovrce().length);
	}
	
	@Test
	public void testGetVoceVelicina() {
		assertEquals(15,BazaReci.getVoce().length);
	}
	
	@Test
	public void testGetSportoviVelicina() {
		assertEquals(15,BazaReci.getSportovi().length);
	}

	
	@Test
	public void testGetZivotinjeVratiPetu() {
		assertEquals("Zlatna ribica" , BazaReci.getZivotinje()[4]);
	}
	
	@Test
	public void testGetDrzaveVratiPetu() {
		assertEquals("Italija" , BazaReci.getDrzave()[4]);
	}
	
	@Test
	public void testGetEvropskiGlavniGradoviVratiPetu() {
		assertEquals("Riga" , BazaReci.getEvropskiGlavniGradovi()[4]);
	}
	
	@Test
	public void testGetMuzickiInstrumentiVratiPetu() {
		assertEquals("Oboa" , BazaReci.getMuzickiInstrumenti()[4]);
	}
	
	@Test
	public void testGetZanimanjaVratiPetu() {
		assertEquals("Pilot" , BazaReci.getZanimanja()[4]);
	}
	
	@Test
	public void testGetPovrceVratiPetu() {
		assertEquals("Blitva" , BazaReci.getPovrce()[4]);
	}
	
	@Test
	public void testGetVoceVratiPetu() {
		assertEquals("Kivi" , BazaReci.getVoce()[4]);
	}
	
	@Test
	public void testGetSportoviVratiPetu() {
		assertEquals("Stoni tenis" , BazaReci.getSportovi()[4]);
	}

}
