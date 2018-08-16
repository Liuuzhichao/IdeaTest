package cn.sdut.cn.sdut.interfacetest;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class Student extends Person implements Consumer {

    private String school;

    public Student() {

    }

    public Student(String name, int age, String sex, String school) {
        super(name,age,sex);
        this.school = school;
    }

    public void study() {
        System.out.println("study in "+school);
    }

    @Override
    public void useCredit(){
        System.out.println("useCredit...");
    }

}
