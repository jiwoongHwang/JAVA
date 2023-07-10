package sec02;

import java.util.Scanner;

public class for예제5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수입력 1: ");
		int a = s.nextInt();
		System.out.print("정수입력 2: ");
		int b = s.nextInt();

		int large = 0;
		int small = 0;

		if (a > b) {
			large = a;
			small = b;
		} else {
			large = b;
			small = a;
		}
		
		int sum = 0;
		for (int i = small; i <= large; i++) {
			sum = sum + i;
			if (i == large) {
				System.out.print(i + "=" + sum);
			} else {
				System.out.print(i + "+");
			}
		}

	}

}
