package sec02;

import java.util.Scanner;

public class while����2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int a = s.nextInt();
		int i = 1;
		int sum = 0;
		while (i <= a) {
			sum += i;
			i++;
		}
		System.out.println("1~" + a + "��: " + sum);
	}

}
