package day004_Conditional_Control_Statements;

public class Xeg_AB_LargestOfThreeNumbers {

	public static void main(String[] args) {
		// Largest of three numbers
		// x, y, z
		// if x > y and x > z --> x is largest
		// if y > x and y > z --> y is largest
		// else z is largest

		int firstNumber = 200, secondNumber = -300, thirdNumber = 180;
		if (firstNumber > secondNumber && firstNumber > thirdNumber) {
			System.out.println(firstNumber+" is largest");
		} else if (secondNumber > thirdNumber && secondNumber > firstNumber) {
			System.out.println(secondNumber+ " is largest");
		} else {
			System.out.println(thirdNumber+ " is largest");
		}

	}

}
