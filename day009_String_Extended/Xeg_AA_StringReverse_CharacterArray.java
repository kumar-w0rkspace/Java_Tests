package day009_String_Extended;

public class Xeg_AA_StringReverse_CharacterArray {

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
