package cn.sdut.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by liuzhichao on 2018/8/22.
 */

/**
 * 对于ArrayList和LinkedList集合的三种遍历方法
 */
public class TraverseList {

    public static void main(String[] args) {
        Student stu1 = new Student(1001,"ll",11);
        Student stu2 = new Student(1002,"zz",11);
        Student stu3 = new Student(1003,"cc",11);
        /**
         * 将ArrayList换成LinkedList即可实现对于LinkedList的遍历
         */
        List list = new ArrayList(3);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        System.out.println("*********for循环遍历集合************");
        for ( int i = 0; i < list.size(); i++ ) {
            System.out.print(list.get(i)+"\t");
        }
        System.out.println();

        System.out.println("*********foreach循环遍历集合************");
        for( Object obj: list ) {
            System.out.print(obj+"\t");
        }
        System.out.println();

        System.out.println("*********Iterator接口遍历集合************");
        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.print(obj+"\t");
        }
        System.out.println();

        System.out.println("*********ListIterator接口反向遍历集合************");
        ListIterator lit = list.listIterator();
        /**
         * 指向该集合的最后一个元素,即将指针移到最后(Java中没有指针)
         */
        while(lit.hasNext()) {
            lit.next();
        }
        while(lit.hasPrevious()) {
            Object obj = lit.previous();
            System.out.print(obj+"\t");
        }
        
    }
}
class Student{
    private int id;
    private String name;
    private int age;

    public Student() {

    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id+","+name+","+age;
    }
}
