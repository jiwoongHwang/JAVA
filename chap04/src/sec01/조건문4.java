package sec01;

import java.util.Scanner;

public class ���ǹ�4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �ڵ带 �Է��� �ּ���");
		String code = s.next();
		char part = code.charAt(0);

		switch (part) {
		case 'A':
			System.out.print("�λ�� ");
			break;
		case 'B':
			System.out.print("��ȹ�� ");
			break;
		default:
			System.out.print("�ѹ��� ");
		}

		String code1 = code.substring(1, 3);

		switch (code1) {
		case "����":
			System.out.println("����� ���ʽ��ݾ��� 1000000�� �Դϴ�");
			break;
		case "����":
			System.out.println("����� ���ʽ��ݾ��� 700000�� �Դϴ�");
			break;
		default:
			System.out.println(" ����� ���ʽ��ݾ��� 500000�� �Դϴ�");
		}

	}

}
