## JNI example
### windows c 컴파일 환경구성
- [wingw](https://sourceforge.net/projects/mingw-w64/files/Toolchains%20targetting%20Win64/Personal%20Builds/mingw-builds/8.1.0/threads-posix/seh/x86_64-8.1.0-release-posix-seh-rt_v6-rev0.7z/download) 다운후
- 압축해제
- bin path 설정
- gcc -version 확인
### vscode 확장
- C/C++ Extension Pack

### 실행코드
#### cmd
```cmd
javac -d bin src/one/JNIExample.java -h ./src/one

gcc -fpic -c -I "%JAVA_HOME%\include" -I "%JAVA_HOME%\include\win32" src/one/MyJNI.c

gcc -shared -o MyJNI.dll MyJNI.o

java -cp bin one.JNIExample

```

#### ps
```ps
javac -d bin src/one/JNIExample.java -h ./src/one

gcc -c -I "$env:JAVA_HOME/include" -I "$env:JAVA_HOME/include/win32" src/one/MyJNI.c

gcc -shared -o .\MyJNI.dll .\MyJNI.o

java -cp bin one.JNIExample

```