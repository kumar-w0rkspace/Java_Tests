package day16_c_OOPS_Hybrid_Inheritance;

public class Class_Child extends Class_Parent implements Interface_One, Interface_Two {
	// Hybrid inheritance including interfaces and class

	public void m1() {
		System.out.println("m1 from InterfaceOne: " + x);
	}

	public void m2() {
		System.out.println("m2 from InterfaceTwo: " + y);
	}

	public static void main(String[] args) {

		Class_Child chClass = new Class_Child();
		chClass.m1(); // method from interface one (parent 1)
		chClass.m2(); // method from interface two (parent 2)
		chClass.m3(); // method from parent class (parent 3)
	}

}
