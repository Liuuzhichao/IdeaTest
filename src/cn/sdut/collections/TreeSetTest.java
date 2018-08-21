package cn.sdut.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by liuzhichao on 2018/8/21.
 */

/**
 * TreeSet
 * 线程不安全,不同步的,此类保证排序后的set按照升序排列元素
 */
public class TreeSetTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set set=new TreeSet();
        set.add(34);
        set.add(67);
        set.add(22);
        set.add(4);
        set.add(12);

        System.out.println(set.toString());
    }

}
