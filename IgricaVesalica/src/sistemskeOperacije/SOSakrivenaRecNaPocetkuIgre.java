package sistemskeOperacije;

public class SOSakrivenaRecNaPocetkuIgre {

	public static char[] izvrsi(String recKojaSeTrazi) {
		String recZaPrikaz = "";
		for (int i = 0; i < recKojaSeTrazi.length(); i++) {
			if (recKojaSeTrazi.charAt(i) != ' ')
				recZaPrikaz += '_';
			else
				recZaPrikaz += ' ';
		}
		return recZaPrikaz.toCharArray();
		
		
		
	}
	
}
