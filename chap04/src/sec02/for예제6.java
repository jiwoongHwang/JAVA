package sec02;

import java.util.Scanner;

public class for����6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ �ܼ��� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("������ " + a + "��");
		int sum;

		for (int i = 1; i <= 9; i++) {
			sum = a * i;
			if (i <= 9) {
				System.out.println(a + "*" + i + "=" + sum);
			}
		}
	}
}
