package com.masonliu.androidjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1 Stream 不是集合元素，它不是数据结构并不保存数据，它是有关算法和计算的，它更像一个高级版本的 Iterator。
 * 2 Stream 会隐式地在内部进行遍历
 * 3 Stream 可以并行化操作,使用并行去遍历时，数据会被分成多个段，其中每一个都在不同的线程中处理，然后将结果一起输出。
 * Created by liumeng on 16/6/21.
 */

public class TestStream {
    public static void test() {
        // 1. Individual values
        Stream stream = Stream.of("a", "b", "c");
        // 2. Arrays
        String[] strArray = new String[]{"a", "b", "c"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        // 3. Collections
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();

        IntStream.of(new int[]{1, 2, 3}).forEach(a -> System.out.println(a));
        System.out.println("IntStream.of");
        //双冒号语法叫 方法引用, 可以理解为Lambda表达式的简写
        IntStream.range(1, 3).forEach(System.out::println);
        System.out.println("IntStream.range");
        IntStream.rangeClosed(1, 3).forEach(System.out::println);

//        // 1. Array
//        String[] strArray1 = stream.toArray(String[]::new);
//        // 2. Collection
//        List<String> list1 = stream.collect(Collectors.toList());
//        List<String> list2 = stream.collect(Collectors.toCollection(ArrayList::new));
//        Set set1 = stream.collect(Collectors.toSet());
//        Stack stack1 = stream.collect(Collectors.toCollection(Stack::new));
//        // 3. String
//        String str = stream.collect(Collectors.joining()).toString();
    }
}
