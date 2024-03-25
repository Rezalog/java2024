package day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex40 {
    	public static void main(String[] args) {

		File f=new File("Lec21.txt");
		byte[] arr=new byte[10];
		InputStream is;
		try {
			is=new FileInputStream(f);
			while(true) {
				int su=is.read(arr);
				if(su==-1)break;
				System.out.println(new String(arr));
			}
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
