package day011_OOPS_MethodsAndConstructors;

public class Constructer_Types {

	int a, b;

	int sum() {
		return a + b;
	}

	Constructer_Types() { // non parameterized constructor

	}

	Constructer_Types(int x, int y) { // parameterized constructor
		a = x;
		b = y;
	}

// __________________MAIN METHOD___________________
	public static void main(String[] args) {

		Constructer_Types cdOne = new Constructer_Types();
		cdOne.a = 100;
		cdOne.b = 200;
		System.out.println(cdOne.sum());

		Constructer_Types cdTwo = new Constructer_Types(400, 500);
		System.out.println(cdTwo.sum());

	}

}
