package sistemskeOperacije;

public class SODaLiJePogodjenaRec {

	public static boolean izvrsi(char[] recSaOtkrivenimSlovima) {
		for (int i = 0; i < recSaOtkrivenimSlovima.length; i++) {
			if (recSaOtkrivenimSlovima[i] == '_')
				return false;
		}
		return true;
		
	}
	
}
