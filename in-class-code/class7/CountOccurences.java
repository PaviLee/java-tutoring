package class7;

public class CountOccurences {

	public static void main(String[] args) {
		String str = "axa";
		int counter = 0;

		for (int i = 0; i < str.length(); i++) { // i <= str.length()-1;
			String s = str.substring(i, i + 1);
			if (s.equals("a")) {
				counter++;
			}
		}

		System.out.println(counter);

		String str2 = "xxxxxxxxxxxxxxxxxxxxxxxaxxxxxxxxxxxxxaxxxxxxxxxxxxxxxxxa";
		// TODO with indexOf
	}

}
