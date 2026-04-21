package adv2;

public class StringOperationsDemo {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        String text = "Java Programming Language";
        System.out.println("Index of 'Program': " + text.indexOf("Program"));
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
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + combined);

        // 9. String Splitting
        String sentence = "Java is fun to learn";
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
        System.out.println("StringBuilder Result: " + sb);

        // 11. String Formatting
        String formatted = String.format("Name: %s, Age: %d", "Vinyas", 19);
        System.out.println("Formatted String: " + formatted);

        // 12. Validate Email using contains(), startsWith(), endsWith()
        String email = "example@gmail.com";

        if (email.contains("@") && 
            (email.endsWith(".com") || email.endsWith(".in")) &&
            !email.startsWith("@")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
