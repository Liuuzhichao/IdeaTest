package cn.sdut.thread;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * 守护线程和用户线程
 * 守护线程:精灵线程,不需要做完,Java垃圾回收机制
 * 用户线程:前端线程,必须做完
 */
public class ThreadDaemonTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DaemonSample ds1 = new DaemonSample(3000);
        Thread t1 = new Thread(ds1);
        t1.setName("守护线程");
        //设置为守护线程,默认用户线程
        t1.setDaemon(true);

        DaemonSample ds2 = new DaemonSample(3000);
        Thread t2 = new Thread(ds2);
        t2.setName("用户线程");

        t1.start();
        t2.start();
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

}

class DaemonSample implements Runnable {
    private int n;

    public DaemonSample() {
        super();
        // TODO Auto-generated constructor stub
    }

    public DaemonSample(int n) {
        super();
        this.n = n;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < n; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }


}