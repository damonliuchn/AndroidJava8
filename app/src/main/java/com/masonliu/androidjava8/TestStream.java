package com.masonliu.androidjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1 Stream 会隐式地在内部进行遍历
 * 2 Stream 可以并行化操作,使用并行去遍历时，数据会被分成多个段，其中每一个都在不同的线程中处理，然后将结果一起输出。
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

        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        System.out.println("IntStream.of");
        IntStream.range(1, 3).forEach(System.out::println);
        System.out.println("IntStream.range");
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
    }
}
