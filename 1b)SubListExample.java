package adv1b;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
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

        // Extract 1st and 2nd elements using subList
        // (index 0 to 2 → 0 included, 2 excluded)
        List<String> subList = colors.subList(0, 2);

        // Display sublist
        System.out.println("Extracted Elements (1st & 2nd): " + subList);
    }
}
