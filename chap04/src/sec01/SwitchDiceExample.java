package sec01;

import java.util.Scanner;

public class SwitchDiceExample {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�����ȣ�� �Է��ϼ���.");
		String str = s.nextLine();
		char c = str.charAt(6);

		switch (c) {
		case 'A':
			System.out.println("201ȣ �Դϴ�.");
			break;
		case 'B':
			System.out.println("202ȣ �Դϴ�.");
			break;
		default:
			System.out.println("203ȣ �Դϴ�.");
		}

	}
}
