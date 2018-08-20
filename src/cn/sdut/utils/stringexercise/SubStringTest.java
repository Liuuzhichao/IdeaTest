package cn.sdut.utils.stringexercise;

import java.util.Scanner;

/**
 * Created by liuzhichao on 2018/8/20.
 */
public class SubStringTest {

    public static void main(String[] args) {
        /**
         * 字符串对称
         */
        /*Scanner in  = new Scanner(System.in);
        String str = in.nextLine();
        if( symmetry(str) ) {
            System.out.println("该字符串对称");
        } else {
            System.out.println("该字符串不对称");
        }*/

        /**
         * 求子串出现的所有位置
         */
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String subStr = in.nextLine();
        indexOfSubString(str,subStr);


    }

    /**
     * 判断字符串是否对称
     * @param str 目标字符串
     * @return
     */
    public static boolean symmetry(String str) {
        for(int i = 0, j = str.length()-1; i <= j; i++, j-- ) {
            if( str.charAt(i) != str.charAt(j) ) {
                return false;
            }
        }
        return true;
    }

    public static void indexOfSubString(String str, String subStr) {
        int i = 0;
        while(str.indexOf(subStr,i)>=0) {
            System.out.println(str.indexOf(subStr,i));
            i = str.indexOf(subStr,i) + subStr.length();
            if( i >= str.length() ) {
                break;
            }
        }
    }

}
