package sec01.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) throws  UnsupportedEncodingException{
		String str="�ȳ��ϼ���";
		byte[] byte1 = str.getBytes();
		System.out.println(byte1.length);
		
		byte[] byte2 = str.getBytes("UTF-8");
		System.out.println(byte2.length);
	}

}
