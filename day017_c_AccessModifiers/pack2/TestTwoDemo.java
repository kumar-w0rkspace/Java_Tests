package day17_c_AccessModifiers.pack2;
import day17_c_AccessModifiers.pack1.TestOne; // importing from package pack1, class TestOne
// import day17_c_AccessModifiers.pack1.*; // to import all classes from the pack1
public class TestTwoDemo extends TestOne {

	public static void main(String[] args) {

		TestOne tOne = new TestOne(); // import TestOne pack for obj creation
/*	
		System.out.println(tOne.x);  // the variable is not visible since it is private
		tOne.m1(); // the method is not visible since it is private
*/
		
		/*
		System.out.println(tOne.y); // the variable is in default and can be accessed only within the package
		tOne.m2(); // the method m2 is default modifier which is only visible within the package
		*/
		
		TestTwoDemo tTwo = new TestTwoDemo(); //creating obj
		System.out.println(tTwo.z);	// calling TestOne protected variable by inheritance
		tTwo.m3(); // calling TestOne protected method by inheritance
		
	}

}
