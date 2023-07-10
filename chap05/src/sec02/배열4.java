package sec02;

import java.util.Scanner;

public class 배열4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("배열 갯수를 입력해주세요");
		int arraynum = s.nextInt();
		int[] num1 = new int[arraynum];

		for (int i = 0; i < arraynum; i++) {
			num1[i] = i + 1;
		}

		int sum = 0;
		double avg = 0;
		for (int j = 0; j < arraynum; j++) {
			sum += num1[j];
			avg = (double) sum / arraynum;
		}
		System.out.println("평균값은 : " + avg + "입니다.");
	}
}
