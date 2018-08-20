package cn.sdut.utils;

/**
 * Created by liuzhichao on 2018/8/20.
 */
public class ObjectTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

	/*Cat c1=new Cat();
	System.out.println(c1);
	System.out.println(c1.toString());//推荐*/

        Cat c1 = new Cat("加菲猫", "黄黑相间", 2);
        Cat c2 = new Cat("加菲猫", "黄黑", 2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

    }

}

class Cat implements Cloneable {
    private String name;
    private String color;
    private int age;
    private Head head;

    public Cat(String name, String color, int age) {
        super();
        this.name = name;
        this.color = color;
        this.age = age;
    }

    /**
     * 无参构造函数和全参构造函数略
     */

    /**
     * get,set方法略
     */

    /**
     * 克隆
     *
     * @return
     */
    @Override
    protected Object clone() {
        // TODO Auto-generated method stub
        Cat c = null;
        try {
            /**
             * 浅拷贝,浅表拷贝
             * 只对对象本身拷贝,不对该对象中的引用类型进行拷贝
             */
            c = (Cat) super.clone();//浅拷贝
            /**
             * 深拷贝,深表拷贝
             * 对象以及该对象中的引用类型都进行拷贝,
             * 深拷贝要在浅拷贝的基础上进行
             */
            c = (Cat) super.clone();//深拷贝
            c.head = (Head) c.head.clone();//深拷贝
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return c;

    }

    /**
     * 重写equals方法,年龄姓名和颜色相同即认为是同一个对象
     * equals():
     * 判断引用数据类型是否相等,判断的是两个变量的引用是否相等,
     * 但是String/包装类/Date/File除外,判断的是对象的数据是否相等
     * ==:
     * 判断基本数据类型和引用数据类是否相等,
     * 判断引用数据类型时,判断的是两个变量的引用(对象的地址)是否相等,
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        /**
         * this指的是调用该方法的对象
         */
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof Cat) {
            Cat c = (Cat) obj;
            return this.age == c.age && this.name.equals(c.name)
                    && this.color.equals(c.color);
        }
        return false;
    }

    /**
     * 一旦重写了equals方法,必须重写hashCode方法
     * equals方法的返回值相同,hashCode必须相同
     * hashCode的值不相同,equals方法的返回值必须是false
     * @return
     */
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return 31 * this.age + 7 * this.name.hashCode() + 29 * this.color.hashCode();
    }

    /**
     * 重写object类中的toString方法
     *
     * @return
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "猫";
    }
}

/**
 * Head类是Cat类中的一个属性
 */
class Head implements Cloneable {
    private int size;

    /**
     * get,set方法略
     * @param size
     */

    public Head(int size) {
        super();
        this.size = size;
    }

    /**
     * 重写clone方法
     * @return
     */
    @Override
    protected Object clone() {
        // TODO Auto-generated method stub
        Head head = null;
        try {
            head = (Head) super.clone();//
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return head;
    }

}