package cn.sdut.exception;

import java.lang.String;

/**
 * Created by liuzhichao on 2018/8/20.
 */

/**
 * 3．假如要从命令行获得两个整数,自定义两个异常类来描述可能发生的异常：
 * ParameterNumberException（参数个数异常）,ParameterFormateException（参数格式异常）,
 * 设计一个类,在 check(String args[])方法中通告这两个异常,在main方法
 * 中判断相应的情况下触发异常,然后捕获异常,对它们进行处理.(知识点：异常处理机制)
 */
public class ParameterException {

    public static void main(String[] args) throws ParameterFormateException, ParameterNumberException {
        check("a","8888");
        check("a","a","a");
        /**
         * 只有交给Java虚拟机处理(throws)才会报出自定义异常,
         * 无法自己用try..catch捕捉,是否需要重写printStackTrace()方法?
         */
        /*try {
            check("a","a","a");
        } catch(ParameterNumberException | ParameterFormateException ex) {

        }*/
    }

    /**
     *检查参数是否有异常
     * @param strings 可变长参数,参数个数不固定,长度用length属性可知
     * @throws ParameterNumberException
     * @throws ParameterFormateException
     */
    public static void check(String... strings) throws ParameterNumberException,ParameterFormateException {
        System.out.println(strings.length);
        if( strings.length>2 || strings.length<=0 ) {
            throw new ParameterNumberException("参数个数异常");
        } else if(strings[0].length()>3 || strings[1].length()>3) {
            throw new ParameterFormateException("参数格式错误");
        }
    }

}

/**
 * 参数个数异常类
 */
class ParameterNumberException extends Exception {
    public ParameterNumberException() {
    }

    public ParameterNumberException(String msg) {
        super(msg);
    }
}

/**
 * 参数格式错误异常类
 */
class ParameterFormateException extends Exception {
    public ParameterFormateException() {
    }

    public ParameterFormateException(String msg) {
        super(msg);
    }
}