package day015_b_Final_Super_Keywords;

public class AD_x_SuperMain {

	public static void main(String[] args) {

		AD_Super animal = new AD_Super();
		System.out.println(animal.color); // Black

		Dog dog = new Dog();
		dog.display(); // White
		dog.eat(); // Eating meat...

		Cat cat = new Cat();
		cat.display(); // Black instead of Brown since it is mentioned super.color
		cat.eat(); // eating fish.. and eating.... // since we mentioned super method also
	}

}
