package class12;

public class LoopingStrings {

	public static void main(String[] args) {
		String str = "Hi";

		// str.charAt(index);
		// str.length();

		System.out.println("length = " + str.length());

		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);

			for (int j = 1; j < 3; j++) {
				System.out.println("i = " + i + ", " + c);
			}
		}
	}
}
