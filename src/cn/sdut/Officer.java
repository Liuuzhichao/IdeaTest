package cn.sdut;

public class Officer extends Employee{

    private String dept;

    public String getDept() {
        return this.dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


    public void display () {
        System.out.println(getId()+","+getName()+","+dept);
    }

}
