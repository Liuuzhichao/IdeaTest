package cn.sdut.utils;

/**
 * Created by liuzhichao on 2018/8/17.
 */
public class EqualsTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Cat1  c1=new Cat1();
        Cat1  c2=new Cat1();
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));

        System.out.println("=====================");
        Integer  i1=new Integer(12);
        Integer  i2=new Integer(12);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        System.out.println("===================");
        /**
         * 将数据放在字符串池中,字符串池中的数据是共享且唯一的
         * 所以下面两个引用指向的是同一块内存地址,只创建了一个abc对象
         */
        String str1="abc";
        String str2="abc";
        /**
         * 将创建的对象放在堆中,和其他的引用类型一样,
         * 但是创建之后会去字符串池中看看是否有这个数据,
         * 如果没有,则在字符串池中也创建一个对象,反之,不会在字符串池中创建
         */
        String str3=new String("abc");
        String str4=new String("abc");

        System.out.println(str1==str2);//true
        System.out.println(str1.equals(str2));//true
        System.out.println(str3==str4);//false
        System.out.println(str3.equals(str4));//true
        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true

    }

}

class Cat1 {

        }
