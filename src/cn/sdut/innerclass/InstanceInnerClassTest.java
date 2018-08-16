package cn.sdut.innerclass;

/**
 * Created by liuzhichao on 2018/8/16.
 */

/**
 * 实例内部类
 */
public class InstanceInnerClassTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * 如果在其他类中创建内部类对象,必须先创建外部类的实例,
         * 然后在外部类的实例的基础上创建内部类对象实例
         */
		/*InstanceOuter  outer=new  InstanceOuter();
		InstanceOuter.InstanceInner  inner=outer.new  InstanceInner() ;*/

        InstanceOuter.InstanceInner  inner=new InstanceOuter().new  InstanceInner();
        inner.mb(30);
        System.out.println(inner.i);
    }

}

class  InstanceOuter
{
    int i=10;
    private	int j=3;
    static  int m=23;
    public  void ma(){
        /**
         * 内部类可以直接访问外部类的成员,
         * 而外部类想要访问内部类的成员,必须创建内部类的对象实例,通过实例访问
         */
        InstanceInner  in=new InstanceInner();
        in.mb(0);
        System.out.println(in.i);
    }
    public  static   void  mc(){}
    //实例内部类
    class  InstanceInner
    {
        int i=20;
        //static  int n=12;//在内部类中不能定义静态成员，只能定义实例成员
        //public static   void md(){}//在内部类中不能定义静态成员，只能定义实例成员
        public  void mb(int  i)
        {
            /**
             * 内部类可以直接访问外部类的成员
             */
			j=34;
			m=34;
			System.out.println("mb...");
			mc();

            /**
             * 如果内部类中的成员或者局部变量和外部类成员同名时的访问方式
             */
            System.out.println(i);//局部变量
            System.out.println(this.i);//内部类
            System.out.println(InstanceOuter.this.i);//外部类
        }
    }

}