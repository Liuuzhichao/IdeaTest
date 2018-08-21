package cn.sdut.exception;

import java.util.Scanner;

/**
 * Created by liuzhichao on 2018/8/21.
 */
public class EcmDef {

    public static void main(String[] args) throws EcDefException {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Integer m = in.nextInt();
        //boolean flag = n instanceof Integer;
        //System.out.println(flag);
        if( n==null || m==null ) {
            throw new ArrayIndexOutOfBoundsException("缺少命令行参数");
        }
        if( m==0 ) {
            throw new ArithmeticException("除0操作");
        }
        if( n<0 || m<0 ) {
            throw new EcDefException("负数");
        }
        System.out.println(n/m);
    }

}
class EcDefException extends Exception{
    public EcDefException() {

    }
    public EcDefException(String msg) {
        super(msg);
    }
}
