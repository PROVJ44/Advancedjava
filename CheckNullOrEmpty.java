package adv3b;

import java.util.Scanner;

public class CheckNullOrEmpty {

    // User-defined function
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Check condition
        if (isNullOrEmpty(input)) {
            System.out.println("The string is null or contains only whitespace.");
        } else {
            System.out.println("The string is NOT null or empty.");
        }

        sc.close();
    }
}