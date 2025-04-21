package day014_OOPS_Inheritance;
// NOT POSSIBLE TO IMPLEMENT MULTIPLE INHERITANCE

class noParaOne {
	// no parameter
}

class noParaTwo {
	// no parameter
}

public class AD_Multiple_Inheritance {

	public static void main(String[] args) {
		// Multiple inheritance is not possible in java

		// 1> class A extends B , C ==> syntactically wrong
		// 2> If two parent class have same method, then child will have ambiguity problem
		// 			means child will not know which method to take
		// 3> Even if no methods are explained in the classes, still not possible
		// 			since every class in java is extended from Object class

		noParaOne npO = new noParaOne();
		npO.equals(npO); // default methods from object class
		npO.toString(); // default methods from object class

		noParaTwo npT = new noParaTwo();
		npT.equals(npT); // default methods from object class
		npT.toString(); // default methods from object class

	}

}
