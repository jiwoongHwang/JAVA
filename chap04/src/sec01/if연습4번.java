package sec01;

import java.util.Scanner;

public class if연습4번 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num = s.nextInt();
		
		if (num % 2 ==0 && num % 5 == 0 && num != 0) {
			System.out.println("2와 5의 배수입니다.");
		} else {
			System.out.println("2와 5의 배수가 아닙니다.");
		}
	}

}
