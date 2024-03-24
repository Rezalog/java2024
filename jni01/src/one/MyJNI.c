#include "one_JNIExample.h"
#include <stdio.h>
#include <jni.h>
#include <string.h>

/*
 * Class:     JNIExample
 * Method:    HelloWorld
 * Signature: ()V
 */

JNIEXPORT jint JNICALL  Java_one_JNIExample_getVersion
  (JNIEnv * a, jobject b) {
    return 17;
}

JNIEXPORT void JNICALL Java_one_JNIExample_helloWorld
  (JNIEnv * a, jobject b) {
    printf("Hello World\n");
}

JNIEXPORT jstring JNICALL Java_one_JNIExample_getMsg
  (JNIEnv * a, jobject b, jstring c) {
    char strbuf[128];
      const char *sz = (*a)-> GetStringUTFChars(a,c,0);
      strcpy(strbuf,sz);
    printf("send: %s\n", strbuf);
    (*a)->ReleaseStringUTFChars(a,c,sz);
    return c;
}