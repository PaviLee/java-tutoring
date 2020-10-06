package class11;

public class WhileLoop {

	public static void main(String[] args) {
		int i = 0; // counter var
		while (i <= 9) { // condition
			System.out.println(i);
			i++; // incrementor
		}

		i = 9;
		while (i <= 9 && i >= 0) {
			System.out.println(i);
			i--;
		}
	}
}
