package sec03;

import java.util.Calendar;

public class ����������2 {
	public static void main(String[] args) {
		Part today = null;

		Calendar cal = Calendar.getInstance();
		int part = cal.get(Calendar.MONTH) + 1;

		switch (part) {
		case 1:
		case 2:
		case 3:
			today = Part.�ϻ�б�;
			break;
		case 4:
		case 5:
		case 6:
			today = Part.�̻�б�;
			break;
		case 7:
		case 8:
		case 9:
			today = Part.���б�;
			break;
		default:
			today = Part.���б�;
		}
		System.out.println("������� " + today + " �Դϴ�.");
		/*
		 * if (part < 4) { today = Part.�ϻ�б�; System.out.println("������� " + today +
		 * " �Դϴ�."); } else if (part < 7) { today = Part.�̻�б�;
		 * System.out.println("������� " + today + " �Դϴ�."); } else if (part < 10) { today
		 * = Part.���б�; System.out.println("������� " + today + " �Դϴ�."); } else { today =
		 * Part.���б�; System.out.println("������� " + today + " �Դϴ�."); }
		 */

	}

}
