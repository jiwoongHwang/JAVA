package sec02;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num1 = 100;
		System.out.println("���ڸ� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		String b = s.next();
		
		
		if (b.equals("+")) {
			num1 += a;
			System.out.println(num1);
		} else if (b.equals("-")) {
			num1 -= a;
			System.out.println(num1);
		} else if (b.equals("*")) {
			num1 *= a;
			System.out.println(num1);
		} else if (b.equals("/")) {
			num1 /= a;
			System.out.println(num1);
		} else if (b.equals("%")) {
			num1 %= a;
			System.out.println(num1);
		}  

	}
}
