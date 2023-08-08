package sec01.exam02;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> list = new Vector<>();
		
		while(true) {
			System.out.println("숫자를 입력하세요 -1을 입력하면 중단합니다.");
			int num = s.nextInt();
			if(num==-1) break;
			list.add(num);
		}
		
		int max = list.get(0);
		for(int i=1; i<list.size(); i++) {
			if(max<list.get(i)) {
				max=list.get(i);
			}
		}
		System.out.println("가장 큰 수는 : " + max + "입니다.");
	}

}
