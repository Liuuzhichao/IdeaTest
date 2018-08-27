package cn.sdut.jdk8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * jdk1.8新特性 Lambda表达式的使用
 */

/**
 * Lambda表达式允许将函数当成参数传递给某个方法,或者把代码本身当作数据处理.
 */
public class LambdaTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> list = Arrays.asList("zz","cc","dd");
        /**
         * (数据类型 变量名,数据类型 变量名...)->{
         * 	...
         * 	return ;(可以不写)
         *  }
         */
        //list.forEach((String x)->System.out.println(x));
        /**
         * (变量名, 变量名,...)->{代码块}
         */
        //list.forEach((x)->{System.out.println(x);});
        list.forEach(x->System.out.println(x));

        //匿名类
        /*Comparator<Integer>  com=new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2) {
                // TODO Auto-generated method stub
                return o1-o2;
            }
        };*/
        System.out.println("==============================");
        /**
         * lambda表达式代替匿名类
         */
        /*Comparator<String>  com=(x,y)->{
            int result=x.compareTo(y);
            return result;
          };*/
        Comparator<String> com=(x, y)->x.compareTo(y);
        list.sort(com);

        /**
         * 变量->{代码块}
         * Lambda表达式可以引用类成员和局部变量,会将这些变量隐式转换成final的
         */
        String str=",";//等价于final String  str=","；
        list.forEach(x->System.out.print(x+str));


    }

}
