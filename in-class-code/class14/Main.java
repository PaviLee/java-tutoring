package class14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		String[] words = textToArray("resources/words.txt");

		for (int j = 0; j < words.length; j++) {
			System.out.println(j + "th: " + words[j]);
		}

		int result = countWordsWithE(words);
		System.out.println("Result = " + result);
	}

	public static String[] textToArray(String pathname) throws FileNotFoundException {

		Scanner scanner = null;
		scanner = new Scanner(new File(pathname));

		String[] words = new String[100];

		int i = 0;

		while (scanner.hasNextLine()) {
			words[i] = scanner.nextLine();
			System.out.println("i = " + i);
			i++;
		}

		return words;
	}

	public static int countWordsWithE(String[] words) {

		int count = 0;

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (word.contains("e")) {
				count++;
			}
		}

		return count;
	}
}
