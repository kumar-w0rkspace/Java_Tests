package day17_c_AccessModifiers.pack1;

public class TestTwo {

	public static void main(String[] args) {

		TestOne tOne = new TestOne();
/*	
		System.out.println(tOne.x);  // the variable is not visible since it is private
		tOne.m1(); // the method is not visible since it is private
*/
		System.out.println(tOne.y);
		tOne.m2(); 

	
		
	}

}
