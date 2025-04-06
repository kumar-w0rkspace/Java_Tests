package day003_Operators;

public class AE_Decrement {

	public static void main(String[] args) {
		// Decrement Operator --var, var--

		// case 1
		int a = 200;
		a--;
		System.out.println(a); // 199

		int b = 300;
		--b;
		System.out.println(b); // 299

		// case 2

		int x = 400;
		int result = x--; // the variable result is already 400 and then decrement happened
		System.out.println(result);

		int y = 500;
		int resultY = --y;
		System.out.println(resultY); // the variable resultY has value of 499 because the decrement happened then it
										// was assigned to resultY

	}

}
