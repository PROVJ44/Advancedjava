package basics;

import java.util.*;

public class ListOperations {

    // 1. Adding elements
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
    }

    // 2. Add element at specific index
    public static void addAtIndex(List<String> list) {
        list.add(1, "Mango");
    }

    // 3. Add multiple elements
    public static void addMultiple(List<String> list) {
        List<String> more = Arrays.asList("Grapes", "Pineapple");
        list.addAll(more);
    }

    // 4. Access elements
    public static void accessElements(List<String> list) {
        System.out.println("Element at index 2: " + list.get(2));
    }

    // 5. Update elements
    public static void updateElements(List<String> list) {
        list.set(0, "Green Apple");
    }

    // 6. Remove elements
    public static void removeElements(List<String> list) {
        list.remove("Banana");
    }

    // 7. Search elements
    public static void searchElements(List<String> list) {
        System.out.println("Contains Orange? " + list.contains("Orange"));
    }

    // 8. List size
    public static void listSize(List<String> list) {
        System.out.println("Size: " + list.size());
    }

    // 9. Iterating using for-each
    public static void iterateList(List<String> list) {
        System.out.println("Iterating using for-each:");
        for (String item : list) {
            System.out.println(item);
        }
    }

    // 10. Using Iterator
    public static void useIterator(List<String> list) {
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // 11. Sorting
    public static void sortList(List<String> list) {
        Collections.sort(list);
    }

    // 12. Sublist
    public static void subListExample(List<String> list) {
        System.out.println("Sublist (0 to 2): " + list.subList(0, Math.min(2, list.size())));
    }

    // 13. Clearing list
    public static void clearList(List<String> list) {
        list.clear();
        System.out.println("List cleared.");
    }

    public static void performOperations(List<String> list) {
        addElements(list);
        addAtIndex(list);
        addMultiple(list);
        accessElements(list);
        updateElements(list);
        removeElements(list);
        searchElements(list);
        listSize(list);
        iterateList(list);
        useIterator(list);
        sortList(list);
        System.out.println("After Sorting: " + list);
        subListExample(list);
        clearList(list);
        System.out.println("Final List: " + list);
    }

    public static void main(String[] args) {

        System.out.println("----- ArrayList Operations -----");
        List<String> arrayList = new ArrayList<>();
        performOperations(arrayList);

        System.out.println("\n----- LinkedList Operations -----");
        List<String> linkedList = new LinkedList<>();
        performOperations(linkedList);
    }
}
