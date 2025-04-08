package day005_a_Loop_Control_Statements;

public class Xeg_AI_For_PrintTenToOneWithOddEvenTag {

	public static void main(String[] args) {
		// Print from ten to one with odd or even tag with for

		for (int i = 10; i >= 1; i--) {
			if (i % 2 != 0) {
				System.out.println("The number " + i + " is odd");
			} else {
				System.out.println("The number " + i + " is even");
			}
		}

	}

}
