package sec02;

import java.util.Scanner;

public class ���輺�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�߰���� ������ �Է��� �ּ���");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������ �Է��� �ּ���");
		int last = s.nextInt();
		
		if (mid >= 80 || last >=80) {
			System.out.println("���");
		} else
			System.out.println("Ż��");
	
		
/*		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("���� ��й�ȣ�� �Է��� �ּ���");
		String pass = s.next();

		char a = pass.charAt(0);
		char b = pass.charAt(1);

		if ((a >= 97) && (a <= 122) && (b >= 48) && (b <= 57)) {

			System.out.println(name + "�� ȯ���մϴ�");
		} else
			System.out.println("��й�ȣ�� ���� �ҹ��ڿ� ������ �����Դϴ�.");*/
	}
}
