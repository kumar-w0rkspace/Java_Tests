package day009_Strings_And_Arrays;

public class AB_Xeg_ac_Conversion {

	public static void main(String[] args) {
		// converting string to stringbuilder
		
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam scelerisque velit sit amet nisi convallis, vitae interdum ligula pulvinar. Proin interdum, lorem ut fermentum convallis, ligula elit laoreet eros, vel tincidunt nunc nibh vel enim. Sed nec nisl felis. Mauris facilisis sapien at lorem viverra, id feugiat elit fermentum. Ut gravida purus nec lorem porttitor malesuada. Pellentesque dictum metus ac nisi ultricies, non ultricies neque consequat. Suspendisse potenti. Donec vel augue vel sem sollicitudin cursus non ac lacus. In sagittis lacus vitae mi dapibus, non tincidunt metus vehicula. Phasellus ac dui non libero hendrerit fringilla. Integer elementum orci sit amet est dapibus tincidunt.";
		StringBuilder strBld = new StringBuilder(str);
		System.out.println(strBld.reverse()); // reversing the string
		System.out.println(strBld.length()); // length of the string

	}

}
