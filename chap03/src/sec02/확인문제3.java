package sec02;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("학생수?");
		int a = s.nextInt();
		System.out.println("한줄에 몇명씩 앉나요?");
		int b = s.nextInt();

		if ((a % b) == 0) {
			int c = a / b;
			int d = a % b;
			System.out.println("총" + c + "줄이고 남은 좌석수는 " + d + "개입니다");
		} else {
			int e = (a / b) + 1;
			int f = b - (a % b);
			System.out.println("총" + e + "줄이고 남은 좌석수는 " + f + "개입니다");
		}

	}

}
