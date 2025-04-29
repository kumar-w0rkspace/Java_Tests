package day19_TypeCasting;

public class AA_UpCasting {

	public static void main(String[] args) {
		// Note - Upcasting is an automatic process
		// eg 1
			int myIntValue = 500;
			long myLongValue = myIntValue; // we upcasted the int to long and it was automatic process by java
			System.out.println(myLongValue);
			
		// eg 2
			float myFloatValue = 23.501233F;
			double myDoubleValue = myFloatValue;
			System.out.println(myDoubleValue);
	}

}
