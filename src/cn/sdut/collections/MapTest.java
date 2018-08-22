package cn.sdut.collections;

import java.util.*;

/**
 * Created by liuzhichao on 2018/8/22.
 */

/**
 * HashMap和TreeMap以及Hashtable的常用方法
 */

/**
 * Map中的键必须唯一,但是值可以重复
 * 1)HashMap:数组+单向链表+红黑树
 * 		初始容量:默认16;
 * 		加载因子:默认0.75
 * 		扩容增量:原容量的1倍
 * 2)Hashtable:数组+单向链表+红黑树(平衡二叉树)
 * 		初始容量:默认11
 * 	    加载因子:默认0.75
 * 		扩容增量:原容量的1倍+1
 * 	3)TreeMap:按照键升序排序,底层数据结构是红黑树
 *
 * 	HashMap和Hashtable的区别:
 * 		1)HashMap:
 * 			a)线程不安全,不同步,数据不安全,但是效率高;
 * 			b)允许键值可以为null;
 * 		2)Hashtable:
 * 			a)线程安全,加锁同步,数据安全,效率比较低;
 * 			b)不允许键值为null
 */
public class MapTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * TreeMap同理
         */
        Map map=new HashMap();

        //添加元素
        map.put(1, "abc");
        map.put("b", 12.34);
        map.put(3, true);
        map.put(4, new Cat(2,"加菲猫"));
        map.put(null,null);
        System.out.println(map.toString());

        //修改当中的元素:因为键是唯一的,所以再添加一个覆盖掉上一个即可
        map.put(3, false);
        System.out.println(map.toString());

        //是否包含某个键/值
        System.out.println("containsKey:"+map.containsKey(3));
        System.out.println("containsValue:"+map.containsValue(3));

        //根据键去获得相应的值
        System.out.println("get:"+map.get(3));

        //容量大小
        System.out.println("size:"+map.size());

        //是否存在元素
        System.out.println("isEmpty:"+map.isEmpty());

        //添加一个子集合
        Map  m1=new HashMap();
        m1.put("aa", "v1");
        m1.put("bb", "v2");
        map.putAll(m1);//添加子集合
        System.out.println(map.toString());

        //根据key值删除value
        map.remove(3);
        System.out.println(map.toString());

        //获取值的集合,值可以重复,但是键不能重复
        Collection col=map.values();

        //遍历
        System.out.println("===========遍历方式一===============");
        Set keys=map.keySet();
        Iterator it=keys.iterator();
        while(it.hasNext())
        {
            Object  key=it.next();
            Object value=map.get(key);
            System.out.println(key+":"+value);
        }

        System.out.println("===========遍历方式二===============");
        map.forEach((k,v)->{System.out.println(k+":"+v);});

    }

}
