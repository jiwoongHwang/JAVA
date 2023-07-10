package sec01;

import java.util.Scanner;

public class IFElseIfElseExample2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("중간고사 성적은?");
		int mid = s.nextInt();
		System.out.println("기말고사 성적은?");
		int last = s.nextInt();
		int avg = (mid + last) / 2;
			
		if (avg >= 90 && mid >= 60 && last >=60) {
			System.out.println("A학점");
		} else if (avg >= 80 && mid >= 60 && last >=60) {
			System.out.println("B학점");
		} else if (avg < 80 && mid >= 60 && last >=60){
			System.out.println("C학점");
			} else {
				System.out.println("재수강"); 
		}
	}
}
