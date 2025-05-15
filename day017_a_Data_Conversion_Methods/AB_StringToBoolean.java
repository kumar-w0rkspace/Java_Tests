package day17_a_Data_Conversion_Methods;

public class AB_StringToBoolean {

	public static void main(String[] args) {
		// convert string to boolean
		// can only convert true or false
		// Note - only the value true can be converted to true boolean value. all else are false
		
		String sOne = "xyzabcd";
		boolean bool = Boolean.parseBoolean(sOne);
		System.out.println(bool); // false
		
		String sTwo = "true";
		System.out.println(Boolean.parseBoolean(sTwo)); // true

	}

}
