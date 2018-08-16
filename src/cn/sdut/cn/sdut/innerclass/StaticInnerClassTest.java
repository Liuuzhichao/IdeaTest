package cn.sdut.cn.sdut.innerclass;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class StaticInnerClassTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * 在其他类中创建内部类对象,可以直接new创建,不必通过外部类对象实例
         */
        StaticOuter.StaticInner  inn=new StaticOuter.StaticInner();
        System.out.println(StaticOuter.StaticInner.n);
        /**
         * 在其他类中可以通过完整的类名访问内部类的静态成员
         */
        StaticOuter.StaticInner.me();

    }

}

class  StaticOuter
{

    int  i=10;
    static  int j=20;
    public void  mb(){}
    public static  void mc(){}
    //静态内部类
    static  class   StaticInner
    {
        /**
         * 在静态内部类中,可以定义静态成员和非静态成员
         */
        int  m=23;
        static  int n=33;
        public static  void me()
        {
            System.out.println("me....");
        }
        public  void ma()
        {
            /**
             *如果需要访问实例成员,需要通过实例访问
             */
            StaticOuter  oo=new StaticOuter();
            oo.i=23;
            oo.mb();
            /**
             * 静态内部类可以直接访问外部类中的静态成员
             */
            j=23;
            mc();

        }

    }
}