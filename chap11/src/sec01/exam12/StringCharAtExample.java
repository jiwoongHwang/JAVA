package sec01.exam12;

import java.util.Scanner;

public class StringCharAtExample {

	public static void main(String[] args) {
		String names[] = new String[2];
		String codes[] = new String[2];
		Scanner s = new Scanner(System.in);
		for (int i = 0; i <= 1; i++) {
			System.out.println("�̸��� �Է��ϼ���.");
			names[i] = s.next();
			System.out.println("�ڵ带 �Է��ϼ���.");
			codes[i] = s.next();
		}

		for (int i = 0; i <= 1; i++) {
			char grade = codes[i].charAt(0);
			String point = codes[i].substring(1, 3);
			int points = Integer.parseInt(point);
			double multiple = 1.0;

			if (grade == 'A') {
				multiple = 1.2;
			} else if (grade == 'B') {
				multiple = 1.1;
			} else if (grade == 'C') {
				multiple = 1.05;
			}
			double points2 = points * multiple;

			if (points2 >= 90) {
				System.out.println(names[i] + "���� �ֿ�� ����Դϴ�.");
			} else if (points2 >= 80) {
				System.out.println(names[i] + "���� ��� ����Դϴ�.");
			} else {
				System.out.println(names[i] + "���� �Ϲ� ����Դϴ�.");
			}
		}
	}

}
