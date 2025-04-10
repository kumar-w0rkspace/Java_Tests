package day007_a_Arrays_Extended;

import java.util.Arrays;
import java.util.Scanner;

public class AE_InputData_IntoArray {

	public static void main(String[] args) {
		// make a dynamic array and add data into it at runtime

		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter " + i + " Value "); // each index has to be looped to enter and go next index
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("The entered numbers are " + Arrays.toString(a));
	}

}
