package cn.sdut.utils;

/**
 * Created by liuzhichao on 2018/8/20.
 */
public class StringBufferTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringBuffer sb = new StringBuffer("aaa");
        sb.append("bbb").append("ccc").append("ddd");//追加
        System.out.println(sb.toString());
        sb.delete(1, 3).delete(1, 3).delete(1, 3);//删除  >=1  <3
        System.out.println(sb.toString());
        sb.deleteCharAt(1).deleteCharAt(1);
        System.out.println(sb.toString());
        sb.insert(1, "222").insert(1, "qqq");//插入
        System.out.println(sb.toString());

        sb.replace(1, 4, "33333");//替换
        System.out.println(sb.toString());
        sb.reverse();//反转
        System.out.println(sb.toString());
        sb.setCharAt(1, 'K');//修改
        System.out.println(sb.toString());
    }

}
