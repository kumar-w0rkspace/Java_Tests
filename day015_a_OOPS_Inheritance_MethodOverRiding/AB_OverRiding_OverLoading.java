package day015_a_OOPS_Inheritance_MethodOverRiding;

class ABC {
	void m1(int a) {
		System.out.println("ABC " + a);
	}

	void m2(int b) {
		System.out.println("ABC " + b);
	}

}

class XYZ extends ABC { // inheritance
	void m1(int a) {
		System.out.println("XYZ Overriding m1 from ABC " + (a * a)); // Overriding the implementation from class ABC
	}

	void m2(int a, int b) { // Overloading method from ABC
		System.out.println("XYZ OVerloading m2 from ABC " + (a + b));
	}
}

public class AB_OverRiding_OverLoading {

	public static void main(String[] args) {
		// Overloading and overloading with inheritance

		ABC myAbc = new ABC(); // Parent class
		myAbc.m1(5);
		myAbc.m2(10);

		XYZ myXyz = new XYZ(); // Child classd
		myXyz.m1(5); // Over riding
		myXyz.m2(10); // Inherited method
		myXyz.m2(20, 30); // Over loaded

	}

}
