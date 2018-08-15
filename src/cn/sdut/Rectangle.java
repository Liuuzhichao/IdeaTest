package cn.sdut;

/**
 * Created by liuzhichao on 2018/8/15.
 */

import java.text.DecimalFormat;

/**
 * 矩形类
 */
public class Rectangle extends Shape {

    private double width;//长
    private double height;//宽

    public Rectangle() {

    }

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPer() {
        return 2*(width+height);
    }

    @Override
    public void show(){
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("矩形的长是:"+width+",宽是:"+height+",周长是:"
                +df.format(getPer()) +",面积是:"+df.format(getArea()));
    }

}
