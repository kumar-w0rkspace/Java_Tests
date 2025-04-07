package day004_Conditional_Control_Statements;

public class AD_Nested_If_Else {

	public static void main(String[] args) {
		// we can add another if condition inside an if condition

		if (true) {
			if (false) {
				System.out.println("abc");
			} else {
				System.out.println("xyz");
			}
		} else {
			System.out.println("123");
		}

	}

}
