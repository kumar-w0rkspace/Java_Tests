package day009_Strings_And_Arrays;

public class AA_Xeg_ab_StringReverse_CharacterArray {

	public static void main(String[] args) {
		// Reverse a string using character array

		String words = "Polymorphism";
		String rev = "";

		char a[] = words.toCharArray();
		for (int i = words.length() - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reverse string is " + rev);

	}

}
