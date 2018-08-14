package cn.sdut;

public class OverloadSumTest {

    public static void main ( String[] args ) {
        OverloadSum os = new OverloadSum();
        int sum = os.getSum(5);
        System.out.println(sum);
        int sum1 = os.getSum(10,5);
        System.out.println(sum1);
    }
}
