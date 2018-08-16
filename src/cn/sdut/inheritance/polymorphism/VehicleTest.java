package cn.sdut.inheritance.polymorphism;

public class VehicleTest {

    public  static void main(String[] args) {
        Vehicle vehicle = new Vehicle("benz","black");
        vehicle.run();

        Car car = new Car("Honda","red",2);
        car.run();

    }
}
