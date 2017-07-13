# AndroidJava8

1. Android Studio升级到3.0（canary channel）

2. android gradle plugin  使用3.0.0-alpha6及以上(会自动提示gradle version 是否需要升级)

3. buildToolsVersion 25

4. Android 版本支持


    Android Gingebread (API 9)及以上:

        Lambda 表达式、java.util.function 函数式接口

        方法引用
        
        类型注解

    Android N（API 24）及以上:

        默认和静态interface方法

        可重复的注解

        流(Streams)

        Java 8 对 IO/NIO 也做了一些改进

        支持新的 Unicode 6.2.0 标准，新增了日历和本地化的 API，改进了日期时间的管理等



5. 编译变化

    javac (.java --> .class) --> desugar (high class-->low class) --> dx (.class --> .dex)

    
https://developer.android.com/studio/preview/features/java8-support.html