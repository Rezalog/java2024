package day02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex45 {
    	public static void main(String[] args) {
		File target=new File("D:\\workspace\\10m.mp4");
		File copy=new File("copy10.mp4");
		byte[] buf=new byte[2];
		try(
				InputStream is=new FileInputStream(target);//22140ms,215ms,
				OutputStream os=new FileOutputStream(copy);
				
				BufferedInputStream bis=new BufferedInputStream(is);
				BufferedOutputStream bos=new BufferedOutputStream(os);
				){
			
			int cnt=-1;
			long before=System.currentTimeMillis();
			while((cnt=bis.read(buf))!=-1) {
				bos.write(buf,0,cnt);
			}
			long after=System.currentTimeMillis();
			System.out.println("카피완료 :"+(after-before)+"ms");
		} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}
