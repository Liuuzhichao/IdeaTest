package cn.sdut.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by liuzhichao on 2018/8/21.
 */

/**
 * HashSet:散列的,里面的元素无序且不重复,只能存储引用数据类型的对象
 * 线程不安全,不同步的,存取速度比较快,底层实现是用HashMap实现
 */
public class HashSetTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set set=new HashSet();
        set.add(true);
        /**
         * 集合只能存储引用数据类型的对象,当添加一个基本类型的元素时,
         * Java会进行自动装箱操作,将基本数据类型封装成包装类,然后转换成Object来进行存储
         */
        set.add(12.34);//double-->Double-->Object
        set.add("abc");
        set.add(12);
        set.add("abc");
        set.add(12.34);
        set.add(12);

        set.add(new Cat(2,"加菲猫"));
        set.add(new Cat(2,"加菲猫"));
        System.out.println(set.toString());

        //设置初始容量为5
        Set  s1=new HashSet(5);
        s1.add("aaa");
        s1.add("bbb");

        //集合中可以存储集合,添加子集合
        set.addAll(s1);
        System.out.println(set.toString());

        //set.clear();//清空
        System.out.println(set.toString());

        /**
         * isEmpty()方法判断的是集合的长度是否为0,即集合中是否存在元素
         * 而不是判断集合是否为null
         */
        System.out.println("isEmpty:"+set.isEmpty());

        //集合中是否包含某个元素
        System.out.println("contains:"+set.contains(12.34));
        //集合中是否包含某个子集合
        System.out.println("containsAll:"+set.containsAll(s1));

        //删除集合中的元素
        // set.remove(12.34);
        System.out.println(set.toString());
        //删除集合中的子集合
        set.removeAll(s1);
        System.out.println(set.toString());

        //集合的长度
        System.out.println("size:"+set.size());

        /**
         * 将集合转换成数组,然后遍历集合
         * 也可以直接用foreach循环遍历,将下面的objs换成集合的对象名字即可
         */
        Object[] objs=set.toArray();
        for(Object obj:objs)
        {
            System.out.print(obj+"\t");
        }
        System.out.println();

        /**
         * 用Iterator接口来遍历一个集合
         */
        Iterator it=set.iterator();
        while(it.hasNext())
        {
            Object obj=it.next();
            System.out.print(obj+"\t");
        }

        System.out.println("=============Set集合lambda遍历==================");
        set.forEach(e->{System.out.print(e+"\t");});


    }

}

class  Cat implements Comparable
{
    private int age;
    private String  name;

    public Cat() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Cat(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Cat [age=" + age + ", name=" + name + "]";
    }

    /**
     * 重写equals()和hashCode()方法
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj==this)
        {
            return true;
        }
        if(obj==null)
        {
            return false;
        }
        if(obj  instanceof  Cat)
        {
            Cat cat=(Cat)obj;
            return this.age==cat.age && this.name.equals(cat.name);
        }
        return false;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 31*this.age+this.name.hashCode();
    }

    /**
     * 重写比较对象的方法
     * @param obj 
     * @return
     */
    @Override
    public int compareTo(Object obj) {
        Cat cat = (Cat)obj;
        return this.age-cat.age;
    }
}