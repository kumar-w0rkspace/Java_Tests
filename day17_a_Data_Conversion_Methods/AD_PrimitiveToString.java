package day17_a_Data_Conversion_Methods;

public class AD_PrimitiveToString {

	public static void main(String[] args) {
		// convert primitive types to string
		// to convert all primitive data type to string, we can use String.valueOf(primitive type)
		
		int x = 124323462;
		double y = 123.235534;
		boolean z = true;
		boolean zz = false;
		char a ='A';
		
		String int1 = String.valueOf(x); // converting int to string
		System.out.println(int1);
		System.out.println(int1.length()); // length of string
		
		String db1 = String.valueOf(y); // converting double to string
		System.out.println(db1);
		System.out.println(db1.length()); // string method
		
		System.out.println(String.valueOf(z));
		System.out.println(String.valueOf(z).length());
		System.out.println(String.valueOf(zz));
		System.out.println(String.valueOf(zz).length());
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(a).length());
		
	}

}
