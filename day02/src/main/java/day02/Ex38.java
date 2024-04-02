package day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class Ex38 {
    	public static void main(String[] args) {
		String msg="한글";
		byte[] arr=msg.getBytes();
		System.out.println(msg.length());
		System.out.println(arr.length);
		InputStream is=System.in;
		OutputStream os=System.out;
		int su=-1;
		// 13==\r
		// 10==\n
		try {
			is=new FileInputStream("test2.txt");
//			os=new FileOutputStream("test2.txt");
//			for(int i=0; i<arr.length; i++) {
//			os.write(arr[i]);
//			}
			byte[] arr2=new byte[arr.length];
			int cnt=0;
			while((su=is.read())!=-1) {
				arr2[cnt++]=(byte) su;
			}
			System.out.println(new String(arr2));
//			while(true) {
//				su=is.read();
//				if(su==-1) {break;}
//				os.write(su);
//			}
			is.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
