package sec01;

import java.util.Scanner;

public class ���ǹ�1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("0~100���� ���� �ϳ� �Է��ϼ���");
		int a = s.nextInt();

		if (a >= 90) {
			System.out.println("a�� ���� : " + a);
			System.out.println("a�� 90�̻��Դϴ�");
		} else if (a >= 80) {
			System.out.println("a�� ���� : " + a);
			System.out.println("a�� 80�̻��Դϴ�");
		} else if (a >= 70) {
			System.out.println("a�� ���� : " + a);
			System.out.println("a�� 70�̻��Դϴ�");
		} else {
			System.out.println("a�� ���� : " + a);
			System.out.println("a�� 70�̸��Դϴ�");
		}

	}

}
