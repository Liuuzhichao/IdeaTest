package cn.sdut.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by liuzhichao on 2018/8/24.
 */

/**
 * 字节流转成字符流  键盘输入
 */
public class InputStreamReaderTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请输入内容：");
        BufferedReader br = null;
        try {
            //1.搭建管道
            br = new BufferedReader(new InputStreamReader(System.in));
            //2.读写操作
            String str = br.readLine();
            System.out.println("输入的内容是:" + str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
