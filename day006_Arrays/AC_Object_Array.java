package day006_Arrays;

public class AC_Object_Array {

	public static void main(String[] args) {
		// Used to store multiple data types into a single variable
		// Generally called as heterogeneous data type

		Object a[] = { 10, 12.9, 'C', "Welcome", true };

		// printing values using for loop

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(" "); // Space

		// printing with enhanced for loop

		for (Object temp : a) {
			System.out.println(temp);
		}

	}

}
