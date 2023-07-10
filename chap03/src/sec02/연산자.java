package sec02;

import java.util.Scanner;

public class 연산자 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 100;
		System.out.println("숫자를 입력하세요");
		int a = s.nextInt();
		System.out.println("연산자를 입력하세요");
		String b = s.next();
		
		
		if (b.equals("+")) {
			num1 += a;
			System.out.println(num1);
		} else if (b.equals("-")) {
			num1 -= a;
			System.out.println(num1);
		} else if (b.equals("*")) {
			num1 *= a;
			System.out.println(num1);
		} else if (b.equals("/")) {
			num1 /= a;
			System.out.println(num1);
		} else if (b.equals("%")) {
			num1 %= a;
			System.out.println(num1);
		}  

	}
}
