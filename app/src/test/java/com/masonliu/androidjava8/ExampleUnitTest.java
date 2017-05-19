package com.masonliu.androidjava8;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testStream() throws Exception {
        TestStream.test();
    }

    @Test
    public void testLamda() throws Exception {
        TestLamda.test();
    }

    @Test
    public void testNewInterface() throws Exception {
        TestTypeAnnotation.test();
    }
}