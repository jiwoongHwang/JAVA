package sec06;

import java.util.Scanner;

public class CarExample2 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner s = new Scanner(System.in);
		Car2 car = new Car2();

		while(run) {
			System.out.println("1 ���󺯰�, 2 �ӵ�����, 3 �ߴ�");
			int choice = s.nextInt();
			
			switch(choice) {
			case 1:
				car.setColor();
				break;
			case 2:
				car.setSpeed();
				break;
			case 3:
				run = false;
				break;
			default:
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			}
		
		
	}

}
