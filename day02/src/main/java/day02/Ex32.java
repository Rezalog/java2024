package day02;

import java.io.File;

public class Ex32 {
    	public static void main(String[] args) {
		File f=new File("./temp01");
		if(f.exists()) {
			System.out.println("존재함");
		}else {
			boolean boo=f.mkdirs();
			if(boo)System.out.println("생성");
		}
	}
}
