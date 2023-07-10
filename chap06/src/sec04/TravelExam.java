package sec04;

import java.util.Scanner;

public class TravelExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Travel trv = new Travel();
		
		trv.setOil(20);
		trv.setLocation("광주");


		while (trv.isOilLeft()) {
			System.out.println("여행할곳을 입력하세요");
			String location = s.next();
			
			if (location.equals("서울")) {
				trv.minusOil(10);
				trv.setLocation("서울");
				System.out.println("현재 위치는" + trv.getLocation() + "입니다.");
				
			} else if (location.equals("부산")) {
				trv.minusOil(5);
				trv.setLocation("부산");
				System.out.println("현재 위치는" + trv.getLocation() + "입니다.");
				
			} else {
				trv.minusOil(2);
				trv.setLocation("여수");
				System.out.println("현재 위치는" + trv.getLocation() + "입니다.");
			}
		}

	}
}
