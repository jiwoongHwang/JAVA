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
		System.out.println("�ڵ��� ������ �Է��� �ּ���");
		String changeColor = s.next();
		color = changeColor;
		System.out.println("�ڵ��� ���� : " +getColor());
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed() {
		System.out.println("a�ӵ����� s�ӵ�����");
		String key = s.next();
		System.out.println("�ӵ��� �Է��� �ּ���");
		int changeSpeed = s.nextInt();
		int presentSpeed = getSpeed();
		
		if (key.equals("s") && presentSpeed < changeSpeed ) {
			System.out.println("�ӵ��� ���̳ʽ��� �� �� �����ϴ�.");
		} else if (key.equals("s") && presentSpeed >= changeSpeed) {
			speed -= changeSpeed;
			System.out.println("����ӵ� : " + getSpeed());
		} else {
			speed += changeSpeed;
			System.out.println("����ӵ� : " + getSpeed());
		}
	}
	
	
	
	
}
