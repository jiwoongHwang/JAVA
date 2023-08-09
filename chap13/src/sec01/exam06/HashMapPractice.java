package sec01.exam06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.println("����� �α����� �Է��� �ּ���");
		
		
		for (int i = 0; i < 3; i++) {
			map.put(s.next(), s.nextInt());
		}

		while (true) {
			System.out.println("���� �̸��� �Է����ּ���");
			String country = s.next();
			if (country.equals("�׸�")) {
				System.out.println("�˻��� �����մϴ�");
				break;
			}
			
			if(map.containsKey(country)) {
				System.out.println("�ش� ������ �α�����" + map.get(country));
			} else {
				System.out.println("�ش� ���� �����.");
			}
		}

	}
}
