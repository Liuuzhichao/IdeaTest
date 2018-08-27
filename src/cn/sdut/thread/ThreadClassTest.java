package cn.sdut.thread;

/**
 * Created by liuzhichao on 2018/8/24.
 */

/**
 * 1个进程可以包含1个或多个线程,一个线程就是一个程序内部的一条执行线索
 */
public class ThreadClassTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread t1 = new MyThread();
        /**
         * 启动线程是用start()方法,然后线程自动调用run()方法,但是线程并不是立马就运行,
         * 而是进入就绪状态,等待CPU的调度才运行
         */
        t1.start();//启动线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("In  main  i=" + i);
        }
    }

}


class MyThread extends Thread {
    //线程体，独立运行的程序片段

    /**
     * run()方法在线程启动后自动调用
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 1000; i++) {
            System.out.println("In  Run  i=" + i);
        }
    }

}
