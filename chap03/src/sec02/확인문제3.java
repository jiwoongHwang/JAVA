package sec02;

import java.util.Scanner;

public class Ȯ�ι���3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("�л���?");
		int a = s.nextInt();
		System.out.println("���ٿ� ��� �ɳ���?");
		int b = s.nextInt();

		if ((a % b) == 0) {
			int c = a / b;
			int d = a % b;
			System.out.println("��" + c + "���̰� ���� �¼����� " + d + "���Դϴ�");
		} else {
			int e = (a / b) + 1;
			int f = b - (a % b);
			System.out.println("��" + e + "���̰� ���� �¼����� " + f + "���Դϴ�");
		}

	}

}
