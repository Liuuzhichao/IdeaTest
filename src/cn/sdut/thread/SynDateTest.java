package cn.sdut.thread;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * 线程加锁同步
 */
public class SynDateTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SynDate sd = new SynDate();
        Thread t1 = new Thread(sd);
        Thread t2 = new Thread(sd);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }

}

class SynDate implements Runnable {
    private int i = 1;
    //private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (i <= 10) {
            /**
             * 语句加锁
             */
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                for (int j = 0; j < 10000000; j++) ;
                i++;
            }
            /**
             * lock加锁方式
             */
			/*lock.lock();
			System.out.println(Thread.currentThread().getName()+":"+i);
			for(int j=0;j<10000000;j++);
			i++;
			lock.unlock();*/
        }
    }

}