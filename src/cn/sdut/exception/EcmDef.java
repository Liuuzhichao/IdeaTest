package cn.sdut.exception;

import java.util.Scanner;

/**
 * Created by liuzhichao on 2018/8/21.
 */

/**
 * 编写应用程序EcmDef.java,接收命令行的两个参数,要求不能输入负数,计算两个数相除.
 * 对缺少命令行参数(ArrayIndexOutOfBoundsException)、
 * 除0（ArithmeticException）以及输入负数（EcDefException）进行异常处理。
 */
public class EcmDef {

    public static void main(String[] args) throws EcDefException {
        Scanner in = new Scanner(System.in);
        /**
         * 按回车字符串读取到的是"",而不是null,所以要用equals()方法进行判断
         */
        String n = in.nextLine();
        String m = in.nextLine();
        boolean flag = n instanceof String;
        System.out.println(flag);
        if( n==null || m==null || m.equals("") || n.equals("") ) {
            throw new ArrayIndexOutOfBoundsException("缺少命令行参数");
        }
        /*if( m==0 ) {
            throw new ArithmeticException("除0操作");
        }
        if( n<0 || m<0 ) {
            throw new EcDefException("负数");
        }*/
        System.out.println(Integer.parseInt(n)/Integer.parseInt(m));
    }

}
class EcDefException extends Exception{
    public EcDefException() {

    }
    public EcDefException(String msg) {
        super(msg);
    }
}
