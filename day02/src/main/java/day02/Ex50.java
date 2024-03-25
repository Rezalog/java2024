package day02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex50 {
    	public static void main(String[] args) {
		try(
				Reader fr=new FileReader(Ex49.file);
				BufferedReader br=new BufferedReader(fr);
				){
			String msg=null;
			while((msg=br.readLine())!=null){
				System.out.println(msg);
			}
			
			
		} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	}
}
