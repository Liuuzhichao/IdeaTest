package cn.sdut.inheritance.polymorphism;

import cn.sdut.inheritance.polymorphism.Vehicle;

public class Car extends Vehicle {

    private int loader;

    public Car(){

    }

    public Car(String brand, String color, int loader) {
        super(brand,color);
        this.loader = loader;
    }

    /**
     * 覆盖父类中的run()方法,在创建子类对象时,
     *子类的run()方法替在内存中替换掉父类中的run()方法
     */
    public void run() {
        System.out.println("the car is running...");
    }

}
