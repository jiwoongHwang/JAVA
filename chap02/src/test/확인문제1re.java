package test;

import java.util.Scanner;

public class Ȯ�ι���1re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("����� �̸���?");
		String name = s.next();
		System.out.println("�߰���� ������?");
		double mid = s.nextDouble();
		System.out.println("�⸻��� ������?");
		double last = s.nextDouble();
		System.out.println("����Ʈ ������?");
		double report = s.nextDouble();

		double avg = (mid + last + report) / 3;

		System.out.printf("%s���� ��� ������ : %10.2f �Դϴ�", name, avg);
	}

}
