package cn.sdut.cn.sdut.innerclass;

/**
 * Created by liuzhichao on 2018/8/16.
 */

/**
 * 匿名内部类:没有名字的特殊内部类
 */
public class AnonyInnerTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * 实质是一个向上转型,dog是一个多态对象
         * =后面的 new Animal() 的实质是创建的是一个Animal的子类对象,
         * 只不过该子类对象没有名字,所以先用父类的名字代替
         */
        Animal   dog=new Animal(){
            public  void run()
            {
                System.out.println("四条腿跑....");
            }
        };
        dog.run();
        Animal  fish=new Animal(){

            public  void run()
            {
                System.out.println("游来游去....");
            }
        };

        fish.run();
        Ia11  a=new Ia11(){


            public void ma() {
                // TODO Auto-generated method stub
                System.out.println("ma....");
            }
            public  void  md(){}
        };
        a.ma();
        /**
         * 不能调用子类所特有的属性
         */
        //a.md();
    }

}

abstract  class  Animal
{
    public  abstract  void run();

}

interface Ia11
{
    void ma();
}