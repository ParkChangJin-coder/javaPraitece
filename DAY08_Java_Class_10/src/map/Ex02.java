package map;

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("국어", 77);
		map.put("영어", 80);
		map.put("수학", 75);
		map.put("자바", 90);
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			int value = map.get(key);
			System.out.println("과목 : " + key);
			System.out.println("점수 : " + value);
		}
		System.out.println();
	}

}
