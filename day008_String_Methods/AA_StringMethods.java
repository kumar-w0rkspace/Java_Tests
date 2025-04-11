package day008_String_Methods;

import java.util.Arrays;

public class AA_StringMethods {

	public static void main(String[] args) {
		// length()
		// Note - length() returns the length of a string

		// Type 1
		String words = "Random String";
		int lengthWord = words.length();
		System.out.println(lengthWord);

		// Type 2
		System.out.println(words.length());

		// Type 3
		System.out.println("Welcome to string session".length());

		// concat()
		// Note - concat() joins strings
		String firstWord = "This is ";
		String secondWord = "a demo class";
		String thirdWord = " Java and Automation";

		// Type 1
		System.out.println(firstWord + secondWord + thirdWord);

		// Type 2
		// firstWord.concat(secondWord);
		System.out.println(firstWord.concat(secondWord).concat(thirdWord));

		// Type 3
		System.out.println("This is".concat(" Java Class").concat(" with Selenium"));

		// Type 4
		System.out.println(firstWord.concat(secondWord).concat(" session"));

		// trim()/
		// Note - trim() used to remove blank spaces from right and left side of the
		// string

		String trimDemo = "          ABC         ";
		System.out.println(trimDemo);
		System.out.println("Length before trim " + trimDemo.length());
		System.out.println(trimDemo.trim());
		System.out.println("Length after trim " + trimDemo.trim().length());

		// charAt()
		// Note - charAt() returns the character at certain index
		// Note - Index starts from 0

		String character = "Ruffelford";
		System.out.println(character.charAt(4)); // e
		System.out.println(character.charAt(0)); // R

		// contains()
		// Note - contains() checks if a given string is part of main string or not
		// Note - contains() returns a boolean

		System.out.println(character.contains("ford")); // true
		System.out.println(character.contains("fod")); // false
		System.out.println(character.contains("FORD")); // false

		System.out.println("  "); // space

		// equals(), equalsIgnoreCase()
		// Note - these are to compare between strings
		// Note - returns boolean value

		String st1 = "welcome";
		String st2 = "welcome";
		String st3 = "WELCOME";

		System.out.println(st1 == st2); // true
		System.out.println(st1.equals(st2)); // true
		System.out.println(st1.equals("welcome")); // true
		System.out.println(st1.equals(st3)); // false
		System.out.println(st1.equalsIgnoreCase(st3)); // true

		// replace()
		// Note - replace() replaces single or multiple(Sequence) of characters

		// Type 1 - single char
		String rep = "This random String random is here to teach about random replace";
		System.out.println(rep.replace('e', 'Y')); // This random String random is hYrY to tYach about random rYplacY

		// Type 2 - sequence of chars
		System.out.println(rep.replace("random", "REPLACED")); // This REPLACED String REPLACED is here to teach about
																// REPLACED replace

		// substring()
		// Note - substring() used to extract a portion from the main string
		// Note - we pass index number (Starting index from 0, ending index will be from
		// 1)

		String subString = "This random String random is here to teach about random replace";
		System.out.println(subString.substring(2, 11));

		// case shift
		// toUpperCase() - converts entire string to uppercase
		String caseShift = "WelCoMe tO stRINg sESSIon";
		System.out.println(caseShift.toUpperCase());

		// toLowerCase() - converts entire string to lowercase
		System.out.println(caseShift.toLowerCase());

		// split()
		// Note - split() splits the string into two parts based on a delimiter and the
		// return is an array

		String email = "thisguy@xyz.com";
		String splitMail[] = email.split("@");
		System.out.println(splitMail[0] + " " + splitMail[1]);

		String spacebar = "the time is midnight";
		String spaceSplit[] = spacebar.split(" ");
		System.out.println(spaceSplit[0] + " " + spaceSplit[3]); // the midnight
		System.out.println("_______"); // space
		String tempX = Arrays.toString(spaceSplit);
		System.out.println(tempX);

	}

}
