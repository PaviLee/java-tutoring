package class7;

public class WarmUp {

	public static void main(String[] args) {
		String str = "12345ABC";

		for (int i = 0; i < str.length(); i++) { // i <= str.length()-1;
			char c = str.charAt(i);
			System.out.println(c);
		}

		System.out.println();

		for (int i = 0; i < str.length(); i++) { // i <= str.length()-1;
			String s = str.substring(i, i + 1);
			System.out.println(s);
		}
	}

}
