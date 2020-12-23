package class17;

import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		Square square1 = new Square();
		Square square2 = new Square(Color.RED, 10);

		System.out.println(square1.color);
		System.out.println(square2.color);

		// Print out the side lengths of both squares
		System.out.println(square1.sideLength);
		System.out.println(square2.sideLength);

		square1.draw();
		square1.rotate();

		square2.draw();
		square2.rotate();
	}

}
