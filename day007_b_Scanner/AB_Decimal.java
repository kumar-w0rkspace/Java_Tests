package day007_b_Scanner;

import java.util.Scanner;

public class AB_Decimal {

	public static void main(String[] args) {
		// Take decimal input from console

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a decimal:");

		double userInput = sc.nextDouble();
		System.out.println("User input is " + userInput);

		sc.close();
	}

}
