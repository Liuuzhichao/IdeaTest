package cn.sdut.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * stream流的中间操作
 */
public class StreamMiddleOperatorTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Employee> employees = Arrays.asList(
                new Employee("张三", 23, 2300),
                new Employee("王五", 33, 6500),
                new Employee("李四", 33, 3300),
                new Employee("赵六", 25, 6300),
                new Employee("田七", 55, 7800),
                new Employee("王五", 33, 6500),
                new Employee("王五", 33, 6500),
                new Employee("王五", 33, 6500)
        );

        /**
         * filter:对流进行选择性过滤
         */
        employees.stream().filter((x) -> x.getAge() >= 30).forEach(System.out::println);
        System.out.println("=================================");

        /**
         * limit:限定结果的数量
         */
        employees.stream().filter(x -> x.getAge() >= 30).limit(2).forEach(System.out::println);

        //map:映射
        /**
         * map:映射,对于Stream中包含的元素使用给定的转换函数进行转换操作
         * 不会对原有的数据发生修改
         */
        List<String> list = Arrays.asList("aaa", "bbb", "vvv", "ccc", "qqq");
        list.stream().map(x -> x.toUpperCase()).forEach(System.out::println);
        employees.stream().map(e -> e.getSalary()).forEach(System.out::println);
        System.out.println("============================");

        /**
         * sorted:排序
         */
        list.stream().sorted().forEach(x -> System.out.println(x));
        System.out.println("======================");
        /*employees.stream()
                .sorted((e1,e2)->-Integer.compare(e1.getAge(),e2.getAge()))
                .forEach(System.out::println);
        */

        /*employees.stream().sorted(
                (e1, e2) -> {
                    if (e1.getAge() == e2.getAge()) {
                        return e1.getName().compareTo(e2.getName());
                    } else {
                        return Integer.compare(e1.getAge(), e2.getAge());
                    }
                }
        ).forEach(System.out::println);*/

        /**
         * distinct:去重,需要重写equals()和hashCode()方法
         */
        employees.stream().distinct().forEach(System.out::println);
        System.out.println("====================");

        /**
         * count:计数,是终止操作,foreach()也是终止操作
         */
        long lon = employees.stream().filter(x -> x.getAge() > 30).count();
        System.out.println(lon);

    }

}

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Employee(String name, int age, int salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + salary;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary != other.salary)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary
                + "]";
    }
}