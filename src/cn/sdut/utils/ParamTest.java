package cn.sdut.utils;

/**
 * Created by liuzhichao on 2018/8/20.
 */
public class ParamTest {

    public static void main(String... args) {
        // TODO Auto-generated method stub
        ParamClass pc = new ParamClass();
        pc.ma(1, 2, 3, 45, 5);
        System.out.println("===================");
        pc.ma(34, 23);
        System.out.println("===================");
        pc.ma(22);
        System.out.println("===================");
        pc.ma(34, 23, 44, 55, 66, 77, 8, 9, 12, 23);
    }

}

class ParamClass {
    /**
     * 一个方法中只能有一个可变长参数
     * 可变长参数必须是最后一个参数
     * @param j
     * @param arr 可变参数   ... 类似于动态的一维数组
     */
    public void ma(int j, int... arr) {
        for (int item : arr) {
            System.out.print(item + "\t");
        }
        System.out.println();
    }
}
