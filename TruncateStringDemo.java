package adv3c;

import java.util.Scanner;

public class TruncateStringDemo {

    // User-defined function
    public static String truncate(String str, int maxLength) {

        // If string is null or shorter than limit, return as it is
        if (str == null || str.length() <= maxLength) {
            return str;
        }

        // If maxLength is very small, just return "..."
        if (maxLength <= 3) {
            return "...";
        }

        // Truncate and add ellipsis
        return str.substring(0, maxLength - 3) + "...";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter max length: ");
        int length = sc.nextInt();

        // Function call
        String result = truncate(input, length);

        // Output
        System.out.println("Truncated String: " + result);

        sc.close();
    }
}