package sec01;

import java.util.Scanner;

public class if����3�� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		System.out.println("���� : " +score);

		
		if (score >= 50) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("������� ������.");
		}
	}

}
