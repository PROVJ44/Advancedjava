package adv1b;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteNthElement {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Add colors
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Take input for n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position (n) to delete: ");
        int n = sc.nextInt();

        // Convert position to index (n-1)
        int index = n - 1;

        // Check valid index
        if (index >= 0 && index < colors.size()) {
            colors.remove(index);
            System.out.println("After Deleting " + n + "th element: " + colors);
        } else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}