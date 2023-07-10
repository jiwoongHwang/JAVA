package sec03.exam07;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("돈 액수를 입력하시오");
		int a = s.nextInt();

		int b = a / 50000;
		a %= 50000;

		int c = a / 1000;
		a %= 1000;

		int d = a / 100;
		a %= 100;

		int e = a / 50;
		a %= 50;

		int f = a;

		System.out.println("오만원권 " + b + "장");
		System.out.println("천원권 " + c + "장");
		System.out.println("백원동전 " + d + "개");
		System.out.println("오십원 동전 " + e + "개");
		System.out.println("십원동전 " + f + "개");

	}

}
