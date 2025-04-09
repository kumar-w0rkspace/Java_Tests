package day006_Arrays;

public class AB_xc_Size {

	public static void main(String[] args) {
		// Find the size of arrays
		
		float priceValue[][] = { { 30_000.999F, 25_235.599F }, { 8_991.9752F, 12_123.5786F },
				{ 12_457.2354F, 54_234.234F } };

		String employeeNames[][] = { { "Reynolds", "Cello" }, { "Rotomac", "Unimax" }, { "Stedlar", "Pierries" } };

		System.out.println("The row size of Price Value array is "+ priceValue.length); // length of the array
		System.out.println("The column size of Price Value array is "+ priceValue[0].length); // length of the array and index 0
		
	}

}
