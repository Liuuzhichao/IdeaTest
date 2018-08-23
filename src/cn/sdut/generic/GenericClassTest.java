package cn.sdut.generic;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 泛型类和泛型接口
 */
public class GenericClassTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Person<String>  per=new Person<String>();
        //per.setName("aaa");
        Person<Integer> per2 = new Person<>();
        per2.setName(12);
        Person<Double> per3 = new Person<>();
        per3.setName(12.34);
        //Person<Number> per4=new Person<>();

    }
}

/**
 * 泛型类
 * @param <T> 类中有些成员的数据类型不能确定
 *           T这个数据类型限定在Number类以及其子类之下,extends后面只能写1个类
 *           T还要实现Comparable这个接口,接口可以有多个 &...&...
 *      extends和&是用来限定数据类型的
 */
class Person<T extends Number & Comparable> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void ma(T[] arr) {

    }

}

/**
 * 泛型接口
 * @param <T> 不确定的数据类型
 */
interface Ia<T> {
    void ma(T i);
}