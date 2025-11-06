package SWECourseWork;

public class LoopTimerExample {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Time: " + (end - start) + " ms");
    }
}

//the time changes from 4ms to 90ms when the time changes from 1000000 to 100000000