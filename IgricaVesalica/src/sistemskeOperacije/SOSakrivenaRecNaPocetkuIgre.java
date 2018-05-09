package sistemskeOperacije;

public class SOSakrivenaRecNaPocetkuIgre {

	public static char[] izvrsi(String recKojaSeTrazi) {
		String recZaPrikaz = "";
		for (int i = 0; i < recKojaSeTrazi.length(); i++) {
			if (recKojaSeTrazi.charAt(i) != ' ')
				recZaPrikaz += 'X';
			else
				recZaPrikaz += ' ';
		}
		return recZaPrikaz.toCharArray();
		
		
		
	}
	
}
