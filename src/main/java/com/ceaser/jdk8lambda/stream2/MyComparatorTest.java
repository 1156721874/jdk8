package com.ceaser.jdk8lambda.stream2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2017/2/18.
 */
public class MyComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao","hello","world","welcome");
        //Collections.sort(list,(item1,item2) -> item1.length()-item2.length());
        //Collections.sort(list,Comparator.comparingInt(String::length));
        //Collections.sort(list,Comparator.comparingInt(String::length).reversed());
        list.sort(Comparator.comparingInt(String::length).reversed());
        list.sort(Comparator.comparingInt((String item) -> item.length()).reversed());
     // Collections.sort(list,Comparator.comparingInt(item -> item.length()).reversed());  编译器认为item的类型为Object所以会出现编译错误，不识别length()方法
        Collections.sort(list,Comparator.comparingInt((String item )-> item.length()).reversed());//指定编译类型  解决 编译推断无法推断的地方
/**
 * (1)
 * 编译器为什么没有识别“item -> item.length()”这种使用方式（没有推断出编译类型），我们查看Comparator的comparingInt方法：
 *  public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> keyExtractor) {
 Objects.requireNonNull(keyExtractor);
 return (Comparator<T> & Serializable)
 (c1, c2) -> Integer.compare(keyExtractor.applyAsInt(c1), keyExtractor.applyAsInt(c2));
 }
 可以看到comparingInt参数的ToIntFunction的泛型为? super T ，意思就是说 类型可以是“？”或者是“？”的父类，在这段代码中，list的泛型是String，那么
 String的父类是Object所以我们在IDE中看看到的item的类型是Object类，然后Object类并没有length()方法。

 (2)关于reverse
 (2.1)Collections.sort(list,Comparator.comparingInt(item -> item.length()).reversed());
 (2.2)Collections.sort(list,Comparator.comparingInt(item -> item.length());
 Collections.sort(list,Comparator.comparingInt(item -> item.length())这行代码能正常编译，但是加上reversed()之后变成;
 Collections.sort(list,Comparator.comparingInt(item -> item.length()).reversed())就无法推断出编译 类型，因为Collections.sort(list,Comparator.comparingInt(item -> item.length())
 第一层直接是一个比较器，而加上reversed()之后reversed()方法又返回一个<T>类型的Comparator，中间隔了一个比较器（Comparator.comparingInt(item -> item.length())）
 (2.1)的推断推断长度是1，(2.2)的推断长度是2.编译器无法推断。
 */

//Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
       // Collections.sort(list,Comparator.comparingInt(String::length).thenComparing((item1,item2)->item1.toUpperCase().compareTo(item2.toUpperCase())));
      //  Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));

        /**
         * thenComparing之针对比较结果为0的才会调用
         */
        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())));

        //最后一个比较器没有发挥作用
        Collections.sort(list,Comparator.comparingInt(String::length).
                thenComparing(Comparator.comparing(String::toLowerCase,Comparator.reverseOrder())).
                thenComparing(Comparator.reverseOrder()));//[world, nihao, hello, welcome]


        System.out.println(list);
    }
}
