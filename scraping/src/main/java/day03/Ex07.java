package day03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Ex07 extends Thread {
	Socket sock;
	static List<OutputStream> list=new ArrayList<>();
	
	public Ex07(Socket sock) {
		this.sock=sock;
	}
	
	@Override
	public void run() {
		try {
			InputStream is = sock.getInputStream();
			OutputStream os = sock.getOutputStream();
			list.add(os);
			while(true) {
				for(OutputStream os2:list)
					os2.write(is.read());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		try(
				ServerSocket serv=new ServerSocket(3000);
				) {
			
			while(true) {
				Socket sock=serv.accept();
				System.out.println(sock.getInetAddress().getHostAddress());
				Ex07 me=new Ex07(sock);
				me.start();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
