package cn.sdut.utils;

/**
 * Created by liuzhichao on 2018/8/20.
 */

/**
 * 1.将I am a student.变成如下格式输出:tneduts  a  ma  I
 */
public class ReverseExperience {

    public static void main(String[] args) {
        String string = "I am a student.";
        System.out.println(string);
        String str = reverse(string);
        System.out.println(str);
        /*StringBuffer s = new StringBuffer("I am a student.");
        s.reverse();
        System.out.println(s);*/
    }

    /*public static String reverse(String string) {
        String str = "";
        for ( int i = string.length()-2; i >= 0; i-- ) {
            char ch = string.charAt(i);
            str += ch;//每进行一次开辟一个新内存,浪费内存空间
        }
        return str;
    }*/

    public static String reverse(String string) {
        char[] chars = string.toCharArray();
        char[] charsTarget = new char[chars.length-1];
        for( int i = chars.length-2, j = 0; i >= 0 && j < charsTarget.length; i--, j++ ) {
            charsTarget[j] = chars[i];
        }
        String str = new String(charsTarget);
        return str;
    }
}

