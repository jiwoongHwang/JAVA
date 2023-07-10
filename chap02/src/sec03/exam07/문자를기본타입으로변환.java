package sec03.exam07;

import java.util.Scanner;

public class 문자를기본타입으로변환 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		  System.out.print("첫 번째 숫자를 입력하세요: ");
	        String str1 = s.next();
	        int a = Integer.parseInt(str1);

	        System.out.print("두 번째 숫자를 입력하세요: ");
	        String str2 = s.next();
	        int b = Integer.parseInt(str2);

	        int sum = a + b;
	        System.out.println("두 수의 합계는" + sum + "입니다.");
	}

}