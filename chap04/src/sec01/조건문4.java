package sec01;

import java.util.Scanner;

public class 조건문4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("직원 코드를 입력해 주세요");
		String code = s.next();
		char part = code.charAt(0);

		switch (part) {
		case 'A':
			System.out.print("인사부 ");
			break;
		case 'B':
			System.out.print("기획부 ");
			break;
		default:
			System.out.print("총무부 ");
		}

		String code1 = code.substring(1, 3);

		switch (code1) {
		case "부장":
			System.out.println("부장님 보너스금액은 1000000원 입니다");
			break;
		case "과장":
			System.out.println("과장님 보너스금액은 700000원 입니다");
			break;
		default:
			System.out.println(" 차장님 보너스금액은 500000원 입니다");
		}

	}

}
