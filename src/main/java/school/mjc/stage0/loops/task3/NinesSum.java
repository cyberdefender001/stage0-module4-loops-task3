package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int temp = 9;
        for(int i = 1; i <= lengthOfLastNumber; i++) {
            sum += temp;
            temp = temp + i * 90;
        }
        System.out.println(sum);
    }
}
