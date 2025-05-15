package day19_TypeCasting;

class Parent {

	String name = "James";

	void m1() {
		System.out.println("Method m1 from Parent class..");
	}
}

class Child extends Parent {

	int id = 1234;

	void m2() {
		System.out.println("Method m2 from Child class");
	}
}

//________________MAIN METHOD_______________
public class AC_Object_TypeCasting {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.name); // parent
		c.m1(); // parent
		System.out.println(c.id); // child
		c.m2(); // child

		// UPCASTING
		Parent p = new Child(); // upcasting -> creating a child object in parent reference
		System.out.println(p.name); // parent
		p.m1(); // parent
// 		System.out.println(p.id); // child
//		p.m2(); // child
		// Note - we are not able to use the child class functions when we upcast the
		// child object to parent reference

		// DOWNCASTING
		Parent p2 = new Parent(); // create an object for parent
		Child c2 = (Child) p2; // downcast the parent to child
		System.out.println("downcast " + c2.name);
		System.out.println("downcast " + c2.id);
		c2.m1();
		c2.m2();

		// eg 2
		Child c3 = (Child) new Parent(); // downcasting
		System.out.println(c3.id);
		System.out.println(c3.name);
		c3.m1();
		c3.m2();
	}

}
