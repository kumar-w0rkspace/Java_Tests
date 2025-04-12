package day009_Strings_And_Arrays;

import java.util.Scanner;

public class AA_Reverse_String {

	public static void main(String args[]) {

		// Reverse a string

		// Type 1
		// using length() and charAt()

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string to reverse");
		String userInput = sc.next();
		sc.close();

		String reverse = "";
		String charArray = userInput; // for type 2 example

		for (int i = userInput.length() - 1; i >= 0; i--) {
			reverse = reverse + userInput.charAt(i);

		}
		System.out.println("The reversed string is : " + reverse);
		System.err.println("______"); // space

		// Type 2
		// converting the string to character array

		char array[] = charArray.toCharArray();
		String charRev = "";
		for (int i = array.length - 1; i >= 0; i--) {
			charRev = charRev + array[i];
		}
		System.out.println(charRev);
		System.out.println("______"); // space

		// Type 3
		// StringBuffer

		StringBuffer strBff = new StringBuffer("inheritance"); // string buffer instantiation
		System.out.println(strBff);
		System.out.println("Reverse is : " + strBff.reverse()); // inbuilt method for string buffer
		System.out.println("_____"); // space

		// Type 4
		// StringBuilder

		StringBuilder strBld = new StringBuilder("Abstraction");
		System.out.println(strBld);
		System.out.println("Reverse is : " + strBld.reverse()); // inbuilt method for string builder

	}

}
