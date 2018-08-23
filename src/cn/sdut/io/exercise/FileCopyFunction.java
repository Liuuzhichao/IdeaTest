package cn.sdut.io.exercise;

/**
 * Created by liuzhichao on 2018/8/23.
 */

import java.io.*;

/**
 * 2、编写一个java程序实现文件复制功能,要求:
 * 将d:/io/copysrc.doc中的内容复制到d:/io/copydes.doc中
 */
public class FileCopyFunction {

    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fr = new FileReader("F:\\io\\copysrc.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("F:\\io\\copydes.txt");
            bw = new BufferedWriter(fw);
            String str = br.readLine();
            while(str!=null) {
                System.out.println(str);
                bw.write(str);
                str = br.readLine();
            }
            bw.flush();
        } catch( IOException ex ) {
            ex.printStackTrace();
        } finally {
            try {
                if( br!=null ) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
