package cn.sdut.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 处理流
 * 字符缓冲区流
 */
public class BufferedReaderTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileReader fr = null;
        BufferedReader br = null;
        try {
            //1.搭建通道
            //处理流要套接在节点流之上
            fr = new FileReader("F:\\upload\\00.txt");
            br = new BufferedReader(fr);
            //2.读写操作,处理流可以读取一行
            String str = br.readLine();
            while (str != null) {
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //3.关闭流,要分别进行捕获异常,否则可能一个有异常导致另一个也关闭不了
            try {
                if (br != null) {
                    br.close();
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
