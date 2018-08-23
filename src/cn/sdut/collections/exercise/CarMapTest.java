package cn.sdut.collections.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * 练习5:
 *  1 ）封装一个汽车类，包含String name、int speed属性，
 *      在测试类中实例化三个对象：c1，c2，c3，
 *      分别设置name为：“奥拓”，“宝马”，“奔驰”，速度分别设置为：100,200,300
 * 2 ）使用Map集合对象m1将这三个汽车类对象保存成key，
 *     然后将int型的汽车价钱作为值保存在m1的value中,
 *     上述三款汽车分别对应的价钱是10000,500000,2000000
 * 3 ）遍历m1的键，打印name属性
 * 4 ）通过合适的方法，求出m1中“宝马”的价格，并打印结果；
 * 5 ）经过折旧，所有汽车都降价到原来的80%，请打印降价后“宝马”的价格
 */
public class CarMapTest {

    public static void main(String[] args) {

        Car c1 = new Car("奥拓", 100);
        Car c2 = new Car("宝马", 200);
        Car c3 = new Car("奔驰", 300);

        Map<Car, Integer> map = new HashMap<>();
        map.put(c1, 10000);
        map.put(c2,500000);
        map.put(c3,2000000);

        Set<Car> set = map.keySet();
        for(Car item: set) {
            System.out.print(item.getName()+"\t");
        }
        System.out.println();

        for(Car item: set) {
            if(item.getName().equals("宝马")) {
                System.out.println(map.get(item));
                break;
            }
        }

        for(Map.Entry<Car,Integer> item: map.entrySet()) {
            map.put(item.getKey(), (int) (item.getValue()*0.8));
        }

        for(Car item: set) {
            if(item.getName().equals("宝马")) {
                System.out.println(map.get(item));
                break;
            }
        }

    }

}

class Car {

    private String name;
    private int speed;

    public Car() {
    }

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
