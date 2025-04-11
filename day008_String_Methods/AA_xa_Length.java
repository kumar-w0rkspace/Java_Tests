package day008_String_Methods;

import java.util.Scanner;

public class AA_xa_Length {

	public static void main(String[] args) {
		// Length of a user input string
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter some words");
		String userInput = sc.next();
		sc.close();
		int length = userInput.length();
		
		System.out.println("Your inputs are " + length + " long");
		System.out.println("Your inputs are "+ userInput.length() + " long");
		
	}

}
