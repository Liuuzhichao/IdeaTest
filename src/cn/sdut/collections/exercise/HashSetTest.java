package cn.sdut.collections.exercise;

/**
 * Created by liuzhichao on 2018/8/22.
 */

import java.util.*;

/**
 * 练习1:
 * 1、生成10个随机数，值在100到200之间；
 * 2、将这十个数存入HashSet集合中（有可能集合的长度小于10）。
 * 3、将这个HashSet集合转换成ArrayList集合
 * 4、重新为ArrayList集合排序，按照从小到大的顺序；
 * 5、遍历该集合；
 */
public class HashSetTest {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>(10);
        /**
         * 生成随机数并添加到集合
         */
        for( int i = 0; i < 10; i++ ) {
            Integer n = (int)(Math.random()*100) + 100;
            set.add(n);
        }

        /**
         * 输出集合的长度,并遍历集合中的元素
         */
        System.out.println("集合的长度:"+set.size());
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"\t");
        }
        System.out.println();

        /**
         * set转换成ArrayList
         */
        ArrayList<Integer> arrayList = new ArrayList<>(set);

        /**
         * 排序后遍历该集合
         */
        Collections.sort(arrayList);
        arrayList.forEach(item->{
            System.out.print(item+"\t");
        });
    }
}
