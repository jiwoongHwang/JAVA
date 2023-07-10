package sec02;

import java.util.Scanner;

public class 확인문제9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫 번쨰 수");
		String a = s.next();
		System.out.println("두 번째 수");
		String b = s.next();

		double c = Double.parseDouble(a);
		double d = Double.parseDouble(b);
		double e = c/d;
		
		System.out.println("--------------------");
		if (d == 0 || d == 0.0) {
			System.out.println("결과 : 무한대");
		} else 
		System.out.println("결과 :" + e); 
		
		

	}

}
