package sec02;

import java.util.Scanner;

public class while예제2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a = s.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= a) {
			sum += i;
			i++;
		}
		System.out.println("1~" + a + "합: " + sum);
	}

}
