package cn.sdut.io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 字节输出流
 */
public class FileOutputStreamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileOutputStream fout = null;
        try {
            //1.搭建通道
            fout = new FileOutputStream("F:\\upload\\00.txt");
            //第二个参数为boolean类型,表示是在文件结尾追加数据还是直接替换掉原来的内容,true表示追加
            //fout=new FileOutputStream("F:\\upload\\00.txt",true);
            //2.读写操作
            fout.write(97);
            fout.write(65);
            byte[] bys = {66, 67, 68, 69};
            //将字节数组的前两个元素写入文件
            fout.write(bys, 0, 2);//>=0 <2
            //强制将所有缓冲区的数据全部写入文件
            fout.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //3.关闭流
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
