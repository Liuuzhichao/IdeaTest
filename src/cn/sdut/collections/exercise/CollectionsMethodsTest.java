package cn.sdut.collections.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by liuzhichao on 2018/8/22.
 */

/**
 * 3、在一个列表中存储以下元素：apple,grape,banana,pear
 * 3.1 返回集合中的最大的和最小的元素
 * 3.2 将集合进行排序，并将排序后的结果打印在控制台上
 */
public class CollectionsMethodsTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>(4);
        list.add("apple");
        list.add("grape");
        list.add("banana");
        list.add("pear");
        System.out.println("集合中的最大值是:"+Collections.max(list));
        System.out.println("集合中的最小值是:"+Collections.min(list));
        Collections.sort(list);
        System.out.println("排序后输出结果是:"+list.toString());

    }
}
