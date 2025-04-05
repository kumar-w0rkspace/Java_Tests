package day002_Variables_And_DataTypes;

public class AB_DataTypes {

	public static void main(String[] args) {

		// Numeric Data Types
		int a = 100, b = 200;
		System.out.println("The value of a + b is " + a + b); // Wrong output
		System.out.println("The value of a + b is " + (a + b)); // prioritize

		byte by = 120;
		System.out.println("Byte value is " + by);

		short sh = 3536;
		System.out.println("Short value is " + sh);

		long ln = 27366346546745674L; // adding L as literal
		System.out.println("Long value is " + ln);

		// Decimal Data Type

		float fl = 23423.34623F;
		System.out.println("Float decimal value is " + fl);

		double db = 345763467.326356724734673467;
		System.out.println("Double decimal value is " + db);

		// characters and Strings

		char grade = 'A';
		System.out.println("Character value is " + grade);

		String channelName = "Twitch Prime";
		System.out.println("String value is " + channelName);

		boolean bool = true;
		System.out.println("Boolean value is " + bool);

	}

}
