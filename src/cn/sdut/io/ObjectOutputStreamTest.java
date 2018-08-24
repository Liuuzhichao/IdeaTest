package cn.sdut.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by liuzhichao on 2018/8/24.
 */

/**
 * 序列化,将对象的数据永久存储到文件
 * 序列化步骤:
 *  1)创建一个可序列化的类(即实现Serializable或者Externalizable),用来保存对象的数据
 *  2)创建对象,存储数据
 *  3)搭建管道
 *  4)读写操作
 *  5)关闭流
 */
public class ObjectOutputStreamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Employee e1 = new Employee("张三", 4567, 23);
        Employee e2 = new Employee("李四", 6789, 30);

        /**
         * try-with-resource,自动资源管理,可以不写finally,可以自动进行流的关闭,jdk1.7以上
         */
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\io\\00.txt"));) {
            //4.
            oos.writeObject(e1);//序列化方法
            oos.writeObject(e2);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
