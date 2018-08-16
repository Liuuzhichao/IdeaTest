package cn.sdut.inheritance.abstractclass;

/**
 * Created by liuzhichao on 2018/8/15.
 */

import java.text.DecimalFormat;

/**
 * 圆
 */
public class Circle extends Shape {

    //定义常量
    private final double PI = 3.14;
    private double radius;//半径

    public Circle() {

    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getPer() {
        return 2*PI*radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public void show() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("圆的半径是:"+radius+",周长是:"+
                df.format(getPer())+",面积是:"+df.format(getArea()));
    }

}


