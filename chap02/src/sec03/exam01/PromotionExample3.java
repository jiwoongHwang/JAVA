package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("����б��� �Է��ϼ���");
		String a = s.next();
		
		System.out.println("���� ���г� �ΰ��� ?");
		int b = s.nextInt();
		
		char c = a.charAt(2);
		if (c == '��') {
			System.out.println("����� ���б� " + b + "�г� �Դϴ�.");
		} else {
			System.out.println("����� ����б� " + b + "�г� �Դϴ�.");
		}
	}
}