package sec02;

import java.util.Scanner;

public class Ȯ�ι���7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int balance = 500000000;
		int deposit, withdraw;
		boolean run = true;

		while (run) {
			System.out.println("�������࿡ �湮�Ͻ� ���� ȯ���մϴ�.");
			System.out.println("������ 1��, ����� 2��, �ܰ�Ȯ���� 3��, ����� 4���Դϴ�.");
			System.out.println("-------------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("-------------------------------------");
			System.out.print("����> ");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("�Ա� �ݾ��� ���Դϱ�?");
				deposit = s.nextInt();
				balance += deposit;
				System.out.println("���� �ܾ��� " + balance + "�Դϴ�.");
				break;
			case 2:
				System.out.println("��� �ݾ��� ���Դϱ�?");
				withdraw = s.nextInt();
				if (balance < withdraw) {
					System.out.println("���� �ܾ��� �����մϴ�.");
				} else {
					balance -= withdraw;
					System.out.println("���� �ܾ��� " + balance + "�Դϴ�.");
				}
				break;
			case 3:
				System.out.println("������ ���� �ܾ���" + balance + "���Դϴ�.");
				break;
			default:
				System.out.println("�ȳ��� ���ʽÿ�.");
				run = false;
			}
		}

	}
}
