package sec04;

import java.util.Scanner; 

public class practice1 {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���.");
		String a = s.next();
		System.out.println("���̸� �Է��ϼ���");
		int b = s.nextInt();
		
		System.out.println("����\t�̸�\t����");
		System.out.printf("%-3d\t%s\t %3d" , 1 , a , b);
	}

}