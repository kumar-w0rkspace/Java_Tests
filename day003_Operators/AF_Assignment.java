package day003_Operators;

public class AF_Assignment {

	public static void main(String[] args) {
		// Assignment Operator = += -= *= /= %=
		// to shorthand use arithmetic operators
		// = is to assign the value from right side to left

		int x = 50;
		x = x + 5; // same as x += 5
		System.out.println(x); // 55

		int y = 20;
		y -= 10;
		System.out.println(y); // 10

		int myNumber = 2500;
		myNumber *= 2;
		System.out.println(myNumber);

		int yourNumber = 3000;
		yourNumber /= 3;
		System.out.println(yourNumber); // 1000

		int moduloNumber = 1022;
		moduloNumber %= 10;
		System.out.println(moduloNumber); // 2 (remainder)

	}

}
