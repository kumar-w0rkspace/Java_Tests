package day015_a_OOPS_Inheritance_MethodOverRiding;

class Bank {

	double roi() {
		return 0;
	}
}

class HDFC {

	double roi() {
		return 15.5;
	}
}

class SBI {

	double roi() {
		return 20.5;
	}
}

//________________MAIN METHOD_______________
public class AA_Method_OverRiding {

	public static void main(String[] args) {

		Bank myBank = new Bank(); // Bank class
		System.out.println(myBank.roi()); // Parent class method

		HDFC myHDFC = new HDFC(); // HDFC class
		System.out.println(myHDFC.roi()); // Bank class method is overrided with HDFC class

		SBI mySBI = new SBI(); // SBI class
		System.out.println(mySBI.roi()); // Bank class method is overrided with SBI class

	}

}
