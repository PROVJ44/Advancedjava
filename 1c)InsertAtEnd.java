package adv1c;

import java.util.LinkedList;

public class InsertAtEnd {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> colors = new LinkedList<>();

        // Add initial elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        // Display original list
        System.out.println("Original List: " + colors);

        // Insert element at the end using offerLast()
        colors.offerLast("Pink");

        // Display updated list
        System.out.println("After inserting at end: " + colors);
    }
}
