package cn.sdut;

public class SalesEmployee extends ColaEmployee {

    private double sellSal;//销售额
    private double sal;//提成率

    public SalesEmployee() {
    }

    public SalesEmployee(String name, double month, double sellSal, double sal) {
        super(name, month);
        this.sellSal = sellSal;
        this.sal = sal;
    }

    public double getSellSal() {
        return sellSal;
    }

    public void setSellSal(double sellSal) {
        this.sellSal = sellSal;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + sellSal*(1+sal);
    }
}
