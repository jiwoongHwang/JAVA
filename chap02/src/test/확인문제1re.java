package test;

import java.util.Scanner;

public class 확인문제1re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("당신의 이름은?");
		String name = s.next();
		System.out.println("중간고사 점수는?");
		double mid = s.nextDouble();
		System.out.println("기말고사 점수는?");
		double last = s.nextDouble();
		System.out.println("리포트 점수는?");
		double report = s.nextDouble();

		double avg = (mid + last + report) / 3;

		System.out.printf("%s님의 평균 점수는 : %10.2f 입니다", name, avg);
	}

}
