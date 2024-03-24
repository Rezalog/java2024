package one;

public class JNIExample {
	static {
		System.loadLibrary("MyJNI");
		// System.load("MyJNI.dll");
	}

	private native int getVersion();
	private native void helloWorld();
	private native String getMsg(String msg);

	public static void main(String[] args){
		JNIExample jni = new JNIExample();

		jni.helloWorld(); 

		System.out.println(jni.getVersion());
		System.out.println("receive: "+jni.getMsg("welcome"));
	}
}
