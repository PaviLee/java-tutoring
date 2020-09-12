package class8;

public class MakeOutWord {

	public static void main(String[] args) {
		System.out.println(makeOutWord("<<>>", "Yay"));
		System.out.println(makeOutWord("<<>>", "WooHoo"));
		System.out.println(makeOutWord("[[]]", "word"));
	}

	public static String makeOutWord(String out, String word) {
		String beg = out.substring(0, 2);
		String end = out.substring(2);
		return beg + word + end;
	}
}
