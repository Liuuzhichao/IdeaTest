package cn.sdut.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 字符输出流
 */
public class FileWriterTest {

    public static void main(String[] args) {
        Writer writer = null;
        try{
            //1.搭建通道
            writer = new FileWriter("F:/upload/00.text");
            //2.读写操作
            writer.write("liuzhichao");
            writer.write("刘志超");
            //强制将缓冲区数据写入文件
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if( writer!=null ) {
                //3.关闭流
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
