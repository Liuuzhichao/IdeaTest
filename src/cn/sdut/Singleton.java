package cn.sdut;

/**
 * 单例模式
 */

public class Singleton {

    //产生本类的唯一一个静态实例
    //private static Singleton instance = new Singleton(); //方法1
    private static Singleton instance; //方法2,用静态块

    /**
     * 构造器私有化
     */
    private Singleton(){

    }

    static {
        instance = new Singleton();
    }

    /**
     * 公开一个静态的方法返回该实例
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }

}
