package sec01.exam06;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수 : " +map.size());
		
		System.out.println("홍길동 : " +map.get("홍길동"));
		System.out.println();
		
		
		
		
		
		Set<String> KeySet = map.keySet();
		
		Iterator<String> KeyIterator = KeySet.iterator();
		// 키 값 모두 가져오기(85,90,95)
		while(KeyIterator.hasNext()) {
			String Key = KeyIterator.next();
			// 반복해서 키 가져옴
			Integer value = map.get(Key);
			// 반복해서 값 가져옴
			System.out.println(Key + " : " +value);
		}
		System.out.println();
		
		
		
		
		map.remove("홍길동");
		System.out.println("총 개수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String Key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(Key + " : " +value);
		}
		
	}

}
