package sec01;

import java.util.Scanner;

public class if����7�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("��ǰ ���� : ");
		int num1 = s.nextInt();

		int price = num1 * 7000;
		double price2 = num1 * 7000 * 0.9;
		
		if (num1 <8) {
			System.out.println("������ " + price +"�� �Դϴ�.");
		} else {
			System.out.println("������ " +(int) price2 + "�� �Դϴ�.");
		}
	}

}
