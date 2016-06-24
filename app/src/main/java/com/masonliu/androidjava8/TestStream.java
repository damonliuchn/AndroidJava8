package com.masonliu.androidjava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 流的操作类型分为两种：
 * Intermediate：一个流可以后面跟随零个或多个 intermediate 操作。其目的主要是打开流，做出某种程度的数据映射/过滤，然后返回一个新的流，交给下一个操作使用。这类操作都是惰性化的（lazy），就是说，仅仅调用到这类方法，并没有真正开始流的遍历。
 * Terminal：一个流只能有一个 terminal 操作，当这个操作执行后，流就被使用“光”了，无法再被操作。所以这必定是流的最后一个操作。Terminal 操作的执行，才会真正开始流的遍历，并且会生成一个结果，或者一个 side effect。
 * 在对于一个 Stream 进行多次转换操作 (Intermediate 操作)，每次都对 Stream 的每个元素进行转换，而且是执行多次，这样时间复杂度就是 N（转换次数）个 for 循环里把所有操作都做掉的总和吗？其实不是这样的，转换操作都是 lazy 的，多个转换操作只会在 Terminal 操作的时候融合起来，一次循环完成。我们可以这样简单的理解，Stream 里有个操作函数的集合，每次转换操作就是把转换函数放入这个集合中，在 Terminal 操作的时候循环 Stream 对应的集合，然后对每个元素执行所有的函数。
 * <p>
 * <p>
 * 1 Stream 不是集合元素，它不是数据结构并不保存数据，它是有关算法和计算的，它更像一个高级版本的 Iterator。
 * 2 Stream 会隐式地在内部进行遍历
 * 3 Stream 可以并行化操作,使用并行去遍历时，数据会被分成多个段，其中每一个都在不同的线程中处理，然后将结果一起输出。
 * Created by liumeng on 16/6/21.
 */

public class TestStream {
    public static void test() {
        //清单 4. 构造流的几种常见方法
        // 1. Individual values
        Stream<String> stream = Stream.of("a", "b", "c");
        // 2. Arrays
        String[] strArray = new String[]{"a", "b", "c"};
        stream = Stream.of(strArray);
        stream = Arrays.stream(strArray);
        // 3. Collections
        List<String> list = Arrays.asList(strArray);
        stream = list.stream();

        //清单 5. 数值流的构造
        System.out.println("IntStream.of");
        IntStream.of(new int[]{1, 2, 3}).forEach(a -> System.out.println(a));
        //双冒号语法叫 方法引用, 可以理解为Lambda表达式的简写
        System.out.println("IntStream.range");
        IntStream.range(1, 3).forEach(System.out::println);
        System.out.println("IntStream.rangeClosed");
        IntStream.rangeClosed(1, 3).forEach(System.out::println);

        //清单 6. 流转换为其它数据结构
        // 1. Array
        String[] strArray1 = (String[]) stream.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int i) {
                return new String[i];
            }
        });
        Stream.of(strArray1).forEach(System.out::println);
//        String[] strArray1 = (String[]) stream.toArray(String[]::new);
//        Stream.of(strArray1).forEach(System.out::println);
//        // 2. Collection
//        List<String> list1 = (List<String>) stream.collect(Collectors.toList());
//        list1.stream().forEach(a -> System.out.println(a));
//        List<String> list2 = (List<String>) stream.collect(Collectors.toCollection(ArrayList::new));
//        Set set1 = (Set) stream.collect(Collectors.toSet());
//        Stack stack1 = (Stack) stream.collect(Collectors.toCollection(Stack::new));
//        // 3. String
//        String str = stream.collect(Collectors.joining()).toString();

        /**
         流的操作
         接下来，当把一个数据结构包装成 Stream 后，就要开始对里面的元素进行各类操作了。常见的操作可以归类如下。
         Intermediate：
         map (mapToInt, flatMap 等)、 filter、 distinct、 sorted、 peek、 limit、 skip、 parallel、 sequential、 unordered
         Terminal：
         forEach、 forEachOrdered、 toArray、 reduce、 collect、 min、 max、 count、 anyMatch、 allMatch、 noneMatch、 findFirst、 findAny、 iterator
         Short-circuiting：
         anyMatch、 allMatch、 noneMatch、 findFirst、 findAny、 limit
         */
        //清单 7. 转换大写
        Stream<String> stream2 = Stream.of("a", "b", "c");
        List<String> output = stream2.
                map(String::toUpperCase).
                collect(Collectors.toList());
        System.out.println("map(String::toUpperCase):");
        output.stream().forEach(System.out::println);
        //清单 8. 平方数
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);
        List<Integer> squareNums = nums.stream().
                map(n -> n * n).
                collect(Collectors.toList());
        System.out.println("SquareNums:");
        squareNums.stream().forEach(System.out::println);

        //清单 9. 一对多
        System.out.println("清单 9. 一对多");
        Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.
                flatMap((childList) -> childList.stream());//把stream合并
        outputStream.forEach(System.out::println);
        //清单 10. 留下偶数
        System.out.println("清单 10. 留下偶数");
        Integer[] evens = Stream.of(1, 2, 3, 4, 5, 6).
                filter(n -> n % 2 == 0).
                toArray(Integer[]::new);
        Arrays.stream(evens).forEach(System.out::println);
        //清单 11. 把单词挑出来
        System.out.println("清单 11. 把单词挑出来");
        List<String> output2 = Stream.of("Hello world", "i am ok").
                flatMap(line -> Arrays.stream(line.split(" "))).
                filter(word -> word.length() > 0).
                collect(Collectors.toList());
        output2.forEach(System.out::println);

    }
}
