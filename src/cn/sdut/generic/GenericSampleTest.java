package cn.sdut.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuzhichao on 2018/8/23.
 */

/**
 * T:包括Object在内的所有的类型都可以
 * 		<T extends Number>:表示把T限定在Number及其子类的类的类型
 * 			extends后面只能是一个类
 * 		<T extends Number&Comparable&...>
 * 			限定在Number类并且实现了Comparable接口的数据类型,接口可以连接多个
 * 	通配符:?
 * 	上界通配符: ? extends A  : A类或者A类的子类
 * 	下界通配符: ? super  A   : A类或者A类的父类
 */
public class GenericSampleTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * 下面注释掉的代码会报错,因为strs和objs是并行的,兄弟关系,并不存在继承关系
         */
		/*List<String>  strs=new ArrayList<>();
		List<Object>  objs=strs;*/

        List<String> strs = new ArrayList<>();
        List<? extends Object> objs = strs;


        GenericSampleTest gst = new GenericSampleTest();
        List<Object> objs1 = new ArrayList<>();
        gst.ma(objs1);
        //下面语句报错,以为ma()方法已经限定了数据类型,只能是Number类或者其父类
        //gst.ma(strs);
        List<Number> nums = new ArrayList<>();
        gst.ma(nums);
    }

    public void ma(List<? super Number> arr) {
    }
}
