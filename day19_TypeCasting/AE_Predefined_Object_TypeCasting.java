package day19_TypeCasting;


// A b = (C) d

public class AE_Predefined_Object_TypeCasting {

	public static void main(String[] args) {
		
// Eg 1
	//	Object obj = new String ("Welcome");
	//	StringBuffer sb = (StringBuffer) obj;
		// Rule 1 - pass > (StringBuffer) has relation to obj
		// Rule 2 - pass > Storing (StringBuffer) to a StringBuffer variable
		// Rule 3 - fail > no relation between StringBuffer and String
		
// Eg 2
	//	String str = new String ("Welcome");
	//	StringBuffer sbf = (StringBuffer) str;
		// Rule 1 - fail > no relation between StringBuffer and String
		
// Eg 3
	//	Object o = new String("Welcome");
	//	StringBuffer sb = (String) o;
		// Rule 1 - pass > (there is relation between String and Object o)
		// Rule 2 - fail > (assignment is wrong. Converting String to StringBuffer)
		
// Eg 4
	//	String s = new String("welcome");
	//	StringBuffer sb = (String) s;
		// Rule 1 - pass > (there is relation between String and String)
		// Rule 2 - fail > (assignment is wrong. Converting String to StringBuffer)
				
// Eg 5
	//	Object o = new String("Welcome");
	//	StringBuffer sb = (StringBuffer) o;
		// Rule 1 - pass > there is relation between (StringBuffer) and o
		// Rule 2 - pass > conversion is correct. from stringbuffer to stringbuffer
		// Rule 3 - fail > underlying object of o is String and has no connection with StringBuffer
		
// Eg 6
		Object o = new String("Welcome");
		String s = (String) o;
		// Rule 1 - pass > there is relation between (String) and o
		// Rule 2 - pass > conversion is from String to String
		// Rule 3 - pass > underlying object of o is string and is same as (String)
		System.out.println(s);
		
		
		
		
	}

}
