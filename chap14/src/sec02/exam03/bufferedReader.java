package sec02.exam03;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class bufferedReader {

	public static void main(String[] args) throws Exception {
		
		Scanner s = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("c:/temp/phone.txt");
		Writer w = new OutputStreamWriter(fos);
		
		while(true) {
			System.out.println("전화번호를 입력해 주세요");
			String num = s.nextLine();
			if(num.equals("그만")) break;
			w.write(num+"\n");
		}
		w.flush();
		w.close();
		  Reader reader = new FileReader("c:/temp/phone.txt");
		  BufferedReader br = new BufferedReader(reader);
		  
		  while(true) {
			  String data = br.readLine();
			  if(data==null) break;
			  System.out.println(data);
		  }
		  br.close();
		  
	}
}
