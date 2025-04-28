package day18_ExceptionHandling;

import java.util.Scanner;

public class AB_Handling_Exception {

	public static void main(String[] args) {
		// handling an exception
		System.out.println("Program Started...");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt(); // input 0

		try {

			System.out.println(100 / num);

		} catch (ArithmeticException e) {
			System.out.println("Try again with proper data");
		}
		System.out.println("Program completed");

		sc.close();

	}

}
