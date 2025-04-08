package day005_b_Jump_Control_Statements;

public class AB_Continue {

	public static void main(String[] args) {
		// continue is used to not execute a certain condition
		// after that, the loop will continue

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; // this will skip the result in loop when i value = 5
			}

			System.out.println(i);
		}

	}

}
