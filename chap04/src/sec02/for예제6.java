package sec02;

import java.util.Scanner;

public class for예제6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("구구단 단수를 입력하세요");
		int a = s.nextInt();
		System.out.println("구구단 " + a + "단");
		int sum;

		for (int i = 1; i <= 9; i++) {
			sum = a * i;
			if (i <= 9) {
				System.out.println(a + "*" + i + "=" + sum);
			}
		}
	}
}
