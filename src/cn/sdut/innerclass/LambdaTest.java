package cn.sdut.innerclass;

/**
 * Created by liuzhichao on 2018/8/16.
 */

/**
 * Lambda表达式:当作匿名方法使用
 * 允许将行为传递到函数里
 */
public class LambdaTest {

    public  static  void main(String[] args)
    {
        Ib  b=(i,j)->{
            int sum=i+j;
            System.out.println("ma..."+sum);};
        b.ma(1,2);
    }

}

interface Ib
{
    void ma(int i,int j);
}