package day013_OOPS_This_And_Static;

// int x, y ;  // global variables not possible in java
public class ThisKeyword {

	int x, y; // class variables

	ThisKeyword(int x, int y) {

		this.x = x; // using this keyword to differentiate between class variable and local variable
		this.y = y;
	}

//	void setData(int x, int y) {    // same for method also. this keyword is used to represent the variable in class
//		this.x = x;
//		this.y = y;
//	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

//________________MAIN METHOD_______________	
	public static void main(String[] args) {

		ThisKeyword thK = new ThisKeyword(20, 30);
		thK.display();

	}

}
