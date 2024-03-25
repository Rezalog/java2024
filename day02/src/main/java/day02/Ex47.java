package day02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex47 {
    	public static void main(String[] args) throws IOException {
		File file=new File("test04.txt");
		file.createNewFile();
		
			Writer fw=new FileWriter(file);
			fw.write("문자열을 한번에 작성");
			fw.flush();
	}
}
