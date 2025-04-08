package day005_b_Jump_Control_Statements;

public class AA_Break {

	public static void main(String[] args) {
		// While loops without conditions
		// Note - break is used to exit based on certain condition

		int num = 1;

		while (true) { // intentional infinite loop
			System.out.println("Hello " + num);
			num++;

			if (num > 10) {
				break; // when num value hits 10, this statement will exit from the infinite loop
			}
		}
	}

}
