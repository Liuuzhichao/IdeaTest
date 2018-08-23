package cn.sdut.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 处理流
 * 跟踪行号的缓冲字符输入流:可以在前面显示行号
 */
public class LineNumberReaderTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileReader fr = null;
        LineNumberReader lnr = null;

        try {
            //1.搭建通道
            fr = new FileReader("F:\\upload\\00.txt");
            lnr = new LineNumberReader(fr);

            //2.读写操作
            String str = lnr.readLine();
            while (str != null) {
                //可以输出行号
                System.out.println(lnr.getLineNumber() + ":" + str);
                str = lnr.readLine();
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
                if (lnr != null) {
                    lnr.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
}
