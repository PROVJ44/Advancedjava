package adv3b;

import java.util.Scanner;

public class ReverseStringDemo {

    // User-defined function
    public static String reverseString(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Function call
        String result = reverseString(input);

        // Output
        System.out.println("Reversed String: " + result);

        sc.close();
    }
}
