package day003_Operators;

public class AD_Increment {

	public static void main(String[] args) {
		// Increment ++var, var++

		// case 1
		int a = 10;
		System.out.println(a); // 10

		a = a + 1;
		System.out.println(a); // 11

		int b = 20;
		System.out.println(b); // 20
		b++; // same as b = b+1
		System.out.println(b); // 21

		// case 2
		// post increment
		// variable then addition means it assign first then adds itself
		int x = 50;
		int result = x++;
		System.out.println(result); // result is already 50, and then increment happened
		System.out.println(x);

		// case 3
		// pre increment

		int y = 40;
		int resutY = ++y;
		System.out.println(resutY); // increment happened then assignment happened

		// addition then variable means it will increment first then assign

	}

}
