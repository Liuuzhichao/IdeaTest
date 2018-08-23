package cn.sdut.generic;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 泛型:参数化的数据类型:数据类型可以像参数传递一样进行传递
 * 		1)安全的
 * 		2)减少了数据类型转换所带来的风险,减少了装箱拆箱
 * 泛型方法:
 * 	[访问修饰符] <T>返回值 方法名([参数列表]){方法体}
 */
public class GenericMethodTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        GenericMethodTest gt=new GenericMethodTest();
        /**
         * 隐式调用,会自动把数据类型赋值
         */
        gt.swap("aaa","bbb");//隐式调用
        /**
         * 显示调用,事先声明一下数据类型
         */
        gt.<Cat>swap(new Cat(),new Cat());//显式调用
    }

    /**
     * 泛型方法
     * 如果要返回的数据类型也是T类型的那就把void换成T即可
     * @param obj1
     * @param obj2
     * @param <T>
     */
    public <T>void swap(T obj1,T obj2)
    {
        T  temp=obj1;
        obj1=obj2;
        obj2=temp;
    }

}

class Cat{

}