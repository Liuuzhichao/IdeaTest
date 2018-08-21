package cn.sdut.utils;

/**
 * Created by liuzhichao on 2018/8/21.
 */
public class MathTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("cbrt:"+Math.cbrt(8));//立方根
        System.out.println("sqrt:"+Math.sqrt(4));//平方根
        System.out.println("pow:"+Math.pow(2, 3));//求幂
        System.out.println("exp:"+Math.exp(1));//
        System.out.println("ceil:"+Math.ceil(2.5));//3.0比参数大的最小整数
        System.out.println("exp:"+Math.floor(2.5));//2.0比参数小的最大整数
        System.out.println("round:"+Math.round(2.5));//3四舍五入
        System.out.println("max:"+Math.max(12, 34));// 最大值
        System.out.println("min:"+Math.min(23, 12));// 最小值

        System.out.println("random:"+Math.random());//随机值>=0.0 <1.0
    }

}
