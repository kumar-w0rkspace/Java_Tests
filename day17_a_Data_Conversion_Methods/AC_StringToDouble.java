package day17_a_Data_Conversion_Methods;

public class AC_StringToDouble {

	public static void main(String[] args) {
		// converting string value to decimal
		
		String s1 = "10.5";
		String s2 = "20.3";
		
		double total = Double.parseDouble(s1) + Double.parseDouble(s2);
		System.out.println(total);

	}

}
