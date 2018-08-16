package cn.sdut.inheritance.abstractclass;

/**
 * Created by liuzhichao on 2018/8/16.
 */

/**
 * 设计一张抽象的门Door，那么对于这张门来说，就应该拥有所有门的共性，
 * 开门openDoor()和关门closeDoor()；然后对门进行另外的功能设计,
 * 防盗--theftproof()、防水--waterproof()、防弹--bulletproof()、防火、防锈……
 * 要求：利用继承、抽象类、接口的知识设计该门
 */
public abstract class Door {

    abstract void openDoor();
    abstract void closeDoor();

}
