package cn.sdut;

public class SalariedEmployee extends ColaEmployee {

    private double monthSal;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, double month, double monthSal) {
        super(name, month);
        this.monthSal = monthSal;
    }

    public double getMonthSal() {
        return monthSal;
    }

    public void setMonthSal(double monthSal) {
        this.monthSal = monthSal;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+monthSal;
    }

}
