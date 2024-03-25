package day02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex52 {
    	public static void main(String[] args) {
		File file=new File("test04.txt");
		
		
		try(
			InputStream is=new FileInputStream(file);
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
				){
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
