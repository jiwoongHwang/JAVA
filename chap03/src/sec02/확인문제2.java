package sec02;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("����ڷκ��� �ٷνð��� �Է¹�������");
		int a = s.nextInt();
		
		int b = 9620;

		int c = (a>=10) ? (int) (a*b*1.2) : (a*b);
		System.out.println(c);
	}

}
