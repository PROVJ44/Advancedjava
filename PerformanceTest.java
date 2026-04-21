package adv2;

public class PerformanceTest {

    public static void main(String[] args) {

        int iterations = 10000;

        // Test StringBuffer
        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuffer.append("AIET");
        }

        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;

        // Test StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }

        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;

        // Display results
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");
    }
}