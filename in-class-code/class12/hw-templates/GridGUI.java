package class12;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This is a GUI representation for Grid Practice. Only modify where the
 * comments says TODO.
 * 
 * @author Rissa Li
 * @version October 11, 2020
 */
public class GridGUI {

	/**
	 * Run the program from here.
	 * 
	 * @param args
	 *            command line arguments - not used
	 */
	public static void main(String[] args) {

		final int numSquares = 4;
		final int margin = 100;
		final int squareSize = 100;

		final Color borderColor = Color.BLACK;
		final Color fillColor = Color.CYAN;

		DrawingBoard board = new DrawingBoard(
				margin * 2 + numSquares * squareSize,
				margin * 2 + numSquares * squareSize);
		Graphics pen = board.getBoard();

		/* ######################################################### */

		for (int row = 0; row < 4; row++) { // TODO: modify loop
			for (int col = 0; col < 4 - row; col++) { // TODO: modify loop
				System.out.println(row + ", " + col);
				fillSquare(pen, fillColor, margin, row, col, squareSize);
			}
		}

		/* ######################################################### */

		drawGrid(pen, borderColor, margin, numSquares, squareSize);
	}

	/**
	 * Draws the grid.
	 * 
	 * @param pen
	 *            Graphics
	 * @param borderColor
	 *            Color
	 * @param margin
	 *            int
	 * @param numSquares
	 *            int
	 * @param squareSize
	 *            int
	 */
	public static void drawGrid(Graphics pen, Color borderColor, int margin,
			int numSquares, int squareSize) {

		pen.setColor(borderColor);

		int pt1 = margin;
		int pt2 = margin + numSquares * squareSize;

		for (int i = 0; i < numSquares + 1; i++) {
			int newPt = margin + i * squareSize;
			pen.drawLine(newPt, pt1, newPt, pt2);
			pen.drawLine(pt1, newPt, pt2, newPt);
		}
	}

	/**
	 * Fills the given square with the given color.
	 * 
	 * @param pen
	 *            Graphics
	 * @param fillColor
	 *            Color
	 * @param margin
	 *            int
	 * @param row
	 *            int
	 * @param col
	 *            int
	 * @param squareSize
	 *            int
	 */
	public static void fillSquare(Graphics pen, Color fillColor, int margin,
			int row, int col, int squareSize) {

		pen.setColor(fillColor);
		pen.fillRect(margin + col * squareSize, margin + row * squareSize,
				squareSize, squareSize);
	}
}
