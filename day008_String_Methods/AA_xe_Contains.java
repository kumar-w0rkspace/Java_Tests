package day008_String_Methods;

public class AA_xe_Contains {

	public static void main(String[] args) {
		// contains()
		// Note - contains() checks if a given string is part of main string or not
		// Note - contains() returns a boolean
		// Note - string is case sensitive
		String s = "this method always return a boolean";
		System.out.println(s.contains("thod")); // true
		System.out.println(s.contains("THOD")); // false
		
	}

}
