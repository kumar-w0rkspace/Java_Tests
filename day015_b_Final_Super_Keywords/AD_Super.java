package day015_b_Final_Super_Keywords;
//implementing super keyword

public class AD_Super {

	String color = "Black";

	void eat() {
		System.out.println("Eating....");
	}
}

class Dog extends AD_Super {
	String color = "White";

	void display() {
		System.out.println(color);
	}

	void eat() {
		System.out.println("Eating meat...");
	}
}

class Cat extends AD_Super {
	String color = "Brown";

	void display() {
		System.out.println(super.color); // invoking parent class AD_Super variable
	}

	void eat() {
		System.out.println("Eating fish...");
		super.eat(); // invoking parent class method
	}
}
