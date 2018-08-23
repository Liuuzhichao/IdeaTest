package cn.sdut.collections.exercise;

/**
 * Created by liuzhichao on 2018/8/23.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 完成下面的要求
 * 1) 创建一个List，在List 中增加三个工人，基本信息如下：姓名 年龄 工资
 * zhang3 18 3000
 * li4 25 3500
 * wang5 22 3200
 * 2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
 * 3) 删除wang5 的信息
 * 4) 利用for 循环遍历，打印List 中所有工人的信息
 * 5) 利用迭代遍历，对List 中所有的工人调用work 方法。
 * 6) 为Worker 类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true
 */
public class WorkListTest {

    public static void main(String[] args) {

        List<Worker> list = new ArrayList<Worker>();
        list.add(new Worker("zhang3",18,3000));
        list.add(new Worker("li4",25,3500));
        list.add(new Worker("wang5",22,3200));

        list.add(1,new Worker("zhao6",24,3300));

        list.remove(3);

        for(Worker item: list) {
            System.out.println(item.getName()+","+item.getAge()+","+item.getSalary());
        }

        Iterator it = list.iterator();
        while(it.hasNext()) {
            Worker worker = (Worker) it.next();
            worker.work();
        }

    }

}


class Worker  {
    private int age;
    private String name;
    private double salary;
    public Worker (){}
    public Worker (String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void work(){
        System.out.println(name + "work");
    }

    @Override
    public boolean equals(Object obj) {
        if( this==obj ) {
            return true;
        }
        if( obj==null ) {
            return false;
        }
        if( obj instanceof Worker ) {
            Worker worker = (Worker) obj;
            return this.name.equals(worker.name) && this.age==worker.age
                    && this.salary==worker.salary;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31*name.hashCode() + 31*age + 31*salary);
    }
}