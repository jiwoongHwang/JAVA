package sec01;

import java.util.Scanner;

public class IfDiceExample {

	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 6) + 1;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(1~6)");
		int num2 = s.nextInt();
		
		System.out.println("컴퓨터 수 : " + num1);
		System.out.println("사용자 수 : " + num2);
		if (num1 == num2) {
			System.out.println("두 수가 같습니다.");
		} else if (num1 > 2) {
			System.out.println("컴퓨터 수가 더 큽니다.");
		} else {
			System.out.println("사용자 수가 더 큽니다.");
		}
	}
}
