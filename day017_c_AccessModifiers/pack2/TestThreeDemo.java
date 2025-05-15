package day17_c_AccessModifiers.pack2;

import day17_c_AccessModifiers.pack1.TestOne;

public class TestThreeDemo {

	public static void main(String[] args) {
		// accessing public variable and method from TestOne pack

		TestOne t1 = new TestOne(); // importing from pack1
		System.out.println(t1.a); // a is from TestOne class, pack1 package with public modifier
		t1.m4(); // m3 is from TestOne class, pack1 package with public modifier

	}

}
