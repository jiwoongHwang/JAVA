package sec01.exam15;

import java.util.Scanner;

public class SubStringExample {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("����� �̸����� �Է��� �ּ���.");
		String email = s.next();
		
		int end = email.indexOf("@");
		String id = email.substring(0, end);
		System.out.println(id);
		
		int start = email.indexOf("@");
		int leng = email.length();
		String domain = email.substring(start+1, leng);
		System.out.println(domain);
	}

}
