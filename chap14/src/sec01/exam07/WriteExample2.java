package sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		Writer writer = new FileWriter("c:/temp/address2.txt");
		
		String str = s.nextLine();
		
		writer.write(str,6,2);
		
		writer.flush();
		writer.close();
		
	}

}
