package day008_String_Methods;

import java.util.Arrays;

public class AA_xj_Split {

	public static void main(String[] args) {
		// split()
		// Note - split() splits the string into two parts based on a delimiter and the
		// return is an array
		// Non Delimiters * % ^ & () -

		String str = "when clicking signup the user has to agree to the terms";
		String a[] = str.split(" "); // delimiting words by space
		System.out.println(a[3]);
		System.out.println(Arrays.toString(a));

		String emails = "dumshradspro_jenga@eminem.com";
		String b[] = emails.split("@");
		System.out.println(b[0]); // dumshradspro_jenga

		System.out.println(Arrays.toString(b[0].split("_"))); // [dumshradspro, jenga]

	}

}
