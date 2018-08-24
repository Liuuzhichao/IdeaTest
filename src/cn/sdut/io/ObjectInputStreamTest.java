package cn.sdut.io;

import java.io.*;

/**
 * Created by liuzhichao on 2018/8/24.
 */

/**
 * 反序列化
 * 序列化步骤:
 * 		1)创建一个可序列化的类(即实现Serializable或者Externalizable),用来保存对象的数据
 * 		2)创建对象,存储数据
 * 		3)搭建管道
 * 		4)读写操作
 * 		5)关闭流
 */
public class ObjectInputStreamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileInputStream fin = null;
        ObjectInputStream oin = null;

        try {
            fin = new FileInputStream("D:\\java\\java基础\\b.txt");
            oin = new ObjectInputStream(fin);

            Employee e1 = (Employee) oin.readObject();//反序列化方法
            Employee e2 = (Employee) oin.readObject();

            System.out.println(e1.toString());
            System.out.println(e2.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (oin != null) {
                    oin.close();
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

/**
 * 一个可被序列化的类必须实现Serializable或者Externalizable接口
 *
 * Serializable接口里面没有任何方法,和cloneable接口一样,是一个标记接口,表示可以序列化
 */
class Employee implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private transient String name;
    private transient double salary;
    private int id;

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Employee(String name, double salary, int id) {
        super();
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
    }


}
