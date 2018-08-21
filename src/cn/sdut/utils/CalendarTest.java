package cn.sdut.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by liuzhichao on 2018/8/21.
 */

/**
 * Calendar和GregorianCalendar用法基本一致
 */
public class CalendarTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //使用默认时区和语言环境获得一个日历。
        Calendar c = Calendar.getInstance();
        //使用指定时区和语言环境获得一个日历。
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"), Locale.US);
        display(c1);

        //返回一个表示此 Calendar 时间值的 Date 对象,即当前时间
        Date d = c1.getTime();
        System.out.println(d.toString() + "******");

        // 获得时区。
        TimeZone tz = c1.getTimeZone();
        System.out.println(tz.getDisplayName());

        //设置时间,Java和Oracle一样,月份是从0-11,所以设置以及读取时要注意+1
        c.set(2008, 7, 12);//2008年8月12
        System.out.println(c.get(Calendar.MONTH) + 1);

        //获取Date类型的时间
        Date d2 = c.getTime();
        System.out.println(d2.toString());
    }

    /**
     * 分别获取年月日等,进行输出
     *
     * @param c
     */
    public static void display(Calendar c) {
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1)
                + "-" + c.get(Calendar.DAY_OF_MONTH) + " " + c.get(Calendar.HOUR_OF_DAY) +
                ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
