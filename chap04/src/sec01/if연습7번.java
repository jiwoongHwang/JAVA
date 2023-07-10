package sec01;

import java.util.Scanner;

public class if연습7번 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("상품 수량 : ");
		int num1 = s.nextInt();

		int price = num1 * 7000;
		double price2 = num1 * 7000 * 0.9;
		
		if (num1 <8) {
			System.out.println("가격은 " + price +"원 입니다.");
		} else {
			System.out.println("가격은 " +(int) price2 + "원 입니다.");
		}
	}

}
