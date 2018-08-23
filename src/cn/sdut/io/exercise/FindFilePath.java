package cn.sdut.io.exercise;

import java.io.File;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 1、在本机的磁盘系统中，找一个文件夹，利用File类的提供方法，列出该文件夹中的所有文件的文件名和文件的路径，执行效果如下：[必做题]
 * 路径是xxx的文件夹内的文件有：
 *  	文件名：abc.txt
 * 	路径名：c:\temp\abc.txt
 * 	--------------------------------------------
 * 	文件名：def.txt
 * 	路径名：c:\temp\def.txt
 */
public class FindFilePath {

    public static void main(String[] args) {
        String path = "F:\\upload";
        File file = new File(path);
        System.out.println("路径是:"+path+"的文件夹内的文件有:");
        File[] files = file.listFiles();
        for( int i = 0; i < files.length; i++ ) {
            System.out.println("\t文件名:"+files[i].getName());
            System.out.println("\t路径名:"+files[i].getAbsolutePath());
            System.out.println("\t----------------------------");
        }
    }

}
