package cn.sdut.utils.stringexercise;

/**
 * Created by liuzhichao on 2018/8/20.
 */

/**
 * 统计一串字符中数字0-9的各个数字的个数.
 */
public class CountNum {

    public static void main(String[] args) {
        String string = "11223344556677889900";
        int[] array = countNum(string);
        for(int i = 0; i < 10; i++) {
            System.out.print(i+":"+array[i]+"\t");
            if( i==4 ) {
                System.out.println();
            }
        }
    }

    public static int[] countNum(String string) {
        int[] array = new int[10];
        for( int i = 0; i < string.length(); i++ ) {
            int num = Integer.parseInt(String.valueOf(string.charAt(i)));
            array[num]++;
        }
        return array;
    }
}


