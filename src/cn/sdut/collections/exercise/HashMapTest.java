package cn.sdut.collections.exercise;

/**
 * Created by liuzhichao on 2018/8/23.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 练习4:
 *使用HashMap类实例化一个Map类型的对象m1,键(String类型)和值(int型)分别用于存储员工的姓名和工资,
 * 存入数据如下：张三——800元；李四——1500元；王五——3000元；
 *    1）将张三的工资更改为2600元
 *    2）为所有员工工资加薪100元；
 *    3）遍历集合中所有的员工
 *    4）遍历集合中所有的工资
 */
public class HashMapTest {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("张三",800);
        map.put("李四",1500);
        map.put("王五",3000);
        System.out.println(map.toString());

        map.put("张三",2600);
        System.out.println(map.toString());

        Set<String> set = map.keySet();
        for(String item: set) {
            map.put(item,map.get(item)+100);
        }
        System.out.println(map.toString());

        for(String item: set) {
            System.out.print(item+"\t");
        }
        System.out.println();

        for(Integer item: map.values()) {
            System.out.print(item+"\t");
        }

    }

}
