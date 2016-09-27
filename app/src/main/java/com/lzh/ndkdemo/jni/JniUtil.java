package com.lzh.ndkdemo.jni;

/**
 * Created by liuzhenhui on 2016/9/27.
 */
public class JniUtil {
    public static final String TAG = JniUtil.class.getSimpleName();

    static {
        System.loadLibrary("jniutil");
    }

    public native String test();
}
