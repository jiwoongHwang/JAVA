package sec02;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("숫자 2개를 입력하세요");
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println("연산자를 입력받으세요(+,-,*,/)");
		String c = s.next();

		int temp;
		int result;
		double result2;

		if (b > a) {
			temp = a;
			a = b;
			b = temp;
		}

		if (c.equals("+")) {
			result = a + b;
			System.out.println("두 수의 합계는 : " + result + "입니다");
		}
		if (c.equals("-")) {
			result = a - b;
			System.out.println("두 수의 합계는 : " + result + "입니다");
		}

		if (c.equals("*")) {
			result = a * b;
			System.out.println("두 수의 합계는 : " + result + "입니다");
		}
		if (c.equals("/")) {
			result2 = a / b;
			System.out.println("두 수의 합계는 : " + result2 + "입니다");
		}

	}
}
