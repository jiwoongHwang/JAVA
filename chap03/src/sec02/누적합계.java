package sec02;

import java.util.Scanner;

public class 누적합계 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요(1~20사이)");
		int a = s.nextInt();
		System.out.println("두번째 수를 입력하세요(1~20사이)");
		int b = s.nextInt();
		int result = 0;
		
		while(true) {
			if (a<=b) {
				result += a;
				a++;
			} else {
				break;
			}
		}
		System.out.println("두 수의 누적 합계는 : " + result);
	}

}

