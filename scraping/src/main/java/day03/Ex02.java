package day03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

public class Ex02 {

	public static void main(String[] args) {
		File google =new File("daum.html");
		URLConnection conn=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		Writer fw=null;
		try {
			URL url=new URL("https://daum.net");
			conn=url.openConnection();
			is = conn.getInputStream();
			isr=new InputStreamReader(is,"UTF-8");
			br=new BufferedReader(isr);
			fw=new FileWriter(google, Charset.forName("UTF-8"));
			String msg=null;
			while((msg=br.readLine())!=null)
				fw.write(msg);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw!=null)fw.close();
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
