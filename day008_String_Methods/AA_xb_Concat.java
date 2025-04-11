package day008_String_Methods;

import java.util.Scanner;

public class AA_xb_Concat {

	public static void main(String[] args) {
		// add two strings from user input

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some words");
		String inputOne = sc.next();
		System.out.println("Enter some more words");
		String inputTwo = sc.next();
		System.out.println("Enter some more and more words");
		String inputThree = sc.next();
		sc.close();

		// Type 1

		System.out.println(inputOne + inputTwo + inputThree);

		// Type 2
		System.out.println(inputOne.concat(inputTwo).concat(inputThree));

		// Type 3
		System.out.println(inputOne.concat(inputTwo) + inputThree);
		
		// Type 4
		System.out.println("This is ".concat("not user")+ " input");
		
		// Type 5
		System.out.println("This is" + " also not "+ "user input");
		
	}

}
