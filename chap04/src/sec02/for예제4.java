package sec02;

import java.util.Scanner;

public class for예제4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수입력 1: ");
		int a = s.nextInt();
		System.out.print("정수입력 2: ");
		int b = s.nextInt();

		int temp;

		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}

}
