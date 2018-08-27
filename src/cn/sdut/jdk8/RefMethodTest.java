package cn.sdut.jdk8;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * 方法引用:只写方法名,不加()
 * 	类名::静态方法名
 * 	实例名::实例方法名
 * 	类名::实例方法名
 * 	类名::new     构造器引用
 */
public class RefMethodTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //4,5,3,1,2
        Person[] pArr = new Person[]
            {
                new Person("003", LocalDate.of(2016, 7, 12)),
                new Person("004", LocalDate.of(2015, 6, 9)),
                new Person("005", LocalDate.of(2016, 4, 23)),
                new Person("002", LocalDate.of(2016, 12, 24)),
                new Person("001", LocalDate.of(2016, 8, 21)),
            };
        //方式一：匿名类
        /*Arrays.sort(pArr, new Comparator<Person>(){

            @Override
            public int compare(Person o1, Person o2) {
                // TODO Auto-generated method stub
                return o1.getBirthday().compareTo(o2.getBirthday());
            }

        });
        System.out.println(Arrays.asList(pArr));*/

        //方式二：Lambda表达式,未使用Person类中的方法
        /*Comparator<Person>  com=(Person  p1,Person  p2)->p1.getBirthday().compareTo(p2.getBirthday());
        Arrays.sort(pArr,com);
        System.out.println(Arrays.asList(pArr));*/

        //方式三：Lambda表达式,使用Person类中的方法compareByBirthday
        Arrays.sort(pArr, (p1, p2) -> Person.compareByBirthday(p1, p2));
        System.out.println(Arrays.asList(pArr));

        System.out.println("===========================");

        //方式四：方法引用
        Arrays.sort(pArr, Person::compareByBirthday);
        System.out.println(Arrays.asList(pArr));

        List<String> list = Arrays.asList("abc", "cde", "zzz", "qqq", "sss");
        //list.forEach(x->System.out.println(x));
        /*PrintStream  ps=System.out;
        list.forEach(ps::println);*/
        list.forEach(System.out::println);

        //构造器引用
        Ia mc = MyClass::new;
    }

}

class Person {
    private String name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthday) {
        super();
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static int compareByBirthday(Person p1, Person p2) {
        return p1.getBirthday().compareTo(p2.getBirthday());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name;
    }

}

interface Ia {
    MyClass func();
}

class MyClass {
    int i = 0;

    public MyClass() {
        super();
        // TODO Auto-generated constructor stub
    }

    public MyClass(int i) {
        super();
        this.i = i;
    }
}