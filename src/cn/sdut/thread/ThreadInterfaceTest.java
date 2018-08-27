package cn.sdut.thread;

/**
 * Created by liuzhichao on 2018/8/24.
 */
public class ThreadInterfaceTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread1 t1 = new MyThread1();
        Thread tt = new Thread(t1);
        tt.start();//启动线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("In  main  i=" + i);
        }
    }

}

/**
 * 使用线程接口进行多线程
 */
class MyThread1 implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 1000; i++) {
            System.out.println("In  Run  i=" + i);
        }
    }

}