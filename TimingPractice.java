package SWECourseWork;

public class TimingPractice {
    public static double countBackwords(){
        int sum=0;
        long start1 = System.nanoTime();
        for(int i = 10000000; i >= 0; i--){
           sum+=i;
        }
        long end1 = System.nanoTime();
        return (end1-start1);
    }
    public static void multiplucationTable(int max){
        for(int i = 0; i <= max; i++){
            System.out.println(i*i);
        }
    }
    public static void main(String[] args) {
        double time1 = countBackwords();

        long start2 = System.nanoTime();
        multiplucationTable(100);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        multiplucationTable(500);
        long end3 = System.nanoTime();

        System.out.println("Time for countBackwords: " + time1 + "ns");
        System.out.println("Time for multiplicationTable (100x100): " + (end2-start2) + "ns");
        System.out.println("Time for multiplicationTable (500x500): " + (end3-start3)+ "ns");

    }
}
