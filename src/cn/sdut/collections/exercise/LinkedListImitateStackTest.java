package cn.sdut.collections.exercise;

/**
 * Created by liuzhichao on 2018/8/22.
 */

import java.util.LinkedList;

/**
 * 1、请使用LinkedList来模拟一个队列(先进先出的特性): [必做题]
 * 1.1 拥有放入对象的方法void put(Object o)
 * 1.2 取出对象的方法Object get()
 * 1.3 判断队列当中是否为空的方法boolean isEmpty()；并且，编写测试代码，验证你的队列是否正确。
 */

public class LinkedListImitateStackTest {

    public static void main(String[] args) {
        LinkedListImitateStack<Integer> list = new LinkedListImitateStack<Integer>();
        /**
         * 添加元素并展示所添加的元素
         */
        list.put(1001);
        list.put(1002);
        list.put(1003);
        list.put(1004);
        list.show();

        /**
         * 判断栈是否为空,非空
         */
        System.out.println(list.isEmpty());

        /**
         * 元素出栈,并展示栈中剩余的元素
         */
        for(int i = 0; i < 4; i++) {
            System.out.print(list.get()+"出栈,栈中剩余元素:");
            list.show();
        }

        /**
         * 判断栈是否为空,已空
         */
        System.out.println(list.isEmpty());

    }

}

class LinkedListImitateStack<E> {
    private LinkedList<E> list = new LinkedList<>();

    /**
     * 进栈操作
     * @param item  进栈的元素
     */
    public void put(E item) {
        list.add(item);
    }

    /**
     * 出栈操作
     * @return 返回并移除栈顶元素
     */
    public E get() {
        return list.remove();
    }

    /**
     * 判断是否为空
     * @return
     */
    public boolean isEmpty() {
        if( list.size() > 0 ) {
            return false;
        }
        return true;
    }

    /**
     * 打印栈中的元素
     */
    public void show() {
        for(E item: list) {
            System.out.print(item+"\t");
        }
        System.out.println();
    }

}
