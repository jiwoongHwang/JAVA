package sec03;

import java.util.Calendar;

public class ��¥��¿��� {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR);
		System.out.println(year + "�� " + month + "�� " + day + "�� " + hour + "�� �Դϴ�");
	}

}
