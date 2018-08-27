package cn.sdut.thread;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * join让线程串口化
 * 一个线程必须等待另一个线程的加入才能继续执行
 */
public class ThreadJoinTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Mother monther = new Mother();
        Thread t = new Thread(monther);
        t.start();
    }

}

class Mother implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("妈妈准备做饭");
        System.out.println("发现酱油没了");
        System.out.println("打发儿子去买酱油");
        Thread son = new Thread(new Son());
        son.start();
        try {
            //另一个线程加入,该线程才会继续执行
            son.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            System.out.println("放弃做饭......");
            e.printStackTrace();
        }
        System.out.println("妈妈使用酱油准备做饭了");
    }

}

class Son implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("儿子出门买酱油");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "分钟");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println("儿子发生意外");
                e.printStackTrace();
            }
        }
        System.out.println("儿子出门买酱油回来了");
    }

}