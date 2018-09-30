package com.tencent.qcloud.solibtest;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.tencent.qcloud.solibtest.test", appContext.getPackageName());

        JNITest jniTest = new JNITest();
        Log.d("XIAO", jniTest.test1("this is a jni test"));

        Log.d("XIAO", "result=" + jniTest.test2(3, 4));

        JNITest2 jniTest2 = new JNITest2();
        Log.d("XIAO", "result=" + jniTest2.test2(5, 4));
        Log.d("XIAO", jniTest2.test1("this is a jni test"));


    }
}
