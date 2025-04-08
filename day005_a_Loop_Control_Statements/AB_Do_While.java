package day005_a_Loop_Control_Statements;

public class AB_Do_While {

	public static void main(String[] args) {
		// Print from 1 to 10 using do while

		int myNum = 1;

		do {
			System.out.println(myNum);
			myNum++; // statements will be executed without checking condition
		} while (myNum <= 10); // checks for condition after statements are executed and will be looped till
								// condition is false

	}

}
