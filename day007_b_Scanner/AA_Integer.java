package day007_b_Scanner;

import java.util.Scanner;

public class AA_Integer {

	public static void main(String[] args) {
		// Taking input from console
		// Note - use Scanner class

		// int num = 20; // Hard coded value

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number"); // Asking user for input
		int num = sc.nextInt();

		System.out.println("The number provided by user is " + num);

		sc.close(); // closing the scanner to avoid leak
	}

}
