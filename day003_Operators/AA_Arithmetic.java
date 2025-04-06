package day003_Operators;

public class AA_Arithmetic {

	public static void main(String[] args) {

		// Arithmetic Operators + - * / %
		// Performed only on numbers

		int a = 200, b = 20;

		System.out.println("The sum of a and b are " + (a + b));
		System.out.println("The difference of a and b are " + (a - b));
		System.out.println("The multiplication of a and b are " + (a * b));
		System.out.println("The division of a and b are " + (a / b));
		System.out.println("The modulo division of a and b are " + (a % b));
		int additionResult = a + b + a;
		System.out.println("Addition = " + additionResult);
		int substractionResult = a - b - b;
		System.out.println("Substraction = " + substractionResult);
		int multiResult = a * b * a;
		System.out.println("Multiplication = " + multiResult);
		int divResult = a / b / a;
		System.out.println("Division = " + divResult);
		int moduloResult = a % b % a;
		System.out.println("Modulus = " + moduloResult);
	}

}
