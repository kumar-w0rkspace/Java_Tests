package day19_TypeCasting;

public class AB_DownCasting {

	public static void main(String[] args) {
		// we manually need to covert larger value to smaller by downacasting

		// eg 1
		long myLongValue = 35412323234L;
		int myIntValue = (int) myLongValue; // downcasting to integer format by adding int before the value
		System.out.println(myIntValue);

		// eg 2

		double myDoubleValue = 13513.235235;
		System.out.println((float) myDoubleValue); // converting to float

		// eg 3

		double d = 125.255;
		int i = (int) d;
		System.out.println(i); // 125 >>>here we lost the values after the decimal part since we downcasted
								// double to int

	}

}
