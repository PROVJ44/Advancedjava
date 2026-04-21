package adv3b;

import java.util.Scanner;

public class RemoveWhiteSpaceDemo {

    // User-defined function
    public static String removeWhitespace(String str) {
        // \\s matches all whitespace characters
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Function call
        String result = removeWhitespace(input);

        // Output
        System.out.println("String after removing whitespace: " + result);

        sc.close();
    }
}
