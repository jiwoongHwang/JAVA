package sec03.exam03;

import java.util.Scanner;

public class ��������ϱ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int a = s.nextInt();

		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int b = s.nextInt();

		System.out.println("�����ȣ�� �Է��ϼ���");
		String c = s.next();
		char d = c.charAt(0);

		if (d == '*') {
			int result1 = a * b;
			System.out.println("�Է��Ͻ� ������ ����� " + result1 + "�Դϴ�.");
		} else {
			double result2 = (double) a / b;
			System.out.println("�Է��Ͻ� ������ ����� " + result2 + "�Դϴ�.");
		}

	}

}
