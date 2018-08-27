package cn.sdut.thread;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * 匿名类和lambda表达式实现多线程
 */
public class ThreadLambdaTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //匿名类
        /*new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                for(int i=0;i<1000;i++){
                    System.out.println("In  Run  i="+i);
                }
            }
         }).start();*/

        //Lambda表达式
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("In  Run  i=" + i);
            }
        }).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("In  main  i=" + i);
        }
    }

}
