package day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex36 {
    	public static void main(String[] args) {
		File f=new File("test01.bin");
		InputStream is;
		if(f.exists()) {
			try {
				is=new FileInputStream(f);
				int su=-1;
//				System.out.println(is.read());
//				System.out.println(is.read());
//				System.out.println(is.read());
//				System.out.println(is.read());
//				System.out.println(is.read());
				while(true) {
					su=is.read();
					if(su==-1)break;
					System.out.println(su);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
