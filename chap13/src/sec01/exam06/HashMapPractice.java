package sec01.exam06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.println("나라와 인구수를 입력해 주세요");
		
		
		for (int i = 0; i < 3; i++) {
			map.put(s.next(), s.nextInt());
		}

		while (true) {
			System.out.println("나라 이름을 입력해주세요");
			String country = s.next();
			if (country.equals("그만")) {
				System.out.println("검색을 종료합니다");
				break;
			}
			
			if(map.containsKey(country)) {
				System.out.println("해당 나라의 인구수는" + map.get(country));
			} else {
				System.out.println("해당 나라가 없어요.");
			}
		}

	}
}
