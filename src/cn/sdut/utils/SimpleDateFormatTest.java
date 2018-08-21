package cn.sdut.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liuzhichao on 2018/8/21.
 */
public class SimpleDateFormatTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * SimpleDateFormat
         */
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String d=	sdf.format(new Date()); //将日期类型格式化为字符串
        System.out.println(d);
        try {
            Date d1=	sdf.parse("2018-08-20 20:13:10");//将字符串格式化为日期类型
            System.out.println(d1.toString());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /**
         * Date
         */
        Date  d1=new Date();
        Date  d2=new Date();
        System.out.println(d1.toString());
        System.out.println(d1==d2);//false
        System.out.println(d1.equals(d2));//true
        //返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        long  lon=d1.getTime();
        System.out.println(lon);
        /**
         * DateFormat
         */
        //获得日期/时间 formatter该formatter具有默认语言环境的给定日期和时间格式化风格。
        DateFormat df= DateFormat.getDateTimeInstance();
        //获得日期 formatter，该 formatter 具有默认语言环境的给定格式化风格。
        DateFormat  df1=DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df.format(new Date()));
        System.out.println(df1.format(new Date()));

        try {
            //从给定字符串的开始分析文本，以生成一个日期。
            Date  dd= df.parse("2018-8-20 20:04:58");
            System.out.println(dd.toString());
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
