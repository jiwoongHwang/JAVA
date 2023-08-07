package sec01.exam01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CarExample {

	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		boolean run = true;
		
		while (run) {
			System.out.println("�۾� ������ �������ּ���");
			System.out.println("�߰��� 1��, ������ 2��, ����� 3��, ����� 4��");
			int number=0;
			try {
				number = s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				number = 4;
			}
			
			switch (number) {
			case 1:
				System.out.println("����ȸ��");
				String company = s.next();
				System.out.println("����");
				int cost = s.nextInt();
				System.out.println("�ְ�ӵ�");
				int maxSpeed = s.nextInt();
				System.out.println("����");
				String color = s.next();
				list.add(new Car(company, cost, maxSpeed, color));
				break;
				
			case 2:
				System.out.println("������ �������� �ε��� ��ȣ�� �Է��ϼ���.");
				int index = s.nextInt();
				list.remove(index);
				break;
				
			case 3:
				for(int i=0; i<list.size(); i++) {
					Car car = list.get(i);
					System.out.println(car.company + " " + car.cost + " " + car.maxSpeed + " " +car.color);
				}
				break;
			case 4:
				run = false;
				break;
				
			}
		}

	}

}
