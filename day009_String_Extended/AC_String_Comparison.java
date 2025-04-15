package day009_String_Extended;

public class AC_String_Comparison {

	public static void main(String[] args) {
		// equals and ==
		// equals check for the value, == checks for the object
		// new keyword creates an object

		String str1 = "welcome"; // variable
		String str2 = "welcome"; // variable
		String str3 = new String("welcome"); // object
		String str4 = new String("welcome"); // object
		String str5 = str4;

		System.out.println(str1 == str2); // true because values are same
		System.out.println(str1.equals(str2)); // true because values are same
		System.out.println(str3 == str4); // FALSE BECAUSE OBJECTS ARE NOT THE SAME
		System.out.println(str3.equals(str4)); // true because values are same
		System.out.println(str1 == str3); // FALSE because str3 is an object
		System.out.println(str1.equals(str3)); // true since the values are same
		System.out.println(str4 == str5); // true because objects are same

	}

}
