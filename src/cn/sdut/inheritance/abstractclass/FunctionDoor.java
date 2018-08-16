package cn.sdut.inheritance.abstractclass;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class FunctionDoor extends Door implements FunctionOfDoor {
    @Override
    void openDoor() {
        System.out.println("开门方式...");
    }

    @Override
    void closeDoor() {
        System.out.println("关门方式...");
    }

    @Override
    public void theftproof() {
        System.out.println("此门防盗...");
    }

    @Override
    public void waterproof() {
        System.out.println("此门防水...");
    }

    @Override
    public void bulletproof() {
        System.out.println("此门防弹...");
    }
}
