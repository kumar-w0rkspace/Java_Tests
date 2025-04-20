package day013_OOPS_This_And_Static;

public class StaticKeyword {

	static int a = 10; // static variable
	int b = 20; // non static

	static void m1() { // static method
		System.out.println("This is static method");
	}

	void m2() { // non static method
		System.out.println("This is non static method");
	}

	void m() { // non static method
		m1();
		m2();
		System.out.println(a);
		System.out.println(b);

	}

//______________MAIN METHOD_________________	
	public static void main(String[] args) {

		// accessing static variable and method without creating object
		m1();
		System.out.println(a);

//		System.out.println(b);  // cannot access since variable is non static
//		m2();

		// static methods accessing non static methods / variables through an object
		StaticKeyword st = new StaticKeyword();
		st.m2();
		System.out.println(st.b);

		// non static methods accessing everything directly
		st.m();

	}

}
