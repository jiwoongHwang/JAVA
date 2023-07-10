package sec02;

import java.util.Scanner;

public class 확인문제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("사용자로부터 근로시간을 입력받으세요");
		int a = s.nextInt();
		
		int b = 9620;

		int c = (a>=10) ? (int) (a*b*1.2) : (a*b);
		System.out.println(c);
	}

}
