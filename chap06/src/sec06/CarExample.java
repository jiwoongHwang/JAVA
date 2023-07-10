package sec06;

import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		boolean run = true;
		Scanner s = new Scanner(System.in);
		Car car = new Car();

		while(run) {
			System.out.println("1 색상변경, 2 속도변경, 3 중단");
			int choice = s.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("변경할 색상을 입력해 주세요.");
				String changeColor = s.next();
				car.setColor(changeColor);
				System.out.println("자동차 색상 :" + car.getColor());
				break;
			case 2:
				System.out.println("방향키를 눌러주세요 a는 속도증가, s는 속도감소");
				String key = s.next();
				car.setSpeed(key,10);
				System.out.println("현재 속도는 : " + car.getSpeed());
				break;
			case 3:
				run = false;
				break;
			}
			}
		
		
	}

}
