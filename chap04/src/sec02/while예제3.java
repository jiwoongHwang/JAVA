package sec02;

import java.util.Scanner;

public class while����3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int userNum;
		int comNum = (int) (Math.random() * 20) + 1;

		while (true) {
			System.out.print("���� �ϳ��� �Է��ϼ���(1~20)");
			userNum = s.nextInt();
			if (userNum == comNum) {
				System.out.println("�����Դϴ�.");
				break;
			} else if (userNum > comNum) {
				System.out.println("���������Դϴ�.");
			} else {
				System.out.println("���� �����Դϴ�.");
			}
		}
	}
}
