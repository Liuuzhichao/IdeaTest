package cn.sdut.utils;

/**
 * Created by liuzhichao on 2018/8/20.
 */

/**
 * 用海伦公式求三角形面积;
 */
public class TriangleArea {

    public static void main(String[] args) {
        double a = 5;
        double b = 6;
        double c = 7;
        double p = (a+b+c) / 2;
        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(area);
    }

}



