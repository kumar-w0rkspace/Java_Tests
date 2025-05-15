package day17_a_Data_Conversion_Methods;

public class AA_StringToInteger {

	public static void main(String[] args) {
		// converting String to integer
		// Note - prerequisite - we should have numbers in string to convert

		// Type 1
		String s = "123456789";
		int sint = Integer.parseInt(s);
		System.out.println(sint);

		/*
		 * String s2 = "welcome"; int s2int = Integer.parseInt(s2);
		 * System.out.println(s2int); // Throws NumberFormatException error
		 */

		// Type 2
		// Adding two string by converting to integer
		String sAddOne = "10";
		String sAddTwo = "20";
		int addition = Integer.parseInt(sAddOne) + Integer.parseInt(sAddTwo);
		System.out.println(addition);
		
		// Type 3
		// Adding string and integer
		
		String str = "500";
		int num = 200;
		System.out.println(Integer.parseInt(str) + num); // 700
	}

}
