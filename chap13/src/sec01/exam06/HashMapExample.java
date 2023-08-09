package sec01.exam06;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Entry �� : " +map.size());
		
		System.out.println("ȫ�浿 : " +map.get("ȫ�浿"));
		System.out.println();
		
		
		
		
		
		Set<String> KeySet = map.keySet();
		
		Iterator<String> KeyIterator = KeySet.iterator();
		// Ű �� ��� ��������(85,90,95)
		while(KeyIterator.hasNext()) {
			String Key = KeyIterator.next();
			// �ݺ��ؼ� Ű ������
			Integer value = map.get(Key);
			// �ݺ��ؼ� �� ������
			System.out.println(Key + " : " +value);
		}
		System.out.println();
		
		
		
		
		map.remove("ȫ�浿");
		System.out.println("�� ���� : " + map.size());
		
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
