package sistemskeOperacije;

import igrica.Igrica;

public class SODodajSlovo {

	public static char[] izvrsi(String recKojaSeTrazi, char slovo) {

		if (recKojaSeTrazi.toUpperCase().indexOf(slovo) != -1) {

			for (int i = 0; i < recKojaSeTrazi.toUpperCase().length(); i++) {

				if (recKojaSeTrazi.toUpperCase().charAt(i) == slovo) {

					Igrica.recSaOtkrivenimSlovima[i] = slovo;

				}

			}

			return Igrica.recSaOtkrivenimSlovima;

		} else {

			Igrica.setBrojPromasaja(Igrica.getBrojPromasaja()+1);

			return Igrica.recSaOtkrivenimSlovima;

		}

	}

}
