package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String str = String.valueOf(t);
        int len = str.length();
        int sum = 0;
        for (int i = 1; i <= len; i++) {
            int temp = t / (10);
            int given = t % (10);
            sum += temp;
            temp = given;
        }
        System.out.println(sum);
    }
}
