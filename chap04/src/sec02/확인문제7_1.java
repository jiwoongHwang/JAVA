package sec02;

import java.util.Scanner;

public class Ȯ�ι���7_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		int sum1 = 0;
		int sum2 = 0;

		while (run) {
			System.out.println("���ֽø������� �湮�� ȯ���մϴ�.");
			System.out.println("�۾��ڵ�� ������ �Է��� �ּ���.");
			System.out.println("(A�� ����,B�� �ݳ�,C�� �����Դϴ�.)");
			String code = s.next();
			char code1 = code.charAt(0);

			switch (code1) {
			case 'A':
				int code2 = Integer.parseInt(code.substring(1));
				System.out.println("å " + code2 + "�Ǵ���");
				sum1 += code2;
				break;
			case 'B':
				code2 = Integer.parseInt(code.substring(1));
				System.out.println("å" + code2 + "�ǹݳ�");
				sum2 += code2;
				break;
			default:
				System.out.println("����");
				System.out.println("�� " + sum1 + "�Ǵ���");
				System.out.println("�� " + sum2 + "�ǹݳ�");
				run = false;
			}
		}
	}

}
