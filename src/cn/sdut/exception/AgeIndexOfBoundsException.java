package cn.sdut.exception;

/**
 * Created by liuzhichao on 2018/8/17.
 */

/**
 * 自定义工具类,继承Exception或者Exception的子类
 */
public class AgeIndexOfBoundsException extends Exception{

    public  AgeIndexOfBoundsException(){}
    public AgeIndexOfBoundsException(String msg)
    {
        super(msg);
    }

}
