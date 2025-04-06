package day003_Operators;

public class AC_Logical {

	public static void main(String[] args) {
		// Logical Operators && || !
		// Works with two boolean values
		// Returns a boolean value

		boolean x = true, y = false;

		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);

		boolean b1 = 10 > 20; // using relational operator for logical operator result
		System.out.println(b1); // false

		boolean b2 = 20 > 10;
		System.out.println(b2); // true

		System.out.println(b1 && b2); // false
		System.out.println(b1 || b2); // true

		System.out.println((10 < 20) && (20 > 10)); //true

	}

}
