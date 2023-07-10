package sec02;

import java.util.Scanner;

public class 연산자2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("x의 초기값을 입력해 주세요");
		int x = s.nextInt();
		System.out.println("y의 초기값을 입력해 주세요");
		int y = s.nextInt();
		System.out.println("증감 기호를 입력해주세요(+,-)");
		String z = s.next();

		if (z.equals("+")) {
			x = ++x;
			System.out.println(x);
		} else {
			y = --y;
			System.out.println(y);
		}

	}

}
