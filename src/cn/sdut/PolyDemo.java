package cn.sdut;

/**
 * Created by liuzhichao on 2018/8/15.
 */
public class PolyDemo {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,10,"red");
        Shape circle = new Circle(10,"blue");
        rectangle.show();
        circle.show();
    }
}
