package cn.sdut.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 字节输入流
 */
public class FileInputStreamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //1.搭建管道
        //FIleInputStream类的两种构造方法
        //File  f=new File("D:\\java\\java基础\\a.txt");
        //FileInputStream  fin=new FileInputStream(f);
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("F:\\upload\\00.txt");
            //2.读写操作
            //read()方法读进来的是数据的ASCII码,要显示需要进行类型转换
            int i = fin.read();
            while (i != -1) {//没有到达文件结尾
                System.out.print((char) i);
                i = fin.read();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //3.关闭流
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
