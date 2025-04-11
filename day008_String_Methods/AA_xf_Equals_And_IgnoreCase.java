package day008_String_Methods;

public class AA_xf_Equals_And_IgnoreCase {

	public static void main(String[] args) {
		// equals(), equalsIgnoreCase()
		// Note - these are to compare between strings
		// Note - returns boolean value

		String str1 = "this is not a drill";
		String str2 = "this is not a drill";
		String str3 = "THIS IS NOT A DRILL";
		
		// Type 1
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // false
		System.out.println(str1.equals("this is not a drill")); // true
		System.out.println(str1.equals("this is not".concat(" a drill"))); // true
		
		// Type 2
		
		System.out.println(str1.equalsIgnoreCase(str3)); // true
		System.out.println(str1.equalsIgnoreCase("tHIs iS nOt".concat(" a dRilL"))); // true
		
	}

}
