package sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {


		OutputStream os = new FileOutputStream("C:/Temp/test2.txt");
		
		byte[] data = "ABC".getBytes();
		
		os.write(data);

		os.flush();
		os.close();
	}

}
