package day006_Arrays;

public class AA_xe_Read_MultipleValues {

	public static void main(String[] args) {
		// Read all the values in an array

		// Method 1 - using for loop

		byte myByteArray[] = { 24, 23, 35, 112, 33, 53 };

		System.out.println("The array elements are ");

		for (int i = 0; i < myByteArray.length; i++) {
			System.out.println(myByteArray[i]);
		}

		// Method 2 - using for each loop
		// Note - use colon to iterate each element in array and execute the statement
		// inside for loop
		System.out.println(" "); // space

		String myStringArray[] = { "This", "is", "a", "String", "Array", "Example" };
		for (String j : myStringArray) {
			System.out.println(j);
		}

	}

}
