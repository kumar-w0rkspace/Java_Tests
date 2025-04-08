package day005_a_Loop_Control_Statements;

public class Xeg_AC_While_PrintTenToOneWithOddEvenTag {

	public static void main(String[] args) {
		// Print from ten to one with odd or even tag with while 

		int theNum = 10;

		while (theNum >= 1) {
			if (theNum % 2 != 0) {
				System.out.println("The Number " + theNum + " is Odd");
			} else {
				System.out.println("The Number " + theNum + " is Even");
			}
			theNum--;
		}

	}

}
