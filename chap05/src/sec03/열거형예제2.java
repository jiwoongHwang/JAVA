package sec03;

import java.util.Calendar;

public class 열거형예제2 {
	public static void main(String[] args) {
		Part today = null;

		Calendar cal = Calendar.getInstance();
		int part = cal.get(Calendar.MONTH) + 1;

		switch (part) {
		case 1:
		case 2:
		case 3:
			today = Part.일사분기;
			break;
		case 4:
		case 5:
		case 6:
			today = Part.이사분기;
			break;
		case 7:
		case 8:
		case 9:
			today = Part.삼사분기;
			break;
		default:
			today = Part.사사분기;
		}
		System.out.println("현재월은 " + today + " 입니다.");
		/*
		 * if (part < 4) { today = Part.일사분기; System.out.println("현재월은 " + today +
		 * " 입니다."); } else if (part < 7) { today = Part.이사분기;
		 * System.out.println("현재월은 " + today + " 입니다."); } else if (part < 10) { today
		 * = Part.삼사분기; System.out.println("현재월은 " + today + " 입니다."); } else { today =
		 * Part.사사분기; System.out.println("현재월은 " + today + " 입니다."); }
		 */

	}

}
