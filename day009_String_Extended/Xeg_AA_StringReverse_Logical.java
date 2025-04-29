package day009_String_Extended;

public class Xeg_AA_StringReverse_Logical {

	public static void main(String[] args) {
		// Reverse a string using logical methods
		// for loop, length(), charAt()

		String words = "Encapsulation";
		String rev = "";

		for (int i = words.length() - 1; i >= 0; i--) {
			rev = rev + words.charAt(i);
		}
		System.out.println("Reverse is " + rev);

	}

}
