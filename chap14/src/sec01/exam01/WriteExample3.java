package sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);
		String a = s.next();

		OutputStream os = new FileOutputStream("C:/Temp/name.txt");
		byte[] data = a.getBytes();
		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);
		}
		os.flush();
		os.close();
	}

}
