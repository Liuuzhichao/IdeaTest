package cn.sdut.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 数据输出流,只能是字节类型
 * 数据流可以读写除了整型和字符型之外的数据类型的数据,其他的流不可以
 */
public class DataOutputStreamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileOutputStream fout = null;
        DataOutputStream dout = null;

        try {
            //1.搭建通道
            fout = new FileOutputStream("F:\\upload\\00.txt");
            dout = new DataOutputStream(fout);

            //dout.writeBoolean(false);
            //dout.writeDouble(12.34);
            for (int i = 0; i < 10; i++) {
                double d = Math.random();
                System.out.print(d + "\t");
                dout.writeDouble(d);
            }
            dout.flush();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //3.关闭流
            try {
                if (dout != null) {
                    dout.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                if (fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
