package cn.sdut.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by liuzhichao on 2018/8/23.
 */
public class FileTest {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /**
         * 两种文件路径的书写方式均可以,\\是对\进行的转义
         */
        //File  f1=new File("F:\\upload\\00.txt");
        File f1 = new File("F:/upload/00.txt");
        File f2 = new File("F:\\upload", "00.txt");
        File f3 = new File("F:\\upload");
        File f4 = new File(f3, "00.txt");

        //判断文件是否存在
        if (!f1.exists()) {
            //创建一个新的文件
            f1.createNewFile();
        }

        //删除文件
        //f1.delete();

        //文件是否可以进行写操作
        System.out.println("canWriter:" + f1.canWrite());

        //得到文件的绝对路径,String类型
        System.out.println("getAbsolutePath:" + f1.getAbsolutePath());

        //得到文件的绝对路径,返回的是File类型,可以对该文件进行File的一些操作,比如得到最后修改时间等
        System.out.println("getAbsoluteFile:" + f1.getAbsoluteFile());

        //得到文件的名字
        System.out.println("getName:" + f1.getName());

        //将此抽象路径名转换为一个路径名字符串
        System.out.println("getPath:" + f1.getPath());

        //返回此抽象路径名的父路径名的路径名字符串,如果此路径名没有指定父目录,则返回 null
        System.out.println("getParent:" + f1.getParent());

        //测试此抽象路径名是否为绝对路径名
        System.out.println("isAbsolute:" + f1.isAbsolute());

        //文件是否是一个标准文件
        System.out.println("isFile:" + f1.isFile());

        //文件是否是一个目录(文件夹)
        System.out.println("isDirectory:" + f1.isDirectory());

        //文件是否是一个隐藏文件
        System.out.println("isHidden:" + f1.isHidden());

        //文件最后一次被修改的时间,返回的是long型,90年至今的毫秒数,要转成Date类型
        System.out.println("lastModified:" + new Date(f1.lastModified()));

        //文件的长度
        System.out.println("length:" + f1.length());

        //得到该路径下的文件或目录名字,返回类型是String类型
        System.out.println("========================");
        String[] files = f3.list();
        for (String item : files) {
            System.out.println(item);
        }

        //得到该路径下的文件或者目录名字,返回类型是File类型
        System.out.println("============================");
        File[] fs = f3.listFiles();
        for (File item : fs) {
            if (item.isDirectory()) {
                System.out.println("Dir:" + item.getName());
            } else {
                System.out.println(item.getName() + "\t" + new Date(item.lastModified())
                        + "\t" + item.length());
            }
        }

        //遍历盘符
        System.out.println("===================");
        File[] fles = File.listRoots();//盘符遍历
        for (File item : fles) {
            System.out.println(item.toString());
        }

        //创建文件目录
        System.out.println("===================");
        //File f5 = new File("F:\\upload\\liu");
        //f5.mkdir();//只能创建一级父目录
        //f5.mkdirs();//可以创建多级父目录路径

        //设置文件为只读
        //f1.setReadOnly();

    }

}
