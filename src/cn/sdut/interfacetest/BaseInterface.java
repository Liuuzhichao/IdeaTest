package cn.sdut.interfacetest;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public interface BaseInterface {

    int i = 0;//实际上是 public static final int i = 0;

    void show();//实际上是 public abstract void show();

    /**
     * 默认方法,可以有方法体,jdk1.8之后才支持
     * 一个接口中可以有多个默认方法
     */
    default void sayHello() {
        System.out.println("Hello");
    }

    default void sayBye(){
        System.out.println("bye");
    }

}
