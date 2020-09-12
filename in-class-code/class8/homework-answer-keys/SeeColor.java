package class8;

public class SeeColor {

	public static void main(String[] args) {
		System.out.println(seeColor("redxx"));
		System.out.println(seeColor("xxred"));
		System.out.println(seeColor("blueTimes"));
	}

	public static String seeColor(String str) {
		int indexRed = str.indexOf("red");
		int indexBlue = str.indexOf("blue");

		if (indexRed == 0) {
			return "red";
		} else if (indexBlue == 0) {
			return "blue";
		} else {
			return "";
		}
	}

}
