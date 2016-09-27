//
// Created by liuzhenhui on 2016/9/27.
//

#include "com_lzh_ndkdemo_jni_JniUtil.h"

JNIEXPORT jstring JNICALL Java_com_lzh_ndkdemo_jni_JniUtil_test(JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "jni调用成功");
}