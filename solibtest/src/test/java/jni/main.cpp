//
// Created by bradyxiao on 2018/8/14.
//
#include "com_tencent_qcloud_solibtest_JNITest.h"
#include <string.h>

JNIEXPORT jstring JNICALL Java_com_tencent_qcloud_solibtest_JNITest_test1
  (JNIEnv * env, jobject obj, jstring string){
    const char *str = env->GetStringUTFChars(string, 0);
    char cap[128];
    strcpy(cap, str);
    env->ReleaseStringUTFChars(string, str);
    return env->NewStringUTF(cap);
  }

JNIEXPORT jint JNICALL Java_com_tencent_qcloud_solibtest_JNITest_test2
  (JNIEnv *env, jobject obj, jint a, jint b){

    return a+b;
  }
