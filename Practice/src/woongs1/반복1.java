package woongs1;

import java.util.Scanner;

public class 반복1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		System.out.print("정수를 입력하시오 >> ");
		num = s.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
