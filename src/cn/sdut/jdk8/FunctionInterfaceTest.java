package cn.sdut.jdk8;

/**
 * Created by liuzhichao on 2018/8/27.
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * jdk1.8新特性,函数式接口
 * 只包含一个方法的接口,且该方法是抽象方法
 */
public class FunctionInterfaceTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //new  Thread(()->System.out.println("Hello Thread")).start();

	    /*new  Thread(()->{
		    for(int i=0;i<1000;i++){
			    System.out.println(i);
		    }
		}).start();*/

        /**
         * 断言型接口
         * Predicate<T>:断言型接口 boolean test(T t)
         */
		/*Predicate<Integer>  pre=(x)->x>18;
	    System.out.println(	pre.test(2));*/

        /**
         * 消费型接口
         * Consumer<T>:消费型接口 void accept(T t)
         */
        Consumer<Double> com=(x)->System.out.println("共捐助"+x+"元");
        com.accept(2000.0);

        /**
         * 供应型接口
         * Supplier<T>:供应型接口 T get()
         */
        Supplier<Integer> supplier = ()->{return 1;};
        System.out.println(supplier.get());

        /**
         * 函数型接口
         * Function<T,R>:函数型接口 R apply(T t)
         */
        Function<Integer,String> function = (n)->{
            if( n==6 ) {
                return "true";
            }
            return "false";
        };
        System.out.println(function.apply(6));
    }

}
