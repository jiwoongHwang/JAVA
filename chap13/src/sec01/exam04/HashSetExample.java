package sec01.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("e");
		set.add("d");
		set.add("c");
		set.add("b");	// 같은 데이터는 추가 안됨
		set.add("a");		
	
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println(element);
		}
		System.out.println();
		
		iter = set.iterator();
		for(String element : set) {
			System.out.println(element);
		}
		System.out.println();
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}

}
