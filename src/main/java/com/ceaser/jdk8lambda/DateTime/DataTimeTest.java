package com.ceaser.jdk8lambda.DateTime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Collections.addAll;

/**
 * Created by CeaserWang on 2017/4/8.
 */
public class DataTimeTest {
    public static void main(String[] args) {
        LocalDate localdate = LocalDate.now();
        System.out.println(localdate.getYear()+","+localdate.getMonthValue()+","+localdate.getDayOfMonth());

        System.out.println("--------------");

        LocalDate localdate1  = LocalDate.of(2017,4,8);
        System.out.println(localdate1);

        System.out.println("--------------");

        LocalDate localdate2  = LocalDate.of(2017,3,10);
        MonthDay monthday = MonthDay.of(localdate2.getMonth(),localdate2.getDayOfMonth());
        MonthDay monthday1 = MonthDay.from(LocalDate.of(2017,3,10));
        System.out.println(monthday.equals(monthday1));

        System.out.println("--------------");


        LocalTime localtime = LocalTime.now();
        System.out.println(localtime);
        System.out.println("--------------");
        localtime =  localtime.plusHours(20).plusMinutes(10);

        System.out.println(localtime);


        LocalDate  localDate2 =  localdate.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate2);

        System.out.println("--------------");
        LocalDate  localDate3 =  localdate.minus(2,ChronoUnit.MONTHS);
        System.out.println(localDate3);

        Clock clock= Clock.systemDefaultZone();
        System.out.println(clock.millis());

        LocalDate  localDate4  = localdate.now();
        LocalDate localDate5 = localdate.of(2017,4,13);
        System.out.println(localDate4.isAfter(localDate5));
        System.out.println(localDate4.isBefore(localDate5));
        System.out.println(localDate4.equals(localDate5));
        System.out.println("--------------");

        Set<String> set = ZoneId.getAvailableZoneIds();
        Set<String> treeset = new TreeSet<String>(){
            {
                addAll(set);
            }
        };
        treeset.stream().forEach(System.out::println);
        System.out.println("--------------");
       ZoneId zoneid =  ZoneId.of("Asia/Shanghai");
       LocalDateTime localDateTime =  LocalDateTime.now();
        System.out.println(localDateTime);
        ZonedDateTime zonedatatiem =  ZonedDateTime.of(localDateTime,zoneid);
        System.out.println(zonedatatiem);
        System.out.println("--------------");
        YearMonth yearMonth= YearMonth.now();
        System.out.println(yearMonth);
        System.out.println(yearMonth.lengthOfMonth());
        System.out.println(yearMonth.isLeapYear());

        System.out.println("--------------");
        YearMonth yearMonth1= YearMonth.of(2016,2);
        System.out.println(yearMonth1);
        System.out.println(yearMonth1.lengthOfYear());
        System.out.println(yearMonth1.lengthOfMonth());
        System.out.println(yearMonth.isLeapYear());
        System.out.println("--------------");

        LocalDate localdate7 = LocalDate.now();
        LocalDate localdate8 = LocalDate.of(2017,10,1);
        Period period = Period.between(localdate7,localdate8);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println("--------------");
        System.out.println(Instant.now());
    }
}
