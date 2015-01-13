LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := app
LOCAL_SRC_FILES := \
	/home/chris/Desktop/workspace/android1/app/src/main/jni/Android.mk \

LOCAL_C_INCLUDES += /home/chris/Desktop/workspace/android1/app/src/main/jni
LOCAL_C_INCLUDES += /home/chris/Desktop/workspace/android1/app/src/debug/jni

include $(BUILD_SHARED_LIBRARY)
