package day011_OOPS_MethodsAndConstructors;

public class Greetings {

	// Type 1. No parameter --> No return value
	void methodNPNR() {
		System.out.println("Hello (NPNR) ");
	}

	// Type 2. No parameter --> Return value
	String methodNPR() {
		return "Hello (NPR) ";
	}

	// Type 3. Takes Parameter --> No return value
	void methodPNR(String name) {
		System.out.println("Hello (PNR) " + name);
	}

	// Type 4. Takes Parameter --> Return value
	String methodPR(String name) {
		return "Hello (PR) " + name;
	}

//__________________MAIN METHOD___________________
	public static void main(String[] args) {

		// Type 1
		Greetings gr = new Greetings();
		gr.methodNPNR();

		// Type 2
		String str = gr.methodNPR();
		System.out.println(str);
		System.out.println(gr.methodNPR());

		// Type 3
		gr.methodPNR("James");

		// Type 4
		String str2 = gr.methodPR("Dani");
		System.out.println(str2);
		System.out.println(gr.methodPR("Dani"));
	}

}
