package sec02;

import java.util.Scanner;

public class Ȯ�ι���9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù ���� ��");
		String a = s.next();
		System.out.println("�� ��° ��");
		String b = s.next();

		double c = Double.parseDouble(a);
		double d = Double.parseDouble(b);
		double e = c/d;
		
		System.out.println("--------------------");
		if (d == 0 || d == 0.0) {
			System.out.println("��� : ���Ѵ�");
		} else 
		System.out.println("��� :" + e); 
		
		

	}

}
