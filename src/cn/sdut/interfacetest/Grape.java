package cn.sdut.interfacetest;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class Grape implements Fruit {

    private int num;//颗粒数

    public Grape() {
        System.out.println("创建了一个葡萄对象");
    }

    public Grape(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void getFruit() {
        System.out.println("get grapes");
    }

    @Override
    public void waterFruit() {
        System.out.println("water grapes");
    }

}
