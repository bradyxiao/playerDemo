package com.tencent.qcloud.solibtest;

/**
 * Created by bradyxiao on 2018/8/14.
 * Copyright 2010-2018 Tencent Cloud. All Rights Reserved.
 */

public class JNITest {
    public native String test1(String input);

    public native int test2(int a, int b);

    static {
        System.loadLibrary("test");
    }
}
