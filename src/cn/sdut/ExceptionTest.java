package cn.sdut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class ExceptionTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 12;
        try {
            int j = i / 0;//int型除数为0会报错,double型不会
            System.out.println(j);
            FileInputStream fin = new FileInputStream("c:\\a.txt");
        } catch (RuntimeException | FileNotFoundException ex) {//jdk1.7以上
            System.out.println("catch....");
        } finally {
            System.out.println("finally");
        }
        System.out.println("ok");

    }

}
