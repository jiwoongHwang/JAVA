package sec04;

import java.util.Scanner;

public class TravelExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Travel trv = new Travel();
		
		trv.setOil(20);
		trv.setLocation("����");


		while (trv.isOilLeft()) {
			System.out.println("�����Ұ��� �Է��ϼ���");
			String location = s.next();
			
			if (location.equals("����")) {
				trv.minusOil(10);
				trv.setLocation("����");
				System.out.println("���� ��ġ��" + trv.getLocation() + "�Դϴ�.");
				
			} else if (location.equals("�λ�")) {
				trv.minusOil(5);
				trv.setLocation("�λ�");
				System.out.println("���� ��ġ��" + trv.getLocation() + "�Դϴ�.");
				
			} else {
				trv.minusOil(2);
				trv.setLocation("����");
				System.out.println("���� ��ġ��" + trv.getLocation() + "�Դϴ�.");
			}
		}

	}
}
