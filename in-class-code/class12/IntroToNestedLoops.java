package class12;

public class IntroToNestedLoops {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			System.out.println("i = " + i);

			for (int j = 10; j >= 1; j--) {

				System.out.println("j = " + j);
			}

			System.out.println();
		}
	}
}
