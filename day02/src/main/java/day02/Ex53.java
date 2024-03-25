package day02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex53 {
    	public static void main(String[] args) {
		File file=new File("test05.txt");
		try(
				OutputStream os=new FileOutputStream(file);
				OutputStreamWriter osw=new OutputStreamWriter(os);
				BufferedWriter bw=new BufferedWriter(osw);
				){
			bw.write("1줄");
			bw.newLine();
			bw.write("2줄");
			bw.newLine();
			bw.write("3줄");
			bw.newLine();
			bw.write("4줄");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
