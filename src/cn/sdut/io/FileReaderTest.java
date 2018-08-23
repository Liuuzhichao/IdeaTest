package cn.sdut.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 字符输入流
 */
public class FileReaderTest {

    public static void main(String[] args) {
        Reader reader = null;
        try{
            //1.搭建通道
            reader = new FileReader("F:\\upload\\00.txt");
            //2.读写操作
            int in = reader.read();
            while( in!=-1 ) {
                char ch = (char)in;
                System.out.print(ch);
                in = reader.read();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭流
            try{
                if( reader!=null ) {
                    reader.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
    }

}
