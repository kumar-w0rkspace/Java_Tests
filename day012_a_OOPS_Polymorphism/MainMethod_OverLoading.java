package day012_a_OOPS_Polymorphism;

public class MainMethod_OverLoading {

	void main(int x) {
		System.out.println(x);
	}

	void main(String s) {
		System.out.println(s);
	}

	void main(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}

//__________________MAIN METHOD___________________
	public static void main(String[] args) {

		MainMethod_OverLoading myMain = new MainMethod_OverLoading();
		myMain.main(50);
		myMain.main("James");
		myMain.main("Rock", "Star");

	}

}
