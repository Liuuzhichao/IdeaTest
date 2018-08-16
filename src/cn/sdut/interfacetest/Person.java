package cn.sdut.interfacetest;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class Person {

    private String name;
    private int age;
    private String sex;

    public Person(){

    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getInfo() {
        return "姓名:"+name+",年龄:"+age+",性别:"+sex;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

}
