package day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex48 {
    	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file=new File("test04.txt");
		char[] cbuf=new char[5];
		try(
				Reader fr=new FileReader(file);
				){
			while(true) {
				int cnt=fr.read(cbuf);
				if(cnt==-1)break;
				System.out.print(new String(cbuf,0,cnt));
			}
		}
	}
}
