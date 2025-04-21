package day014_OOPS_Inheritance;

class One {
	int x;

	void showOne() {
		System.out.println("Class A: " + x);
	}
}

class Two extends One {
	int y = 350;

	void showTwo() {
		System.out.println("Class B: " + y);
	}
}

class Three extends Two {
	int z = 450;

	void showThree() {
		System.out.println("Class C: " + z);
	}
}

public class AB_MultiLevel_Inheritance {

	public static void main(String[] args) {

		// variables and methods from class One
		One myOne = new One();
		myOne.x = 1250;
		System.out.println(myOne.x);
		myOne.showOne();

		// variables and methods from class Two and One
		Two myTwo = new Two();
		myTwo.x = 2000; // Assigning value to variable of class One from object of Two
		System.out.println(myTwo.y);
		System.out.println(myTwo.x); // this value is for the variable x created on myTwo object
		myTwo.showTwo();
		myTwo.showOne();

		// variables and methods from class Three Two and One
		Three myThree = new Three();
		myThree.x = 5000; // Assigning value to variable of class One from object of Three
		System.out.println(myThree.z);
		System.out.println(myThree.y);
		System.out.println(myThree.x); // this value is for the variable x created on myThree object
		myThree.showThree();
		myThree.showTwo();
		myThree.showOne();

	}

}
