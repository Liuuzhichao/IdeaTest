package cn.sdut.interfacetest;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class Apple implements Fruit {

    private String color;

    public Apple() {
        System.out.println("创建了一个苹果对象");
    }

    public Apple(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    @Override
    public void getFruit(){
        System.out.println("get apples");
    }

    @Override
    public void waterFruit(){
        System.out.println("water apples");
    }

}
