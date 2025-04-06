package day003_Operators;

public class AG_Ternary {

	public static void main(String[] args) {
		// Ternary Operators
		// Syntax --> var = expression ? result1: result2
		// if the expression is true then result one will be stored in the variable and
		// if the expression is false, then result two will be stored in the variable
		int a = 300, b = 400;
		int x = (a > b) ? a : b;
		System.out.println(x); // here a is not greater than b, so the second result is assigned to x

		int age = 18;
		String eligibility = (age >= 18) ? "Eligible" : "Not Eligible";
		System.out.println(eligibility);

	}

}
