package sec03.exam07;

import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�� �׼��� �Է��Ͻÿ�");
		int a = s.nextInt();

		int b = a / 50000;
		a %= 50000;

		int c = a / 1000;
		a %= 1000;

		int d = a / 100;
		a %= 100;

		int e = a / 50;
		a %= 50;

		int f = a;

		System.out.println("�������� " + b + "��");
		System.out.println("õ���� " + c + "��");
		System.out.println("������� " + d + "��");
		System.out.println("���ʿ� ���� " + e + "��");
		System.out.println("�ʿ����� " + f + "��");

	}

}
