package sec01;

import java.util.Scanner;

public class 연산우선순위 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = s.nextInt();
		String sum = ((num1 + num2) >= 50) ? "통과" : "탈락";
		System.out.println(sum);
	}
}
