package adv3c;

import java.util.Scanner;

public class CapitalizeWordsDemo {

    // User-defined function
    public static String capitalizeWords(String str) {

        String[] words = str.split("\\s+"); // split by spaces
        String result = "";

        for (String word : words) {
            if (word.length() > 0) {
                String first = word.substring(0, 1).toUpperCase();
                String rest = word.substring(1).toLowerCase();
                result += first + rest + " ";
            }
        }

        return result.trim(); // remove extra space at end
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Function call
        String output = capitalizeWords(input);

        // Output
        System.out.println("Capitalized Sentence: " + output);

        sc.close();
    }
}