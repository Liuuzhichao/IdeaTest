package cn.sdut;

/**
 * Created by liuzhichao on 2018/8/15.
 */
public abstract class Shape {
    private double area;//面积
    private double per;//周长
    private String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPer();

    public abstract void show();

    public String getColor() {
        return color;
    }

}
