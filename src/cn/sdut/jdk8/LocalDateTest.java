package cn.sdut.jdk8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
 * Created by liuzhichao on 2018/8/31.
 */
public class LocalDateTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LocalDate d=LocalDate.now();
        System.out.println(d.toString());

        LocalDate  d1=LocalDate.of(2017, 11, 23);
        System.out.println(d1.toString());

        LocalTime ld1=LocalTime.now();
        System.out.println(ld1.toString());

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt.toString());


        System.out.println(d.plusMonths(2));//+2
        System.out.println(d.minusMonths(2));//-2

        System.out.println(d.getYear()+"\t"+d.getMonthValue()+"\t"
                +"\t"+d.getDayOfMonth());

        System.out.println("========================");
        //获取UTC日期
        Instant in=Instant.now();
        System.out.println(in.toString());

        OffsetDateTime odt=in.atOffset(ZoneOffset.ofHours(8));//偏移8小时
        System.out.println(odt.toString());

        System.out.println(in.toEpochMilli());//毫秒

        System.out.println("=======================");

        //Duration:两个时间之间的间隔

        Instant  in1=Instant.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Instant  in2=Instant.now();

        Duration  dd=Duration.between(in1, in2);
        System.out.println(dd.getSeconds());

        //Period
        Period  p=Period.between(d1, d);
        System.out.println(p.getYears()+"\t"+p.getMonths()+
                "\t"+p.getDays());

        System.out.println("=====================================");
        //DateTimeFormatter
        DateTimeFormatter dtf=DateTimeFormatter.ISO_DATE;
        String  date=dtf.format(d);
        System.out.println(date);

        DateTimeFormatter  dtf1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String  date1=dtf1.format(d);//日期--->字符串
        System.out.println(date1);

        //字符串--->日期 parse()
        LocalDate  d5=d.parse(date);
        System.out.println(d5.toString());

        System.out.println("============================");

        Set<String> set=ZoneId.getAvailableZoneIds();
        set.forEach(System.out::println);

        System.out.println("========================");
        LocalDateTime  ldt1=LocalDateTime.now(ZoneId.of("Europe/Brussels"));
        System.out.println(ldt1.toString());

    }
}
