package cn.sdut.utils.stringexercise;

/**
 * Created by liuzhichao on 2018/8/20.
 */

/**
 * 3.String s=”name=zhangsan age=18 classNo=高校个体1班”;
 * 将上面的字符串拆分，结果如下:
 * zhangsan 18 090728
 */

/**
 * 4.String s = "zhangsan@ www  neusoft  com"
 * 请输出所有子串
 * zhangsan
 * www
 * neusoft
 * com
 */
public class SplitString {

    public static void main(String[] args) {
        String s = "name=zhangsan age=18 classNo=高校个体1班";
        splitString(s);
        System.out.println("*****************************");
        String ss = "zhangsan@ www  neusoft   com";
        //String sss = ss.replace("  "," ");
        splitString(ss);
    }

    /**
     * 去掉字符串中的空格,任意个空格
     * @param str
     */
    public static void splitString(String str) {
        String[] st = str.split(" ");
        for( int i = 0; i < st.length; i++ ) {
            String s = st[i].trim();
            if( !s.equals("") ) {
                System.out.println(s);
            }
        }
    }
}
