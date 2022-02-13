public class Kodune {
	public static String misMarsruut(String kohanimi) {
		if(kohanimi.equalsIgnoreCase("Astangu Rimi")) {
			return "TLN1";
		}
		if(kohanimi.equalsIgnoreCase("Tondi Selver")) {
			return "TLN2";
		}
		if(kohanimi.equalsIgnoreCase("Balti Jaama Turg")) {
			return "TLN3";
		}
		if(kohanimi.equalsIgnoreCase("T1")) {
			return "TLN4";
		}
		if(kohanimi.equalsIgnoreCase("Priisle Maxima")) {
			return "TLN5";
		}
		if(kohanimi.equalsIgnoreCase("Tabasalu Rimi")) {
			return "Harju 1";
		}
		if(kohanimi.equalsIgnoreCase("Raudalu Konsum")) {
			return "Harju 2";
		}
		if(kohanimi.equalsIgnoreCase("Rannarootsi Keskus")) {
			return "Lääne 1";
		}
		if(kohanimi.equalsIgnoreCase("Rapla Selver")) {
			return "Lääne 2";
		}
		return "Marsruuti ei leitud";
	}
	
	public static void main(String[] arg) {
		for(int i = 0; i < arg.length; i++) {
			System.out.println(misMarsruut(arg[i]));
		}
	}
	
}
