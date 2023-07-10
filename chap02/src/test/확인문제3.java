package test;

import java.util.Scanner;

public class 확인문제3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("첫번째 수:");
		String str1 = s.next();
		System.out.println("두번째 수:");
		String str2 = s.next();

		if (str1.equals(str2)) {
			System.out.println("두 수가 같아요");
		} else {
			System.out.println("두 수가 달라요");
		}

	}
}
