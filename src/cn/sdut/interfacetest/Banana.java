package cn.sdut.interfacetest;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class Banana implements Fruit {

    private double length;

    public Banana() {
        System.out.println("创建了一个香蕉对象");
    }

    public Banana(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void getFruit() {
        System.out.println("get bananas");
    }

    @Override
    public void waterFruit() {
        System.out.println("water bananas");
    }

}
