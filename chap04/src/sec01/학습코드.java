package sec01;

import java.util.Scanner;

public class �н��ڵ� {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String code = s.next();
		String b = code.substring(0, 2);

		switch (b) {
		case "20":
			System.out.print("2020�⵵");
			break;
		case "22":
			System.out.print("2022�⵵");
			break;
		default:
			System.out.print("2023�⵵");
		}

		char c = code.charAt(2);

		switch (c) {
		case 'M':
			System.out.println(" ���а��� ��û���Դϴ�");
			break;
		case 'K':
			System.out.println(" ������� ��û���Դϴ�");
			break;
		default:
			System.out.println(" ������� ��û���Դϴ�");
		}
	}

}
