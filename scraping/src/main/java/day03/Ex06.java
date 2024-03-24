package day03;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex06 extends Frame implements ActionListener {
	static TextArea ta;
	static TextField tf;
	static PrintStream ps;
	
	public Ex06() {
		setLayout(new BorderLayout());
		
		ta=new TextArea();
		tf=new TextField();
		tf.addActionListener(this);
		add(BorderLayout.CENTER,ta);
		add(BorderLayout.SOUTH,tf);
		
		setBounds(100,100,300,600);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();
		ps.println(msg);
		tf.setText("");
	}


	public static void main(String[] args) {
		Ex06 me=new Ex06();
		byte[] addr= {127,0,0,1};
		// byte[] addr= {(byte)192,(byte)168,20,25};
		int port=3000;
		
		java.net.Socket sock=null;
		try {
			sock=new Socket(InetAddress.getByAddress(addr),port);
			OutputStream os = sock.getOutputStream();
			InputStream is = sock.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			ps=new PrintStream(os);
			String msg=null;
			while((msg=br.readLine())!=null) {
				ta.setText(ta.getText()+msg+"\n");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sock!=null)sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
