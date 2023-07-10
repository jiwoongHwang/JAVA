package sec04;

import java.util.Scanner; 

public class practice1 {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String a = s.next();
		System.out.println("나이를 입력하세요");
		int b = s.nextInt();
		
		System.out.println("순번\t이름\t나이");
		System.out.printf("%-3d\t%s\t %3d" , 1 , a , b);
	}

}
