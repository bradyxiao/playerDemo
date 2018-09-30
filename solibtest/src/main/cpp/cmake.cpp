//
// Created by bradyxiao on 2018/8/14.
//

#include <jni.h>
#include <string>

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jint JNICALL Java_com_tencent_qcloud_solibtest_JNITest2_test2(JNIEnv *env, jobject obj, jint a, jint b) {
    return a + b;
}

JNIEXPORT jstring JNICALL Java_com_tencent_qcloud_solibtest_JNITest2_test1(
        JNIEnv *env,
        jobject obj,
        jstring input) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
    }

#ifdef __cplusplus
}
#endif

