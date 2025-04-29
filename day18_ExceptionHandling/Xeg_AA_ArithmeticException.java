package day18_ExceptionHandling;

import java.util.Scanner;

public class Xeg_AA_ArithmeticException {

	public static void main(String[] args) {
		// examples for arithmetic exception
		
		System.out.println("Program Started...");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt(); // input 0
		System.out.println(100 / num); // here we get arithmetic exception at line 15 because 100 / 0 is not defined and throws exception

		System.out.println("Program completed");
		

		sc.close();
	}

}
