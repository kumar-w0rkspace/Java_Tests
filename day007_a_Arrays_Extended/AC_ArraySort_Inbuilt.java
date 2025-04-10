package day007_a_Arrays_Extended;

import java.util.Arrays;

public class AC_ArraySort_Inbuilt {

	public static void main(String[] args) {
		// sort an array

		int numbers[] = { 2345, 235, 234, 356, 467, 34, 2345, 356, 34, 6356, 23 };
		// before sorting
		// Note - using Arrays class
		// ctrl shift + O to import necessary packages
		System.out.println("Before sorting " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("After sorting " + Arrays.toString(numbers));

		// Sorting Strings
		System.out.println("______________"); // space

		String name[] = { "Jax", "Ron", "Xen", "Oiv", "Elf" };

		System.out.println("Before sorting " + Arrays.toString(name));
		Arrays.sort(name);
		System.out.println("After sorting " + Arrays.toString(name));

		// Sorting Chars
		System.out.println("______________"); // space

		char grades[] = { 'F', 'E', 'C', 'D', 'B', 'A' };

		System.out.println("Before sorting " + Arrays.toString(grades));
		Arrays.sort(grades);
		System.out.println("After sorting " + Arrays.toString(grades));

	}

}
