package class13;

public class GridPractice2 {

	public static void main(String[] args) {
		for (int row = 0; row < 4; row++) {
			for (int col = 3 - row; col <= 3; col++) {
				System.out.println(row + "," + col);
			}
		}
	}
}
