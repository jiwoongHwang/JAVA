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
			System.out.println("작업 내용을 선택해주세요");
			System.out.println("추가는 1번, 삭제는 2번, 출력은 3번, 종료는 4번");
			int number=0;
			try {
				number = s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력 하셨습니다.");
				number = 4;
			}
			
			switch (number) {
			case 1:
				System.out.println("차량회사");
				String company = s.next();
				System.out.println("가격");
				int cost = s.nextInt();
				System.out.println("최고속도");
				int maxSpeed = s.nextInt();
				System.out.println("색상");
				String color = s.next();
				list.add(new Car(company, cost, maxSpeed, color));
				break;
				
			case 2:
				System.out.println("삭제한 데이터의 인덱스 번호를 입력하세요.");
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
