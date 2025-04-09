package day006_Arrays;

public class AA_SingleDimensional_Array {

	public static void main(String[] args) {
		/*
		 * Declare an array 
		 * add values into array 
		 * find size of an array (length) 
		 * read single value from an array
		 * read multiple values from an array
		 */

		// Declaring an array

		// first method (static) - used if we know the size of the array

		int firstMethod[] = new int[5];
		firstMethod[0] = 400;
		firstMethod[1] = 240;
		firstMethod[2] = 162;
		firstMethod[3] = 7234;
		firstMethod[4] = 1234;

		// second method (dynamic) - used if we don't know the size of the array

		int secondMethod[] = { 2734, 5234, 345, 5642, 111, 32 };

		// finding length of array

		System.out.println("length of first array = " + firstMethod.length);
		System.out.println("length of second array = " + secondMethod.length);

		// reading single value from array

		System.out.println("the third value is " + firstMethod[2]);

		// reading multiple values from an array
		System.out.println(" "); // space
		// method 1 - using for loop

		for (int i = 0; i < secondMethod.length; i++) {

			System.out.println(secondMethod[i]);

		// method 2 -using for each loop
		System.out.println(" "); // space

		for (int j : firstMethod) {
				System.out.println(j);
		}

		}
	}

}
