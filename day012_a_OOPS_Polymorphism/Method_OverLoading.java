package day012_a_OOPS_Polymorphism;

public class Method_OverLoading {

	int a = 10, b = 20;

	void sum() { // Type 1
		System.out.println(a + b);
	}

	void sum(int a, int b) { // Type 2
		System.out.println(a + b);
	}

	void sum(int a, double b) { // Type 3
		System.out.println(a + b);
	}

	void sum(double a, int b) { // Type 4
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) { // Type 5
		System.out.println(a + b + c);
	}

//__________________MAIN METHOD___________________	

	public static void main(String[] args) {

		Method_OverLoading add = new Method_OverLoading();
		// Type 1
		add.sum();

		// Type 2
		add.sum(10, 10);

		// Type 3
		add.sum(10, 15.5);

		// Type 4
		add.sum(25.5, 5);

		// Type 5
		add.sum(10, 20, 30);

		// Invalid because the definition is not created inside the OverLoading class
		// add.sum(10.5, 20.5,30.5);

	}

}
