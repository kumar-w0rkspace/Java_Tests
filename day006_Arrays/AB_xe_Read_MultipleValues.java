package day006_Arrays;

public class AB_xe_Read_MultipleValues {

	public static void main(String[] args) {
		// Read all the values in an array

		// Method 1 - using for loop

		String items[][] = { { "Book", "Paper" }, { "Car", "Laptop" }, { "Scale", "Glass" } };

		for (int itemRow = 0; itemRow < items.length; itemRow++) {
			for (int itemCol = 0; itemCol < items[itemRow].length; itemCol++) {
				System.out.print(items[itemRow][itemCol] + " "); // Replacing println with print to skip the next line
																	// output
				// and adding a space after to format
			}
			System.out.println(" "); // adding space for output formatting
		}
		System.out.println("_________"); // space
		// Method 2 - using for each loop
		// Note - use colon to iterate each element in array and execute the statement
		// inside for loop

		for (String tempStr[] : items) {
			for (String tempTwoStr : tempStr) {
				System.out.print(tempTwoStr + " ");
			}
			System.out.println(" ");
		}

		System.out.println("____________"); // space

		int theNumbers[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 }, { 11, 12, 13 } };
		for (int tempArr[] : theNumbers) {
			for (int tempTwoArr : tempArr) {
				System.out.print(tempTwoArr + " ");
			}
			System.out.println(" ");
		}
	}

}
