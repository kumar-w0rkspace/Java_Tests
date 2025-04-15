package day009_String_Extended;

import java.util.Arrays;

public class AB_Mutable_Immutable {

	public static void main(String[] args) {
		// String - Mutable - changable
		// String Buffer and Builder - Immutable - cant be changed

		// Mutable example
		int a[] = { 40, 20, 90, 50, 30 };

		System.out.println(Arrays.toString(a)); // Before sort
		Arrays.sort(a); // Sort method is changing the array contents. since its mutable
		System.out.println(Arrays.toString(a)); // After sort

		// Immutable example
		// String str = new String("Welcome");
		String str = "Welcome";
		System.out.println(str); // welcome
		str.concat(" to java"); // does not change the original str value. since immutable
		String concatStr = str.concat(" to java");
		System.out.println(str); // welcome
		System.out.println(concatStr); // welcome to java

		// StringBuffer Mutable example
		StringBuffer strBff = new StringBuffer("This is a demo");
		strBff.append(" class to java");
		System.out.println(strBff); // This is a demo class to java

		// StringBuilder Mutable example
		StringBuilder strBld = new StringBuilder("With the use of Selenium");
		strBld.append(" automation was made easy");
		System.out.println(strBld); // With the use of Selenium automation was made easy

	}

}
