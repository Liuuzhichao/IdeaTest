package cn.sdut.thread;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * 线程方法的一些使用
 */
public class ThreadMethodTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread3 t1 = new MyThread3();
        Thread tt = new Thread(t1);
        tt.setName("tt");
        tt.start();//启动线程
        for (int i = 0; i < 1000; i++) {
            //获得当前线程的名字
            System.out.println(Thread.currentThread().getName() + ":" + i);
            Thread.yield();
        }
    }

}

class MyThread3 implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            //暂停当前线程
            Thread.yield();
        }
    }

}