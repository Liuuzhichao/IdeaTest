package cn.sdut.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by liuzhichao on 2018/8/17.
 */

/**
 * throws抛出异常,方法声明后抛出异常,谁调用谁处理
 * 覆盖方法:不能抛出比父类更大的异常,运行时异常例外
 */
public class ThrowsExceptionTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ThrowsClass  tc=new ThrowsClass();
        ThrowsClass  tc1=new ChildClass();
        /**
         * 可以继续往外抛异常,最终被Java虚拟机处理,但是通常在最后都要自己进行异常处理
         */
        try {
            tc.mc();
            tc1.ma();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RuntimeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}


class ThrowsClass {
    public void ma() throws FileNotFoundException {
            FileInputStream fin = new FileInputStream("c:\\a.txt");
    }

    public void mb() throws FileNotFoundException, RuntimeException {
        ma();
    }

    public void mc() throws FileNotFoundException, RuntimeException, Exception {
        mb();
    }
}

class ChildClass extends ThrowsClass {
    /**
     * 子类如果抛出异常,只能够是父类的异常类或者是父类的异常类的子类
     * @throws RuntimeException
     */
    public void ma() throws RuntimeException {
        System.out.println("child  ma...");
    }

    /**
     *子类可以不抛出异常
     */
    public void mb(){
        System.out.println("...");
    }
}