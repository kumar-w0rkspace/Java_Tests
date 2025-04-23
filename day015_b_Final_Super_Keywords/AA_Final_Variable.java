package day015_b_Final_Super_Keywords;

class Test {
	int x = 100;
}

class Test2 {
	final int y = 50;

}

public class AA_Final_Variable {

	public static void main(String[] args) {

		Test myTest = new Test();
		System.out.println("x from Test class before change: " + myTest.x); // value from class Test

		myTest.x = 200; // changing the value of x
		System.out.println("x from Test class after change: " + myTest.x);

		Test2 myTest2 = new Test2();
		System.out.println("y from Test class2: " + myTest2.y); // value from class Test2

		// myTest2.y = 200; // not possible to change the value of y

	}

}
