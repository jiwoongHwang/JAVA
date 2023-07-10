package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("출신학교를 입력하세요");
		String a = s.next();
		
		System.out.println("현재 몇학년 인가요 ?");
		int b = s.nextInt();
		
		char c = a.charAt(2);
		if (c == '중') {
			System.out.println("당신은 중학교 " + b + "학년 입니다.");
		} else {
			System.out.println("당신은 고등학교 " + b + "학년 입니다.");
		}
	}
}