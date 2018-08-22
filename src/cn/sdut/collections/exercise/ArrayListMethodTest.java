package cn.sdut.collections.exercise;

/**
 * Created by liuzhichao on 2018/8/22.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 练习2:
 *  创建ArrayList实例化对象，添加10个以上的元素，在2号位插入一个元素，
 *  获得5号位元素，删除6号位元素，修改7号位的元素；并用两种方法遍历该集合
 */
public class ArrayListMethodTest {

    public static void main(String[] args) {

        /**
         * 添加元素并打印集合
         */
        List<Integer> list = new ArrayList<Integer>();
        for( int i = 0; i < 10; i++ ) {
            list.add(i);
        }
        System.out.println(list.toString());

        /**
         * 在2号位插入一个元素6,遍历集合
         */
        list.add(1,6);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+"\t");
        }
        System.out.println();

        //获得5号位元素
        System.out.println(list.get(4));

        /**
         * 删除6号位元素,遍历集合
         */
        list.remove(5);
        list.forEach(item->{
            System.out.print(item+"\t");
        });
        System.out.println();

        /**
         * 修改7号位的元素,遍历集合
         */
        list.add(6,0);
        for(Integer item: list) {
            System.out.print(item+"\t");
        }
        System.out.println();

    }

}
