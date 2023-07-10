package sec01;

import java.util.Scanner;

public class if연습6번 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("국어 : ");
		int num1 = s.nextInt();
		System.out.print("수학 : ");
		int num2 = s.nextInt();
		System.out.print("영어 : ");
		int num3 = s.nextInt();

		int sum = num1 + num2 + num3;

		if (num1 > 6 && num2 > 6 && num3 > 6 && sum >= 30) {
			System.out.println("합격입니다!");
		} else {
			System.out.println("불합격입니다!");
		}
	}

}
