package day013_OOPS_This_And_Static;

public class StaticKeyword_Main {

	public static void main(String[] args) {

		// accessing the static method / variable in a different class

		System.out.println(StaticKeyword.a); // StaticKeyword is a separate class is where the static variable a is
												// defined
		StaticKeyword.m1();

		StaticKeyword stk = new StaticKeyword(); // non static will work as long as we create an object
		stk.m2();

	}

}
