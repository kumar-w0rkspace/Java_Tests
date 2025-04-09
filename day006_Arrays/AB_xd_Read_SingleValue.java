package day006_Arrays;

public class AB_xd_Read_SingleValue {

	public static void main(String[] args) {
		// Reading single value from a given array
		// Display random items in the array
		// Note - array index starts from 0

		String randomNames[][] = { { "Reynolds", "Cello", "Java" }, { "Rotomac", "Unimax", "Python" },
				{ "Stedlar", "Pierries", "CSharp" } };

		System.out.println(randomNames[0][1]); // printing the name cello
		System.out.println(randomNames[1][0]); // printing the name Rotomac
		System.out.println(randomNames[1][2]); // printing the name Python
		System.out.println(randomNames[2][0]); // printing the name Stedlar

	}

}
