package cn.sdut.cn.sdut.innerclass;

/**
 * Created by liuzhichao on 2018/8/16.
 */

/**
 * 局部内部类:在一个方法内部定义的类叫局部内部类
 */
public class PartInnerTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PortOuter  outer=new PortOuter();
        outer.ma(12);
    }

}

class  PortOuter
{
    int j=10;
    static  int k=23;
    //PortInner p = new PortInner();//局部内部类只能在方法内部使用,方法外部无法使用
    public Object  ma(int m)
    {
        final int  n=20;
        /**
         * 局部内部类类似于局部变量,不能用private/protected/public/static修饰
         */
        class  PortInner
        {
            int i=12;//局部类中不能包含静态成员

            public  void mb()
            {
                /**
                 * 局部内部类可以直接访问所有的外部类成员和方法内final类型的参数和变量
                 */
                j=23;
                k=40;
                i=23;
                System.out.println(n);
                System.out.println(m);
            }
        }
        return new PortInner();
    }
}
