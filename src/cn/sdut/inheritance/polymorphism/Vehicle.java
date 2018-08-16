package cn.sdut.inheritance.polymorphism;

/**
 * 2、(1)定义一个汽车类 Vehicle，要求如下：（知识点：类的继承 方法的覆盖）
 * （a）属性包括：汽车品牌 brand（String 类型）、颜色 color（String 类型）和速度 speed（double 类型）。
 * （b）至少提供一个有参的构造方法（要求品牌和颜色可以初始化为任意值，但速度的初始值必须为 0）。
 * （c）为属性提供访问器方法。注意：汽车品牌一旦初始化之后不能修改。
 * （d）定义一个一般方法 run()，用打印语句描述汽车奔跑的功能
 * 定义测试类VehicleTest，在其main方法中创建一个品牌为“benz”、颜色为“black”的汽车。
 * (2)定义一个 Vehicle 类的子类轿车类 Car，要求如下：
 * （a）轿车有自己的属性载人数 loader（int 类型）。
 * （b）提供该类初始化属性的构造方法。
 * (c)重新定义 run()，用打印语句描述轿车奔跑的功能。
 * （d）定义测试类 Test，在其 main 方法中创建一个品牌为“Honda”、颜色为“red”，载人数为 2 人的轿车。
 */

public class Vehicle {
    private String brand;
    private String color;
    private double speed;

    public Vehicle () {

    }

    public Vehicle ( String brand, String color ) {
        this.brand = brand;
        this.color = color;
        speed = 0;
    }

    public String  getBrand() {
        return brand;
    }

    public String getColor() {
        return  color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed( double speed ) {
        this.speed = speed;
    }

    public void run () {
        System.out.println("the vehicle is running...");
    }


}
