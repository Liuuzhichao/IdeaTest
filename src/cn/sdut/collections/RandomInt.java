package cn.sdut.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by liuzhichao on 2018/8/21.
 */

/**
 * 使用Set集合，生成1-25之内不重复的7个随机整数
 */
public class RandomInt {

    public static void main(String[] args) {

        Set set = getRandomInt();
        for(Object item: set) {
            System.out.print(item+"\t");
        }
    }

    /**
     * 使用Set集合，生成1-25之内不重复的7个随机整数
     * @return
     */
    public static Set getRandomInt() {
        Set set = new HashSet();
        while( set.size()<7 ) {
            Integer n = new Random().nextInt(25) + 1;
            set.add(n);
        }
        return set;
    }

}
