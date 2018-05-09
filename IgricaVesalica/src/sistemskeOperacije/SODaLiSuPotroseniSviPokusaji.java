package sistemskeOperacije;

import igrica.Igrica;

public class SODaLiSuPotroseniSviPokusaji {

	public static boolean izvrsi() {
		if (Igrica.getBrojPromasaja() >= 6) {
			return true;
		}
		return false;
		
		
	}
}
