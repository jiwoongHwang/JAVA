package sec06;

public class Car {
	private String name;
	private String company;
	private String color;
	private int speed = 50;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(String key, int speed) {
		int presentSpeed = getSpeed();
		if (key.equals("s") && presentSpeed ==0 ) {
			System.out.println("���� �ӵ��� 0 �Դϴ�.");
		} else if (key.equals("s") && presentSpeed != 0) {
			this.speed -= speed;
		} else {
			this.speed += speed;
		}
	}
	
	
	
	
}
