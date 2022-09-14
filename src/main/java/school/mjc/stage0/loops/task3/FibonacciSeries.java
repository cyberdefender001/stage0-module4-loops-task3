package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fib = 0;
        int fib1 = 0;
        int fib2 = 1;
        //System.out.println(0);
        System.out.println(fib1);
        System.out.println(fib2);
        for (int i = 0; i < lastFibonacci; i++) {
            fib = fib1 + fib2;
            fib2 = fib;
            fib1 = fib2;
            System.out.println(fib);
        }
    }
}
