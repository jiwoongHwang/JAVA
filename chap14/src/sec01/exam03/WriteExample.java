package sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		System.out.println("당신의 주소는?");
		OutputStream os = new FileOutputStream("C:/Temp/address.txt");
		String str = s.nextLine();
		byte[] data = str.getBytes();

		os.write(data, 5, 4);

		os.flush();
		os.close();
	}

}
