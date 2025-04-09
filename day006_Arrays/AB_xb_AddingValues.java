package day006_Arrays;

public class AB_xb_AddingValues {

	public static void main(String[] args) {
		// Add values to static array

		byte b[][] = new byte[2][2];
		b[0][0] = 40;
		b[0][1] = 50;

		b[1][0] = 30;
		b[1][1] = 90;

		char grades[][] = new char[1][1];

		grades[0][0] = 'A';
		grades[0][1] = 'B';

		grades[1][0] = 'C';
		grades[1][1] = 'D';

		// Declaring and adding values to dynamic array

		float priceValue[][] = { { 30_000.999F, 25_235.599F, 41_232.299F }, { 8_991.9752F, 12_123.5786F },
				{ 12_457.2354F, 54_234.234F } };

		String employeeNames[][] = { { "Reynolds", "Cello" }, { "Rotomac", "Unimax" }, { "Stedlar", "Pierries" } };

	}

}
