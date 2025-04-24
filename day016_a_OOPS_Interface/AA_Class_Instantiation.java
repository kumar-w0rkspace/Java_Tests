package day016_a_OOPS_Interface;

interface Shape {

	int length = 10; // final & static
	int width = 20; // final & static

	void circle(); // Abstract method - signature, but no body

	default void square() { // default methods are allowed
		System.out.println("Default Method - This is a square");
	}

	static void rectangle() { // static methods are allowed
		System.out.println("Static Method - This is a rectangle");
	}

}

public class AA_Class_Instantiation implements Shape { // implementing the interface

	public void circle() { // specifying public keyword explicitly to give visibility (by default, methods
							// in class are default)
		System.out.println("Abstract Method - This is a circle");
	}

	void triangle() {
		System.out.println("Class specific - This is a triangle");
	}

	public static void main(String[] args) {

		AA_Class_Instantiation intObj = new AA_Class_Instantiation();

		intObj.circle(); // Abstract method
		intObj.square(); // Default method
		intObj.triangle(); // Class specific method
		// intObj.rectangle(); // wont work. need to mention the interface name
		Shape.rectangle(); // Static method accessing from interface

	}

}
