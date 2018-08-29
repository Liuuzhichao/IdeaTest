package cn.sdut.jdk8;

import java.util.Optional;

/**
 * Created by liuzhichao on 2018/8/29.
 */

/**
 * Optional 避免null;
 */
public class OptionalTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /**
         * orElse():
         * 与orElseGet()方法类似,但是在持有null的时候返回传入的默认值
         */
		/*Optional<Employee>  op1=Optional.ofNullable(null);
		Employee  e=op1.orElse(new Employee("张三",23,4567));
		System.out.println(e);*/

        /**
         * orElseGet():lambda表达式
         * Optional实例持有null,则可以接受一个lambda表达式生成的默认值
         */
        Optional<Employee> op2 = Optional.ofNullable(null);
        Employee e = op2.orElseGet(() -> new Employee("张三", 23, 4567));
        System.out.println(e.toString());

        //map():将现有的Optional实例的值转换成新的值
        /*Optional<Employee> op3 = Optional.ofNullable(new Employee("张三", 23, 4567));
        Optional<String> str = op3.map(e1 -> e1.getName());
        System.out.println(str.get());*/

        Optional<Employee> op3 = Optional.ofNullable(new Employee("张三", 23, 4567));
        Optional<String> str = op3.map(Employee::getName);
        System.out.println(str.get());
    }

}
