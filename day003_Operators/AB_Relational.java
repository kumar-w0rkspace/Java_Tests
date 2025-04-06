package day003_Operators;

public class AB_Relational {

	public static void main(String[] args) {

		// Relational / comparison operators > >= < <= != ==
		// Can be used on any data types
		// Always return a boolean result

		int a = 20, b = 50, c = 90, d = 200, e = 90;
		System.out.println(a > b); // false
		System.out.println(a < b);
		System.out.println(c >= e);
		System.out.println(d <= c);
		System.out.println(c == e);
		System.out.println(a != b);
		boolean result = d != a;
		System.out.println(result);
	}

}
