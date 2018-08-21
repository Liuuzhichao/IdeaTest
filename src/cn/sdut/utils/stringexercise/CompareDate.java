package cn.sdut.utils.stringexercise;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by liuzhichao on 2018/8/21.
 */
public class CompareDate {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        String date1 = in.nextLine();
        if ( date.compareTo(date1) > 0 ) {
            System.out.println(date);
        } else {
            System.out.println(date1);
        }

    }

}
