package cn.sdut.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * 创建stream流的4种方式
 */
public class CreateStreamTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /**
         * 1.通过Collection系列(Set/List)的集合提供的stream()方法[串行方法]
         * 或者parallelStream()方法[并行方法]
         */
        List<String> list = new ArrayList<>();
        Stream<String> st = list.stream();

        /**
         * 2.通过Arrays中的静态方法stream()方法
         */
        String[] strs = {"aa", "bb", "cc"};
        Stream<String> st1 = Arrays.stream(strs);

        /**
         * 3.通过Stream类中的静态方法of()方法
         */
        Stream<String> st2 = Stream.of("aa", "bb", "cc");

        /**
         * 4.1创建无限流,迭代方法iterate(),可以用limit()方法来进行限制
         */
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        //st3.forEach(System.out::println);
        st3.limit(10).forEach(System.out::println);

        /**
         * 创建无限流,generate()方法,可以用limit()方法来进行限制
         */
        //Stream.generate(()->Math.random()).forEach(System.out::println);
        Stream.generate(() -> Math.random()).limit(5).forEach(System.out::println);
    }

}
