package practiceprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter wr=new FileWriter("D:\\softwaretesting\\test.txt");
		BufferedWriter bw=new BufferedWriter(wr);
		bw.write("hello java and selenium");
		bw.write("hello java and selenium");
		bw.write("hello java and selenium");
		
		bw.write("hello java and selenium");
		System.out.println("done");
	}

}
