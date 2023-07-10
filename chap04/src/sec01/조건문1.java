package sec01;

import java.util.Scanner;

public class 조건문1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("0~100까지 숫자 하나 입력하세요");
		int a = s.nextInt();

		if (a >= 90) {
			System.out.println("a의 값은 : " + a);
			System.out.println("a는 90이상입니다");
		} else if (a >= 80) {
			System.out.println("a의 값은 : " + a);
			System.out.println("a는 80이상입니다");
		} else if (a >= 70) {
			System.out.println("a의 값은 : " + a);
			System.out.println("a는 70이상입니다");
		} else {
			System.out.println("a의 값은 : " + a);
			System.out.println("a는 70미만입니다");
		}

	}

}
