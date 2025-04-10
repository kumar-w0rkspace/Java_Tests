package day007_b_Scanner;

import java.util.Scanner;

public class AC_String {

	public static void main(String[] args) {
		// Take string inputs from console

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name");
		String name = sc.next();
		System.out.println("The entered name is " + name);
		sc.close();

	}

}
