package day006_Arrays;

public class AB_TwoDimensional_Array {

	public static void main(String[] args) {
		// Note - multi dmnl array will have rows and columns

		// 1. Declaring an array

		// first method (static) - used if we know the size of the array

		int num[][] = new int[2][2];
		num[0][0] = 20; // first row, first column
		num[0][1] = 30; // first row, second column

		num[1][0] = 40; // second row, first column
		num[1][1] = 50; // second row, second column

		// second method (dynamic) - used if we don't know the size of the array

		int myNum[][] = { { 5, 9 }, { 20, 23 }, { 40, 23 }, { 43, 11 }, { 98, 30, } };
		// Note - the whole array is inside a curly braces and each row, column elements
		// are inside another curly braces

		// 2. Size of the array
		// Note - we need to find the length of rows and then the length of the first
		// row too

		byte myByteNum[][] = { { 5, 9 }, { 20, 23 }, { 40, 34 }, { 43, 11 }, { 98, 30, 20 } };

		System.out.println("The length of rows = " + myByteNum.length);
		System.out.println("The length of columns = " + myByteNum[0].length); // here the index 0 has column length also

		// 3. Read single value from an array
		// read the value from third row, 2nd column

		System.out.println("The value in third row second column is " + myByteNum[2][1]);
		System.out.println("______"); // space
		// 4. Read all the data
		// Note - use for loop inside for loop (nested for loop)

		// basic for loop

		short myShortNum[][] = { { 300, 700, 222 }, { 210, 450, 511 }, { 900, 217, 123 }, { 423, 987, 562 },
				{ 862, 972, 111 }, { 203, 433, 504 }, { 154, 742, 214 } };

		for (int row = 0; row < myShortNum.length; row++) { // forloop for the rows
			for (int column = 0; column < myShortNum[row].length; column++) { // forloop for the columns
				System.out.print(myShortNum[row][column] + " "); // using print instead of println to skip the line and
																	// adding a space
			}
			System.out.println(" ");
		}
		System.out.println(" "); // space
		
		
		// enhanced for loop

		int myintNum[][] = { { 700, 222 }, { 450, 511 }, { 217, 123 }, { 987, 562 }, { 972, 111 }, { 433, 504 },
				{ 742, 214 } };

		for (int tempArr[] : myintNum) {
			for (int tempInt : tempArr) {
				System.out.print(tempInt + " ");
			}
			System.out.println(" ");
		}

	}

}
