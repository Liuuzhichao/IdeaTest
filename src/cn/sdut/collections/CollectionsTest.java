package cn.sdut.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by liuzhichao on 2018/8/22.
 */

/**
 * Collections的大多方法都是对于List的
 */
public class CollectionsTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List list=new ArrayList();
        list.add(34);
        list.add(12);
        list.add(67);
        list.add(45);
        System.out.println(list.toString());

        /**
         * 对于基本类型,可以直接用sort排序,升序排列
         */
        System.out.println("============after  sort===================");
        Collections.sort(list);
        System.out.println(list.toString());

        //通过二分查找查询某一个元素,查询前必须先排序
        System.out.println(Collections.binarySearch(list, 67));

        //查询集合中的最大最小值
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        //将集合反转
        System.out.println("============after  reverse===================");
        Collections.reverse(list);//反转
        System.out.println(list.toString());

        //将集合中的元素乱序
        System.out.println("============after shuffle===================");
        Collections.shuffle(list);
        System.out.println(list.toString());


        //根据指定的距离循环移动指定列表中的元素,尾部溢出的元素循环到集合首部
        System.out.println("============after rotate===================");
        Collections.rotate(list, 2);
        System.out.println(list.toString());

        //集合中两个位置的元素进行交换
        System.out.println("============after swap===================");
        Collections.swap(list, 1, 3);
        System.out.println(list.toString());

        //替换集合中的某个元素
        System.out.println("============after replace===================");
        Collections.replaceAll(list, 45, 1);
        System.out.println(list.toString());


        /**
         * 对对象进行排序需要在该对象的类继承Comparable接口,重写CompareTo()方法
         */
        /*List  list1=new ArrayList();
        list1.add(new Cat(2,"cde"));
        list1.add(new Cat(4,"cfe"));
        list1.add(new Cat(3,"abc"));
        list1.add(new Cat(1,"zqw"));
        list1.add(new Cat(1,"zsw"));

        System.out.println(list.toString());
        System.out.println("============after  sort===================");
        Collections.sort(list1);
        System.out.println(list1.toString());*/


    }

}
