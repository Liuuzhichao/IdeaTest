package cn.sdut.utils.overwriteequals;

/**
 * Created by liuzhichao on 2018/8/21.
 */

/**
 * 编写一个Employee类,员工的id\name\age\salary相同,就认为是同一个员工.
 * 重写equals()和hashCode()方法
 */
public class Employee {

    private int id;
    private String name;
    private double sal;

    public Employee() {

    }

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj ) {
            return true;
        }
        if( obj == null ) {
            return false;
        }
        if( obj instanceof Employee ) {
            Employee emp = (Employee) obj;
            return this.id==emp.id && this.name.equals(emp.name) && this.sal==emp.sal;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (31*this.id + 31*this.name.hashCode() + 7*this.sal);
    }
}
