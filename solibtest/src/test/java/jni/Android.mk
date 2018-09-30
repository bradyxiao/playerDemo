LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := test
LOCAL_SRC_FILES := \
	E:\TencentWork\train\ijkPlayerDemo\solibtest\src\main\jni\main.cpp \

LOCAL_C_INCLUDES += E:\TencentWork\train\ijkPlayerDemo\solibtest\src\main\jni

include $(BUILD_SHARED_LIBRARY)
