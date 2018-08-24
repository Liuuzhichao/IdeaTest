package cn.sdut.io;

import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by liuzhichao on 2018/8/24.
 */

/**
 * 字符流转成字节流  控制台输出
 */
public class OutputStreamWriterTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        OutputStreamWriter osw = null;
        try {
            //1.搭建管道
            osw = new OutputStreamWriter(System.out);
            //2.读写操作
            osw.write("正在控制台输出");
            osw.write("你好");
            osw.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (osw != null) {
                    osw.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

}
