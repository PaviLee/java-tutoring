package class17;

import java.awt.Color;

public class ArraysWithObjects {

	public static void main(String[] args) {

		int[] numbers = new int[10];
		Square[] squares = new Square[10];

		squares[0] = new Square(Color.RED, 20);
		squares[1] = new Square(Color.BLACK, 10);
		squares[2] = new Square(Color.BLUE, 2);
		squares[3] = new Square(Color.PINK, 40);
		squares[4] = new Square(Color.CYAN, 56);
		squares[5] = new Square(Color.DARK_GRAY, 10);
		squares[6] = new Square(Color.GRAY, 21);
		squares[7] = new Square(Color.MAGENTA, 10);
		squares[8] = new Square(Color.GREEN, 220);
		squares[9] = new Square(Color.ORANGE, 230);

		for (int i = 0; i < squares.length; i++) {
//			System.out.println(squares[i].color);
			squares[i].rotate();
		}

	}

}
