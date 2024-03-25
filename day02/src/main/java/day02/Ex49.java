package day02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex49 {
    static File file=new File("test02.txt");
	public static void main(String[] args) {
		try(
				Writer fw=new FileWriter(file);
				BufferedWriter bw=new BufferedWriter(fw);
				){
			bw.write("문자열");
			bw.newLine();
			bw.write("두번째줄 문장");
			bw.newLine();
			bw.write("세번째줄 문장");
			System.out.println("작성완료");
		} catch (IOException e) {
					e.printStackTrace();
				}
	}
}
