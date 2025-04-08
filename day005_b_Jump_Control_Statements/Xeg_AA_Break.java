package day005_b_Jump_Control_Statements;

public class Xeg_AA_Break {

	public static void main(String[] args) {
		// break is used to exit form a loop
		// Note - no other statements will be executed when we use break

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break; // this will exit the loop when i value = 5
			}

			System.out.println(i); // after break, this statement will not execute
		}

	}

}
