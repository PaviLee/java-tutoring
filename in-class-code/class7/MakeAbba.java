package class7;

public class MakeAbba {

	// Given two strings, a and b, return the result of putting them together in
	// the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

	public static void main(String[] args) {
		String a = "Purple";
		String b = "Yellow";

		String result = a + b + b + a;
		System.out.println(result);
	}

}
