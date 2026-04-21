package adv1c;

import java.util.LinkedList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> colors = new LinkedList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Swap 1st (index 0) and 3rd (index 2) elements
        Collections.swap(colors, 0, 2);

        // Display updated list
        System.out.println("After Swapping (1st & 3rd): " + colors);
    }
}
