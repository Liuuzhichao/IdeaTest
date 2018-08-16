package cn.sdut.innerclass;

/**
 * Created by liuzhichao on 2018/8/16.
 */

/**
 * 接口和父类中的某个方法同名,通过内部类解决
 */
public class InnerTest1 {

    public static void main(String[] args) {

        A  a=new A();
        a.ma(); //父类中的ma()方法
        a.getObj().ma(); //重写接口中ma()方法
    }

}
class Parent
{
    public void ma()
    {
        System.out.println("parent  class  ma...");
    }
}

interface  Ia
{
    void ma();
}
class A extends Parent
{
    class InnerA implements Ia
    {

        @Override
        public void ma() {
            // TODO Auto-generated method stub
            System.out.println("interface   ma....");
        }

    }

    public  Ia  getObj()
    {
        Ia  ia=new InnerA();
        return ia;
    }
}
