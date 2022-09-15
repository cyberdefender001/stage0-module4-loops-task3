package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str = String.valueOf(t);
        int len = str.length();
        int sum = 0;
        for (sum = 0; t != 0; t /= 10) {
            sum = sum + t % 10;
        }
        System.out.println(sum);
    }
}
