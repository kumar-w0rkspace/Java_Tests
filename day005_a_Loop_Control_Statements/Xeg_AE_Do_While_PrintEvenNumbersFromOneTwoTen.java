package day005_a_Loop_Control_Statements;

public class Xeg_AE_Do_While_PrintEvenNumbersFromOneTwoTen {

	public static void main(String[] args) {
		// Print Even numbers from one two ten using do while loop

		// Eg1: Basic Do while

		int theNum = 2;

		do {
			System.out.println(theNum);
			theNum += 2;
		} while (theNum <= 10);

		System.out.println(" "); // Space

		// Eg2: Do while and if condition

		int myNumber = 1;

		do {
			if (myNumber % 2 == 0) {
				System.out.println(myNumber);
			}
			myNumber++;
		} while (myNumber <= 10);

	}

}
