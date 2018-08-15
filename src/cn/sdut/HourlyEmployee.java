package cn.sdut;

public class HourlyEmployee extends ColaEmployee {

    private double hourSal;
    private int hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, double month, double hourSal, int hour) {
        super(name, month);
        this.hourSal = hourSal;
        this.hour = hour;
    }

    public double getHourSal() {
        return hourSal;
    }

    public void setHourSal(double hourSal) {
        this.hourSal = hourSal;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+hour*hourSal;
    }
}
