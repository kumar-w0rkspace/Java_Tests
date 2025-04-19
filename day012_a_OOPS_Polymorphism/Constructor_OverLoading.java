package day012_a_OOPS_Polymorphism;

public class Constructor_OverLoading {

	double width, height, depth;

	Constructor_OverLoading() { // Type 1

		width = height = depth = 0;
	}

	Constructor_OverLoading(double w, double h, double d) { // Type 2

		width = w;
		height = h;
		depth = d;

	}

	Constructor_OverLoading(double length) {  // Type 3

		width = height = depth = length;
	}

	double volume() {
		return width * height * depth;
	}

//_________________MAIN METHOD________________
	public static void main(String[] args) {

		// Type 1
		Constructor_OverLoading box = new Constructor_OverLoading();
		System.out.println(box.volume());

		// Type 2
		Constructor_OverLoading boxTwo = new Constructor_OverLoading(10.5, 20.5, 3.0);
		System.out.println(boxTwo.volume());

		// Type 3
		Constructor_OverLoading boxThree = new Constructor_OverLoading(12.5);
		System.out.println(boxThree.volume());

	}

}
