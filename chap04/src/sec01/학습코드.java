package sec01;

import java.util.Scanner;

public class 학습코드 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String code = s.next();
		String b = code.substring(0, 2);

		switch (b) {
		case "20":
			System.out.print("2020년도");
			break;
		case "22":
			System.out.print("2022년도");
			break;
		default:
			System.out.print("2023년도");
		}

		char c = code.charAt(2);

		switch (c) {
		case 'M':
			System.out.println(" 수학과목 신청자입니다");
			break;
		case 'K':
			System.out.println(" 국어과목 신청자입니다");
			break;
		default:
			System.out.println(" 영어과목 신청자입니다");
		}
	}

}
