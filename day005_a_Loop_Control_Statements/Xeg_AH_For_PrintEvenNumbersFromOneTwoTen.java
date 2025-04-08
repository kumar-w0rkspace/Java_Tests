package day005_a_Loop_Control_Statements;

public class Xeg_AH_For_PrintEvenNumbersFromOneTwoTen {

	public static void main(String[] args) {
		// Print Even numbers from one two ten using for loop

		// Eg1 - Basic for

		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}

		System.out.println(" ");

		// Eg2 - for and If condition

		for (int j = 1; j <= 10; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}

	}

}
