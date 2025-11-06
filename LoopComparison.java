package SWECourseWork;

public class LoopComparison {
    public static void main(String[] args) {
        // First loop
        long start1 = System.nanoTime();
        int sum1 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum1 += i+25;
        }
        long end1 = System.nanoTime();

        // Second loop
        long start2 = System.nanoTime();
        int sum2 = 0;
        for (int i = 0; i < 1000000; i++) {
            sum2 += (int) Math.sqrt(i);
        }
        long end2 = System.nanoTime();

        System.out.println("Loop 1 time: " + (end1 - start1) + " ns");
        System.out.println("Loop 2 time: " + (end2 - start2) + " ns");
    }
}
//loop 1 runs longer
//when changing the math to i+25 and Math.sqrt(i), Loop 1 runs much slower (almost 2x as slow) than Loop 2