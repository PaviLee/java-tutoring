package class3;

import java.awt.Color;
import java.awt.Graphics;

public class ShapesCheatsheet {

	public static void main(String[] args) {
		DrawingBoard board = new DrawingBoard(600, 600);
		Graphics pen = board.getBoard();

		board.clear();

		pen.setColor(Color.RED);
		// x, y, width, height
		pen.fillOval(100, 100, 100, 100);

		pen.setColor(Color.BLUE);
		// x, y, width, height
		pen.drawRect(400, 300, 100, 200);

		pen.setColor(Color.GREEN);
		// x1, y1, x2, y2
		pen.drawLine(0, 600, 600, 0);

		board.repaint();
	}

}
