package class2;

public class RelationalOperators {

	public static void main(String[] args) {
		// (), &&, ||
		boolean b1 = -1 > 2 && (5 + 2 * 5 - 1 / 2 > 0) && 5 > -1
				&& (5 >= 23 || 1 == 1);
		System.out.println(b1);
	}

}
