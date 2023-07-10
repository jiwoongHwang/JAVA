package sec01;

import java.util.Scanner;

public class SwitchDiceExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("수험번호를 입력하세요.");
		String str = s.nextLine();
		char c = str.charAt(6);

		switch (c) {
		case 'A':
			System.out.println("201호 입니다.");
			break;
		case 'B':
			System.out.println("202호 입니다.");
			break;
		default:
			System.out.println("203호 입니다.");
		}

	}
}
