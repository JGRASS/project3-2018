package igrica;

import interfejs.IgricaInterfejs;

public class Igrica implements IgricaInterfejs {
	
	private String recKojaSeTrazi;
	
	private int brojPromasaja;
	
	private char[] recSaOtkrivenimSlovima;
	
	public Igrica(String zadataRec) {
		this.recKojaSeTrazi = zadataRec;
		brojPromasaja = 0;
		recSaOtkrivenimSlovima = sakrivenaRecNaPocetkuIgre();
	}
	
	public String getRecKojaSeTrazi() {
		return recKojaSeTrazi;
	}

	public int getBrojPromasaja() {
		return brojPromasaja;
	}

	@Override
	public char[] dodajSlovo(char slovo) {
		if (recKojaSeTrazi.toUpperCase().indexOf(slovo) != -1) {
			for (int i = 0; i < recKojaSeTrazi.toUpperCase().length(); i++) {
				if (recKojaSeTrazi.toUpperCase().charAt(i) == slovo) {
					recSaOtkrivenimSlovima[i] = slovo;
				}
			}
			return recSaOtkrivenimSlovima;
		} else {
			brojPromasaja++;
			return new char[0];
		}
	}

	@Override
	public char[] sakrivenaRecNaPocetkuIgre() {
		String recZaPrikaz = "";
		for (int i = 0; i < recKojaSeTrazi.length(); i++) {
			if (recKojaSeTrazi.charAt(i) != ' ')
				recZaPrikaz += 'X';
			else
				recZaPrikaz += ' ';
		}
		return recZaPrikaz.toCharArray();
	}

	@Override
	public boolean daLiJePogodjenaRec() {
		for (int i = 0; i < recSaOtkrivenimSlovima.length; i++) {
			if (recSaOtkrivenimSlovima[i] == '*')
				return false;
		}
		return true;
	}

	@Override
	public boolean daLiSuPotroseniSviPokusaji() {
		if (getBrojPromasaja() >= 6) {
			return true;
		}
		return false;
	}

}
