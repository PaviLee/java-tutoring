package class15;

public class ArrayDeepDive {

	public static void main(String[] args) {

//		int[] nums = new int[5];
//
//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
//		System.out.println(nums[4]);
//
//		String[] words = new String[5];
//
//		for (int i = 0; i <= 4; i++) {
//			String word = words[i];
//			System.out.println(word);
//		}

//		words[5] = "Hello";

		double[] decimals = new double[10];

		decimals[0] = 0.1;
		decimals[1] = 0.2;
		decimals[2] = 0.3;
		decimals[3] = 0.4;
		decimals[4] = 0.5;
		decimals[5] = 0.6;
		decimals[6] = 0.7;
		decimals[7] = 0.8;
		decimals[8] = 0.9;
		decimals[9] = 1.0;

//		for (int i = 0; i < 10; i++) {
//			double decimal = decimals[i];
//			System.out.println(decimal);
//		}

		System.out.println("Decimals array: ");
		printArray(decimals);
		System.out.println();

		double[] copy = new double[11];

		for (int i = 0; i < 10; i++) {
			// Copy all values from decimals to copy
			double decimal = decimals[i];
			copy[i] = decimal;
		}

		// Add value for index 10 in array copy
		copy[10] = 1.1;

		System.out.println("Copy array: ");
		printArray(copy);
		System.out.println();
	}

	public static void printArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			double decimal = array[i];
			System.out.println(decimal);
		}
	}
}
