package sec01.exam02;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorExample2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> list = new Vector<>();
		
		while(true) {
			System.out.println("���ڸ� �Է��ϼ��� -1�� �Է��ϸ� �ߴ��մϴ�.");
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
		System.out.println("���� ū ���� : " + max + "�Դϴ�.");
	}

}
