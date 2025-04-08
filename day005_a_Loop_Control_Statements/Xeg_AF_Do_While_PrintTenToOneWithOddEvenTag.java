package day005_a_Loop_Control_Statements;

public class Xeg_AF_Do_While_PrintTenToOneWithOddEvenTag {

	public static void main(String[] args) {
		// Print from ten to one with odd or even tag with do while

		int num = 10;

		do {
			if (num % 2 != 0) {
				System.out.println("The number " + num + " is odd");
			} else {
				System.out.println("The number " + num + " is even");
			}
			num--;
		} while (num >= 1);

	}

}
