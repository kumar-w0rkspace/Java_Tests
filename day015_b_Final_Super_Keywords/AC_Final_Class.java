package day015_b_Final_Super_Keywords;

class A {
	void m() {
		System.out.println("Class A, Method m");
	}
}

final class B extends A {
	void m() {
		System.out.println("Class B, Method m - overridden");
	}
}

//	class C extends B{ // cannot extend from class B because , class B is locked by final
//		
//	}

public class AC_Final_Class {

	public static void main(String[] args) {

		A a = new A();
		a.m();

		B b = new B();
		b.m();

	}

}
