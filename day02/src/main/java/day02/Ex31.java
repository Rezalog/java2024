package day02;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Ex31 {
    	public static void main(String[] args) {
		File file=new File(".\\");

		System.out.println("유무?"+file.exists());
		if(file.exists()) {
		System.out.println("dir?"+file.isDirectory());
		System.out.println("file?"+file.isFile());
		System.out.println("경로:"+file.getPath());
		System.out.println("위치:"+file.getParent());
		System.out.println("이름:"+file.getName());
		System.out.println("절대경로:"+file.getAbsolutePath());
		try {
			System.out.println("진짜절대:"+file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("r:"+file.canRead());
		System.out.println("w:"+file.canWrite());
		System.out.println("x:"+file.canExecute());
		System.out.println("size:"+file.length()+"byte");
		System.out.println(new Date(file.lastModified()));
		String[] arr=file.list();
		System.out.println(Arrays.toString(arr));
		}
	}

}
