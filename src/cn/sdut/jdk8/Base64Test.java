package cn.sdut.jdk8;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * Created by liuzhichao on 2018/8/31.
 */

/**
 * Base64的使用
 */
public class Base64Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            //getEncoder():编码
            String bs64 = Base64.getEncoder().encodeToString("hello  java".getBytes("UTF-8"));
            System.out.println(bs64);

            //getDecoder():解码
            byte[] bys = Base64.getDecoder().decode("aGVsbG8gIGphdmE=");

            System.out.println(new String(bys));
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
