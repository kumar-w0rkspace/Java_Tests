package day005_a_Loop_Control_Statements;

public class Xeg_AB_While_PrintEvenNumbersFromOneTwoTen {

	public static void main(String[] args) {
		// Print Even numbers from one two ten using while loop

		// Eg1 - Basic while

		int myNum = 2;
		
		while (myNum <= 10) {
			System.out.println(myNum);
			myNum += 2;
		}

		System.out.println(" "); // spacing

		// Eg2 - While and If condition

		int theNum = 1;
		
		while (theNum <= 10) {

			if (theNum % 2 == 0) {
				System.out.println(theNum);
			}
			theNum++;
		}

	}

}
