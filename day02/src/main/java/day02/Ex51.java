package day02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex51 {
    	public static void main(String[] args) {
		File file=new File("test04.txt");
		try(
				Writer fw=new FileWriter(file);
				PrintWriter pw=new PrintWriter(fw);
				){
			pw.println("문자열작성1");
			pw.println("문자열작성2");
			pw.println("문자열작성3");
			pw.println("문자열작성4");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
