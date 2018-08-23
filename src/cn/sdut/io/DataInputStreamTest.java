package cn.sdut.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 数据输入流,只能是字节类型
 * 数据流可以读写除了整型和字符型之外的数据类型的数据,其他的流不可以
 */
public class DataInputStreamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileInputStream fin = null;
        DataInputStream din = null;

        try {
            //1.搭建通道
            fin = new FileInputStream("F:\\upload\\00.txt");
            din = new DataInputStream(fin);
            //2.读写操作
            //boolean  b=din.readBoolean();
            //double  d=din.readDouble();
            //System.out.println(b+"\t"+d);

            for (int i = 0; i < 10; i++) {
                double d = din.readDouble();
                System.out.print(d + "\t");
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
                if (din != null) {
                    din.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
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
