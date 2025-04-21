package day014_OOPS_Inheritance;

class A {
	int x = 100;

	void display() {
		System.out.println("Class A: " + x);
	}
}

class B extends A { // enabling inheritance
	int y = 200;

	void show() {
		System.out.println("Class B: " + y);
	}
}

public class AA_SingleLevel_Inheritance {
// there can be only one class with public access modifier in a java file

	public static void main(String[] args) {

		// calling methods and variables on object B

		B myB = new B();
		System.out.println(myB.y); // variable from B class
		System.out.println(myB.x); // variable from A class

		myB.show(); // method from B class
		myB.display(); // method from A class

	}

}
