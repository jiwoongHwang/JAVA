package sec03.practice;

import java.util.Scanner;

public class �����ձ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String startword = "�ƹ���";
		int i;

		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�?");
		int num = s.nextInt();

		boolean run = true;
		while (run) {
			for (i = 1; i <= num; i++) {
				System.out.print("�������� �̸��� �Է��ϼ���.");
				String name = s.next();
			}
			System.out.println("�����ϴ� �ܾ�� " + startword + "�Դϴ�.");
			char laststartword = startword.charAt(2);

			System.out.print("ȫ����>>");
			String word = s.next();
			char firstword = word.charAt(0);
			firstword = laststartword;
			int num2 = word.length();
			char lastword = word.charAt(num2 - 1);

			System.out.println("ȫ�浿>>");
			String word2 = s.next();
			char firstword2 = word2.charAt(0);
			lastword = firstword2;
			int num3 = word2.length();
			char lastword2 = word2.charAt(num3 - 1);

			if (lastword == firstword2) {
				run = true;
			} else if (lastword2 == firstword) {
				run = true;
			} else if (lastword != firstword2) {
				System.out.println("�浿�� �߸�");
				run = false;
				break;
			} else {
				System.out.println("���� �߸�");
				run = false;
				break;
			}
		}
	}

}
