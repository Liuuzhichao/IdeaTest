package cn.sdut.cn.sdut.interfacetest;

import java.util.Scanner;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class Gardener {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.nextLine();
        Fruit fruitKinds = null;
        switch (fruit) {
            case "苹果" :
                fruitKinds = new Apple();
                break;
            case "香蕉" :
                fruitKinds = new Banana();
                break;
            case "葡萄" :
                fruitKinds = new Grape();
                break;
        }
        if ( fruitKinds == null ) {
            System.out.println("输入错误...");
        }
    }
}
