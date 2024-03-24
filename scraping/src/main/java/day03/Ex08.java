package day03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex08 extends Thread {
	Socket sock;
	
	public Ex08(Socket sock) {
		this.sock=sock;
	}
	
	@Override
	public void run() {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = sock.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			String msg=br.readLine(); //GET / HTTP/1.1
			String[] msgs=msg.split(" ");
			os = sock.getOutputStream();
			if(msgs[1].equals("/")) msgs[1]="/index.html";
			File f=new File("ROOT"+msgs[1]);
			if(f.exists()){
				os.write("HTTP/1.1 200 ok\n".getBytes());
			}else {
				f=new File("ROOT/err.html");
				os.write("HTTP/1.1 200 ok\n".getBytes());
			}
			InputStream is2=new FileInputStream(f);
			os.write("Content-Type:text/html; charset=utf-8\n".getBytes());
			os.write("\n".getBytes());
			int cnt=-1;
			while((cnt=is2.read())!=-1)
				os.write(cnt);
			os.flush();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(os!=null)os.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try(
				ServerSocket serv=new ServerSocket(8080);
				) {
			
			while(true) {
				Socket sock=serv.accept();
//				System.out.println(sock.getInetAddress().getHostAddress());
				Ex08 me=new Ex08(sock);
				me.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
