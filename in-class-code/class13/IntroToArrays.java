package class13;

public class IntroToArrays {

	public static void main(String[] args) {
		String name1 = "A";
		String name2 = "B";
		String name3 = "C";
		String name4 = "D";
		String name5 = "E";
		String name6 = "F";
		String name7 = "G";
		String name8 = "H";
		String name9 = "I";
		String name10 = "J";

		String[] names = new String[10];
		// names[index] = value;
		names[0] = "A";
		names[1] = "B";
		names[2] = "C";
		names[3] = "D";
		names[4] = "E";
		names[5] = "F";
		names[6] = "G";
		names[7] = "H";
		names[8] = "I";
		names[9] = "J";

		// System.out.println(names.length);
		//
		// for (int i = 0; i < names.length; i++) {
		// // System.out.println(i);
		// String name = names[i];
		// System.out.println("Name = " + name);
		// }

		int[] ids = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// System.out.println(ids.length);
		//
		// for (int i = 0; i <= ids.length - 1; i++) {
		// // System.out.println(i);
		// int id = ids[i];
		// System.out.println("ID = " + id);
		// }

		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			int id = ids[i];
			System.out.println(name + ", " + id);
		}
	}
}
