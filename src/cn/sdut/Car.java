package cn.sdut;

public class Car extends Vehicle {

    private int loader;

    public Car(){

    }

    public Car(String brand, String color, int loader) {
        super(brand,color);
        this.loader = loader;
    }

    public void run() {
        System.out.println("the car is running...");
    }

}
