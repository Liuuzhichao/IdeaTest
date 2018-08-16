package cn.sdut.cn.sdut.interfacetest;

/**
 * Created by liuzhichao on 2018/8/16.
 */
public class BaseInterfaceTest implements BaseInterface {

    /**
     *会报编译错误,类中的默认访问权限是default(friendly),
     * 而接口中的默认访问权限是public,
     * 类中的访问权限需要大于等于接口的方法的访问权限
     */
   /* @Override
    void show() {

    }*/

    /**
     * 正确的重写
     */
    @Override
    public void show() {

    }
}
