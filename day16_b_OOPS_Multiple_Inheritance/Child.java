package day16_b_OOPS_Multiple_Inheritance;

public class Child implements IntOne, IntTwo {

	public void m1() {  // defining interface method
		System.out.println(strOne);
	}

	public void m2() {  // defining interface method
		System.out.println(strTwo);
	}

	void m3() {  // class method
		String strThree = "Class Method";
		System.out.println(strThree);
	}

	public static void main(String[] args) {
		// Multiple inheritance achieved through interfaces

		Child ch = new Child();
		ch.m1(); // 1st parent interface method
		ch.m2(); // 2nd parent interface method
		ch.m3(); // class specific method

	}

}
