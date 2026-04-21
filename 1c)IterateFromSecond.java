package adv1c;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateFromSecond {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> colors = new LinkedList<>();

        // Add elements
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Black");

        // Display full list
        System.out.println("Original List: " + colors);

        // Create iterator starting from index 1 (2nd position)
        ListIterator<String> iteratorObj = colors.listIterator(1);

        // Iterate from 2nd element
        System.out.println("Iterating from 2nd position:");
        while (iteratorObj.hasNext()) {
            System.out.println(iteratorObj.next());
        }
    }
}
