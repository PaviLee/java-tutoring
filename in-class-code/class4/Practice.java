package class4;

import java.awt.Color;
import java.awt.Graphics;

public class Practice {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(600, 600);
		Graphics pen = board.getBoard();

		board.clear();

		// Draw an outline of a pink oval.
		// Center: (200, 300)
		// Width: 100
		// Height: 50
		pen.setColor(Color.PINK);
		pen.drawOval(200 - 100 / 2, 300 - 50 / 2, 100, 50);

		// Draw a filled yellow square.
		// Center: (400, 400)
		// Side length: 100
		pen.setColor(Color.YELLOW);
		pen.fillRect(400 - 100 / 2, 400 - 100 / 2, 100, 100);

		// Draw a purple line across the screen from left to right.
		pen.setColor(Color.MAGENTA);
		pen.drawLine(0, 300, 600, 300);

		// Draw an orange line across the screen from top to bottom.
		pen.setColor(Color.ORANGE);
		pen.drawLine(300, 0, 300, 600);

		board.repaint();
	}

}
