package cn.sdut.utils;

/**
 * Created by liuzhichao on 2018/8/20.
 */
public class StringTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "Hello Java,Hello World!";
        System.out.println("charAt:" + str.charAt(1));//返回下标索引处的字符

        /*for(int i=0;i<str.length();i++){
	        char ch=str.charAt(i);
	        System.out.println(ch);
	    }*/

        String str1 = "abc";
        System.out.println("concat：" + str.concat(str1));//连接
        System.out.println("endsWith:" + str.endsWith("ld"));//测试此字符串是否以指定的后缀结束。
        System.out.println("startsWith:" + str.startsWith("hello"));//测试此字符串是否以指定的前缀开始

        String str2 = "Abc";
        System.out.println("equals:" + str1.equals(str2));//比较此字符串与指定的对象。
        System.out.println("equalsIgnoreCase:" + str1.equalsIgnoreCase(str2));// 将此 String 与另一个 String 进行比较，不考虑大小写。

        int i = 1;
        int j = 1;
        System.out.println(i + "+" + j + "=" + (i + j));

        System.out.println(String.format("%d+%d=%d", i, j, i + j));//按照某种格式输出

        byte[] bys = str.getBytes();//转成字节数组

        System.out.println("indexOf:" + str.indexOf("Hel", 1));
        System.out.println("lastIndexOf:" + str.lastIndexOf("Hel"));

        System.out.println("replace:" + str.replace('l', '2'));//所有的旧的字符被替换

        System.out.println("substring:" + str.substring(1, 11));//截取字符串>=1  <11

        char[] chs = str.toCharArray();//转成字符数组
        /*for(char  item:chs){
	        System.out.print(item+"\t");
	    }*/
        System.out.println("toUpperCase:" + str.toUpperCase());//大写
        System.out.println("toLowerCase:" + str.toLowerCase());//小写

        String str3 = "   abc   cde          ";
        System.out.println("111:" + str3 + ":222");
        System.out.println("111:" + str3.trim() + ":222");//去掉字符串前后的空格

        System.out.println("valueOf:" + String.valueOf(12.34));//返回 各种类型的参数的字符串表示形式。

        System.out.println("==========================");
        /*String[]  strs=str.split(" ");
        for(String  item:strs){
	        System.out.println(item);
	    }*/

        //String str4="a|b|c|d";
        //String  str4="a*b*c*d";//*  + |  ^
        //String  str4="a^b^c^d";
        String str4 = "a.b.c.d";
        String[] strs = str4.split("\\.");
        for (String item : strs) {
            System.out.println(item);
        }
    }

}
