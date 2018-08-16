package cn.sdut.cn.sdut.innerclass;

/**
 * Created by liuzhichao on 2018/8/16.
 */

/**
 * 内部类可以模拟实现多继承
 */
public class InnerTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.mc();
    }

}

class  One
{
    public void  ma()
    {
        System.out.println("ma....");

    }
}
class  Two
{
    public void mb()
    {
        System.out.println("mb...");
    }
}
class   Outer
{

    class Inner  extends Two
    {
        public void  mb()
        {
            super.mb();
        }
    }
    class  Inner1 extends One
    {
        public void ma()
        {
            super.ma();
        }
    }

    public  void mc()
    {
        Inner  in=new Inner();
        in.mb();
        Inner1  in1=new Inner1();
        in1.ma();

    }
}