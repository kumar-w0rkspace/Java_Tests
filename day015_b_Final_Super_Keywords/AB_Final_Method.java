package day015_b_Final_Super_Keywords;

class TestOne {

	void m() {
		System.out.println("Method from Test One class");
	}
}

class TestTwo extends TestOne {

	final void m() { // adding final keyword to lock the method from overriding
		System.out.println("Method form Test Two class"); // over riding
	}
}

class TestThree extends TestTwo {

//	void m() {       // This method cannot be overridden because method m from class TestTwo is final method
//	}

}

public class AB_Final_Method {

	public static void main(String[] args) {

		TestOne myTestOne = new TestOne();
		myTestOne.m();

		TestTwo myTestTwo = new TestTwo();
		myTestTwo.m();
		myTestTwo.m();

		TestThree myTestThree = new TestThree();
		myTestThree.m();
	}

}
