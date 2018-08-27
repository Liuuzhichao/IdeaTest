package cn.sdut.thread;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * 线程的优先级
 * Thread.MAX_PRIORITY   10
 * Thread.NORM_PRIORITY  5  main()方法是5
 * Thread.MIN_PRIORITY   1
 */
public class ThreadPriorityTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread t1 = new Thread(new ThreadSample());
        t1.setName("t1");
        t1.setPriority(Thread.MAX_PRIORITY);

        Thread t2 = new Thread(new ThreadSample());
        t2.setName("t2");
        /**
         * 设置线程的优先级
         */
        t2.setPriority(8);


        t1.start();
        t2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()
                    + "(" + Thread.currentThread().getPriority() + "):" + i);
        }
    }

}

class ThreadSample implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()
                    + "(" + Thread.currentThread().getPriority() + "):" + i);
        }
    }

}