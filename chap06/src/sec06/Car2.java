package sec06;

import java.util.Scanner;

public class Car2 {
	Scanner s = new Scanner(System.in);
	
	private String name;
	private String company;
	private String color;
	private int speed=50;
	
	public String getColor() {
		return color;
	}
	public void setColor() {
		System.out.println("자동차 색상을 입력해 주세요");
		String changeColor = s.next();
		color = changeColor;
		System.out.println("자동차 색상 : " +getColor());
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed() {
		System.out.println("a속도증가 s속도감소");
		String key = s.next();
		System.out.println("속도를 입력해 주세요");
		int changeSpeed = s.nextInt();
		int presentSpeed = getSpeed();
		
		if (key.equals("s") && presentSpeed < changeSpeed ) {
			System.out.println("속도는 마이너스가 될 수 없습니다.");
		} else if (key.equals("s") && presentSpeed >= changeSpeed) {
			speed -= changeSpeed;
			System.out.println("현재속도 : " + getSpeed());
		} else {
			speed += changeSpeed;
			System.out.println("현재속도 : " + getSpeed());
		}
	}
	
	
	
	
}
