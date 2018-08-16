package cn.sdut.exception;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class ArrayIndexOutOfBounds {

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = i+1;
        }
        boolean flag = false;
        try {
            array[5] = 6;
        } catch(ArrayIndexOutOfBoundsException ex) {
            flag = true;
            //return ;//finally正常执行
            //System.exit(0);//直接退出程序,不执行finally
        } finally {
            String string;
            if(flag) {
                string = "数组异常输出";
            } else {
                string = "数组正常输出";
            }
            System.out.println(string);
        }
    }
}
