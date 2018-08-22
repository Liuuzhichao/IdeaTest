package cn.sdut.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by liuzhichao on 2018/8/22.
 */

/**
 * ArrayList和LinkedList的常用方法
 */
public class ListTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * 将ArrayList换成LinkedList即可实现对LinkedList的操作
         */
        List list = new ArrayList();

        //向集合中添加元素
        list.add(12.34);
        list.add(true);
        list.add(12.34);
        list.add("abc");
        list.add(new Cat(2, "加菲猫"));
        System.out.println(list.toString());

        //在指定位置向集合中插入某个元素
        list.add(1, "zzz");//插入
        System.out.println(list.toString());

        //向集合中添加子集合
        List list1 = new ArrayList(3);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        //list.addAll(list1);
        list.addAll(1, list1);//插入
        System.out.println(list.toString());

        //清空集合
        //list.clear();
        //System.out.println(list.toString());

        //判断集合中是否包含某个元素,子集合
        System.out.println(list.contains(6));//包含某个元素
        System.out.println(list.containsAll(list1));//包含某个子集合

        //得到集合中某个位置的元素
        System.out.println("get:" + list.get(4));

        //查询某个元素在集合中出现的位置
        System.out.println("indexOf:" + list.indexOf(12.34));//第一次出现的位置，没有则返回-1
        System.out.println("lastIndexOf:" + list.lastIndexOf(12.34));//最后一次出现的位置，没有则返回-1

        //判断集合是否为空
        System.out.println("isEmpty:" + list.isEmpty());

        /**
         *在删除元素时,如果集合中有 该下标 这个元素会优先删除元素
         * 如果该下标不在集合中,那么会删除该下标所对应的元素
         */
        //list.remove(1);
        //list.remove(4);//根据下标删除，
        //list.remove(new Cat(2,"加菲猫"));
        list.removeAll(list1);//删除子集合

        //修改指定位置的元素的值
        list.set(1, 123);//修改

        //取在索引内的一个集合
        List list2 = list.subList(1, 4);//取子集合 >=1  <4
        System.out.println(list2.toString());

        //转换成数组
        Object[] objs = list.toArray();

        System.out.println("========List遍历方式一============");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        System.out.println("========List遍历方式二============");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.print(obj + "\t");
        }
        it.remove();
        System.out.println();

        System.out.println("===========反向遍历ListIterator=============");
        ListIterator listit = list.listIterator();
        //先指向集合中的最后一个元素
        while (listit.hasNext()) {
            Object obj = listit.next();
            //System.out.print(obj+"\t");
        }
        while (listit.hasPrevious()) {
            Object obj = listit.previous();
            System.out.print(obj + "\t");
        }
        System.out.println();

        System.out.println("========List遍历方式三============");
        for (Object obj : list) {
            System.out.print(obj + "\t");
        }

    }

}
