package sec02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("���� 2���� �Է��ϼ���");
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println("�����ڸ� �Է¹�������(+,-,*,/)");
		String c = s.next();

		int temp;
		int result;
		double result2;

		if (b > a) {
			temp = a;
			a = b;
			b = temp;
		}

		if (c.equals("+")) {
			result = a + b;
			System.out.println("�� ���� �հ�� : " + result + "�Դϴ�");
		}
		if (c.equals("-")) {
			result = a - b;
			System.out.println("�� ���� �հ�� : " + result + "�Դϴ�");
		}

		if (c.equals("*")) {
			result = a * b;
			System.out.println("�� ���� �հ�� : " + result + "�Դϴ�");
		}
		if (c.equals("/")) {
			result2 = a / b;
			System.out.println("�� ���� �հ�� : " + result2 + "�Դϴ�");
		}

	}
}
