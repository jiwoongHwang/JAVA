package sec06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		boolean run = true;
		Scanner s = new Scanner(System.in);
		Car car = new Car();

		while(run) {
			System.out.println("1 ���󺯰�, 2 �ӵ�����, 3 �ߴ�");
			int choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("������ ������ �Է��� �ּ���.");
				String changeColor = s.next();
				car.setColor(changeColor);
				System.out.println("�ڵ��� ���� :" + car.getColor());
				break;
			case 2:
				System.out.println("����Ű�� �����ּ��� a�� �ӵ�����, s�� �ӵ�����");
				String key = s.next();
				car.setSpeed(key,10);
				System.out.println("���� �ӵ��� : " + car.getSpeed());
				break;
			case 3:
				run = false;
				break;
			}
			}
		
		
	}

}
