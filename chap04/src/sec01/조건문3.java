package sec01;

import java.util.Scanner;

public class ���ǹ�3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� �ڵ带 �Է��� �ּ���");
		String code = s.next();
		char code1 = code.charAt(0);

		switch (code1) {
			case 'A':
			case 'a':
				System.out.println("�λ�ο� �����Ǽ̽��ϴ�");
				break;
			case 'B':
			case 'b':
				System.out.println("��ȹ�ο� �����Ǽ̽��ϴ�");
				break;
			default:
				System.out.println("�ѹ��ο� �����Ǽ̽��ϴ�.");
		}

	}

}
