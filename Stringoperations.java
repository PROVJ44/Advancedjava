package adv3a;


public class Stringoperations {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of String1: " + str1.length());
        System.out.println("Character at index 2: " + str1.charAt(2));

        // 3. String Comparison
        String str3 = "HELLO";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java'? " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0,4): " + text.substring(0, 4));

        // 6. String Modification
        System.out.println("Replace: " + text.replace("Java", "Python"));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String str4 = "   Hello Java   ";
        System.out.println("Before trim: '" + str4 + "'");
        System.out.println("After trim: '" + str4.trim() + "'");

        // 8. String Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated String: " + combined);

        // 9. String Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("Splitted Words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        System.out.println("StringBuilder Output: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Marks: %d", "Vinyas", 95);
        System.out.println("Formatted String: " + formatted);

        // 12. Email Validation
        String email = "user@gmail.com";

        if (email.contains("@") &&
            !email.startsWith("@") &&
            (email.endsWith(".com") || email.endsWith(".in"))) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}