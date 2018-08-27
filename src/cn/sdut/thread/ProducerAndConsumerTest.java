package cn.sdut.thread;

/**
 * Created by liuzhichao on 2018/8/27.
 */

/**
 * 线程中的消费者与生产者问题(临界值问题)
 */
public class ProducerAndConsumerTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Storage s = new Storage(0, 5);
        Producer p1 = new Producer("生产者A", s);
        Producer p2 = new Producer("生产者B", s);

        Consumer c1 = new Consumer("消费者1", s);

        p1.start();
        p2.start();
        c1.start();
    }

}

/**
 * 定义一个仓库类
 */
class Storage {
    private int count;//已有元素的数量
    private int size;//仓库大小

    public Storage(int count, int size) {
        super();
        this.count = count;
        this.size = size;
    }

    /**
     * 进行数据的添加
     * @param n 名字
     */
    public synchronized void addData(String n) {
        /**
         * 如果仓库中已有的元素数量和仓库的容量相同时,
         * 线程等待,不再进行添加元素的操作
         */
        while (count == size) {
            try {
                this.wait();//等待
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        /**
         * 如果仓库中已有的元素数量没达到仓库的容量
         * 唤醒线程,可以进行元素的添加操作
         */
        this.notify();
        count++;
        System.out.println(n + " make  date  count:" + count);

    }

    /**
     * 取出仓库中的元素
     * @param n
     */
    public synchronized void delData(String n) {
        /**
         * 仓库中没有元素时,
         * 线程等待,不能进行取操作
         */
        while (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        /**
         * 仓库中存在元素,
         * 唤醒线程,可以进行取操作
         */
        this.notify();
        System.out.println(n + "  use  data  count:" + count);
        count--;
    }
}

class Producer extends Thread {
    private String name;
    private Storage s;

    public Producer(String name, Storage s) {
        super();
        this.name = name;
        this.s = s;
    }

    /**
     * 往仓库中添加元素的线程
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            s.addData(name);//添加数据
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private String name;
    private Storage s;

    public Consumer(String name, Storage s) {
        super();
        this.name = name;
        this.s = s;
    }

    /**
     * 从仓库中取元素的线程
     */
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            s.delData(name);//取出数据
            try {
                Thread.sleep((int) (Math.random() * 3000));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}