package sec01;

import java.util.Scanner;

public class IFElseIfElseExample2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�߰���� ������?");
		int mid = s.nextInt();
		System.out.println("�⸻��� ������?");
		int last = s.nextInt();
		int avg = (mid + last) / 2;
			
		if (avg >= 90 && mid >= 60 && last >=60) {
			System.out.println("A����");
		} else if (avg >= 80 && mid >= 60 && last >=60) {
			System.out.println("B����");
		} else if (avg < 80 && mid >= 60 && last >=60){
			System.out.println("C����");
			} else {
				System.out.println("�����"); 
		}
	}
}
