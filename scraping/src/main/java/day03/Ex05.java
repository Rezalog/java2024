package day03;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		java.net.ServerSocket serve=null;
		try {
			serve=new ServerSocket(3000);
			Socket sock = serve.accept();
			System.out.println("접속됨");
			System.out.println(sock.getInetAddress().getHostName());
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			PrintStream ps=new PrintStream(os);
			ps.println(Arrays.toString(sock.getInetAddress().getAddress())+"님 환영합니다");
			InputStreamReader isr=new InputStreamReader(is);
			int cnt=-1;
			while((cnt=isr.read())!=-1) {
				ps.print((char)cnt);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serve!=null)serve.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
