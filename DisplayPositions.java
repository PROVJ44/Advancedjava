package adv1c;

import java.util.LinkedList;

public class DisplayPositions {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> colors = new LinkedList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display elements with positions
        System.out.println("Elements and their positions:");

        for (int p = 0; p < colors.size(); p++) {
            System.out.println("Position " + p + " : " + colors.get(p));
        }
    }
}