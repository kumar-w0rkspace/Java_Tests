package day005_a_Loop_Control_Statements;

public class AC_While_VS_Do_While {

	public static void main(String[] args) {

		// Example for while vs do while

		int numOne = 10; // here 10 is less than 5 and the condition is false and the code don't execute

		while (numOne <= 5) {
			System.out.println(numOne);
			numOne++;
		}

		System.out.println(" ");

		int numTwo = 10; // here 10 is less than 5 and the condition is false and the code still executes
							// once

		do {
			System.out.println(numTwo);
			numTwo++;
		} while (numTwo <= 5);
	}

}
