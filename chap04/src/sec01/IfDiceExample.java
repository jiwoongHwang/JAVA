package sec01;

import java.util.Scanner;

public class IfDiceExample {

	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 6) + 1;
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���(1~6)");
		int num2 = s.nextInt();
		
		System.out.println("��ǻ�� �� : " + num1);
		System.out.println("����� �� : " + num2);
		if (num1 == num2) {
			System.out.println("�� ���� �����ϴ�.");
		} else if (num1 > 2) {
			System.out.println("��ǻ�� ���� �� Ů�ϴ�.");
		} else {
			System.out.println("����� ���� �� Ů�ϴ�.");
		}
	}
}
