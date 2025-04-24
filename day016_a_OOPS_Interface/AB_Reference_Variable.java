package day016_a_OOPS_Interface;

interface Animal {
	int height = 15;
	int weight = 50;

	void eat(); // Abstract method - signature, but no body

	default void sleep() {
		System.out.println("Animal is sleeping - Default Method");
	}

	static void run() {
		System.out.println("Animal is running - Static Method");
	}

}

public class AB_Reference_Variable implements Animal {

	public void eat() {
		System.out.println("Animal is eating - Abstract method");
	}

	void hunt() {
		System.out.println("Animal is hunting - Class specific method");
	}

	public static void main(String[] args) {

		Animal cat = new AB_Reference_Variable();
		cat.eat(); // Abstract method
		cat.sleep(); // Default method
		Animal.run();// Static method
		// cat.hunt(); not accessible since it don't belong to interface and hunt is
		// class method, cat is an interface variable

	}

}
