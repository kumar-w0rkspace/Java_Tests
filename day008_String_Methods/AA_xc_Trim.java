package day008_String_Methods;

public class AA_xc_Trim {

	public static void main(String[] args) {
		// trim()
		// Note - trim() used to remove blank spaces from right and left side of the
		// string
		
		String s = "                name      ";
		System.out.println(s);
		System.out.println(s.length());
		
		String trimmed = s.trim();
		System.out.println(trimmed);
		System.out.println(trimmed.length());
		
		
	}

}
