# AndroidJava8



1. Android Studio升级到2.2（canary channel）

2. gradle插件使用2.2.0及以上

3. 启用jack编译器

4. buildToolsVersion 23以及以前的编译工具版本中的jack是不支持java8的

5. Android 版本支持




    Android Gingebread (API 9)及以上:

        Lambda 表达式

        java.util.function 函数式接口

        方法引用

    Android N（API 24）及以上:

        默认和静态interface方法

        可重复的注解

        流(Streams)

        Java 8 对 IO/NIO 也做了一些改进

        支持新的 Unicode 6.2.0 标准，新增了日历和本地化的 API，改进了日期时间的管理等




6. 编译变化

    javac:

        javac (.java --> .class) --> dx (.class --> .dex)

    Jack:

       Jack (.java --> 通过jack --> .dex)
       aar、jar ->通过jill->.jack->通过jack -->dex
