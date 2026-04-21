package adv3c;

import java.util.Scanner;

public class WordCountDemo {

    // User-defined function
    public static int countWords(String str) {

        // Check null or empty
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }

        // Split by one or more spaces
        String[] words = str.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Function call
        int count = countWords(input);

        // Output
        System.out.println("Number of words: " + count);

        sc.close();
    }
}
