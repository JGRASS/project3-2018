package igrica;

import java.util.Random;

import bazaPodataka.BazaReci;
import interfejs.IgracInterfejs;

public class Igrac implements IgracInterfejs {
	
	private Igrica igrica;
	
	private int indeksReci;
	
	public int getIndexReci() {
		return indeksReci;
	}

	@Override
	public char[] pokreniIgricu(String kategorija) {
		igrica = new Igrica(zadajRecIgracu(kategorija));
		return igrica.sakrivenaRecNaPocetkuIgre();
	}
	
	private String zadajRecIgracu(String kategorija) {
		String[] reciIzKategorije = null;
		switch (kategorija.toLowerCase()) {
		case "zivotinje":
			reciIzKategorije = BazaReci.getZivotinje();
			break;
		case "drzave":
			reciIzKategorije = BazaReci.getDrzave();
			break;
		case "evropskiGlavniGradovi":
			reciIzKategorije = BazaReci.getEvropskiGlavniGradovi();
			break;
		case "muzickiInstrumenti":
			reciIzKategorije = BazaReci.getMuzickiInstrumenti();
			break;
		case "zanimanja":
			reciIzKategorije = BazaReci.getZanimanja();
			break;
		case "povrce":
			reciIzKategorije = BazaReci.getPovrce();
			break;
		case "voce":
			reciIzKategorije = BazaReci.getVoce();
			break;
		case "sportovi":
			reciIzKategorije = BazaReci.getSportovi();
			break;
		}
		indeksReci = odaberiRandomBroj();
		return reciIzKategorije[indeksReci];
	}

	private int odaberiRandomBroj() {
		Random rand = new Random();
		int  n = rand.nextInt(15); // mozda treba + 1 da bi se koristio i 15. zanimanje
		return n;
	}

}
