package sec02;

import java.util.Scanner;

public class for예제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.println("1부터 " + a + "까지의 합계는 : " + sum + "입니다.");
	}

}
