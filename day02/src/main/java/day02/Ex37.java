package day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex37 {
    	public static void main(String[] args) {
		//109,178 바이트
		File target=new File("test11.jpg");
		//109,180 바이트
		File result=new File("copy.jpg");
		byte[] buf=new byte[10];
		InputStream is;
		OutputStream os;
		
			try {
				if(!result.exists())
					result.createNewFile();
				is=new FileInputStream(target);
				os=new FileOutputStream(result);
				while(true) {
					int su=is.read(buf);
					if(su==-1)break;
					os.write(buf,0,su);
				}
				os.close();
				is.close();
				System.out.println("복사완료");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
