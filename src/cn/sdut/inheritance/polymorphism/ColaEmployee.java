package cn.sdut.inheritance.polymorphism;

public class ColaEmployee {

    private String name;
    private double month;

    public ColaEmployee() {
    }

    public ColaEmployee(String name, double month) {
        this.name = name;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonth() {
        return month;
    }

    public void setMonth(double month) {
        this.month = month;
    }

    public double getSalary(int month) {
        if( this.month == month ) {
            return 100;
        }
        return 0;
    }

}
