package sec02;

import java.util.Scanner;

public class 확인문제7_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		int sum1 = 0;
		int sum2 = 0;

		while (run) {
			System.out.println("광주시립도서관 방문을 환영합니다.");
			System.out.println("작업코드와 개수를 입력해 주세요.");
			System.out.println("(A는 대출,B는 반납,C는 종료입니다.)");
			String code = s.next();
			char code1 = code.charAt(0);

			switch (code1) {
			case 'A':
				int code2 = Integer.parseInt(code.substring(1));
				System.out.println("책 " + code2 + "권대출");
				sum1 += code2;
				break;
			case 'B':
				code2 = Integer.parseInt(code.substring(1));
				System.out.println("책" + code2 + "권반납");
				sum2 += code2;
				break;
			default:
				System.out.println("종료");
				System.out.println("총 " + sum1 + "권대출");
				System.out.println("총 " + sum2 + "권반납");
				run = false;
			}
		}
	}

}
