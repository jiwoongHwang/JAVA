package sec02;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = s.nextInt();

		char grade = (score >= 90) ? '��' : ((score >= 80) ? '��' : '��');
		System.out.println(grade);

	}

}
