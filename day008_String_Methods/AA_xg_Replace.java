package day008_String_Methods;

public class AA_xg_Replace {

	public static void main(String[] args) {
		// replace()
		// Note - replace() replaces single or multiple(Sequence) of characters

		String str = "This is an island in the Bahamas";

		// Type 1 - Single char
		System.out.println(str.replace('i', 'X')); // ThXs Xs an Xsland Xn the Bahamas
		System.out.println(str.replace('s', 'S')); // ThiS iS an iSland in the BahamaS

		// Type 2 - Sequence of chars
		System.out.println(str.replace("is", "was")); // Thwas was an wasland in the Bahamas
		System.out.println(str.replace("island", "inertia")); // This is an inertia in the Bahamas
		System.out.println(str.replace("Bahamas", "Belarus")); // This is an inertia in the Belarus

	}

}
