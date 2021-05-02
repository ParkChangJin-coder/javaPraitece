package map;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		
	HashMap<Integer, String> map = new HashMap<>();
	//뉴 타입 파라메터 생략 가능
	
	map.put(new Integer(1), new String("홍길동"));
	map.put(2, "성춘향");
	map.put(3, "이몽룡");
	map.put(4, "이순신");
	map.put(1, "홍길순");
	
	System.out.println(map.size());
	
	System.out.println(map);
	System.out.println(map.get(1));
	System.out.println(map.get(5)); //null
	System.out.println();
	
	Set<Integer> keySet = map.keySet(); //keySet() 호출시 set타입으로 반환
	Iterator<Integer> keyIter = keySet.iterator();
	while(keyIter.hasNext()) {
		int key = keyIter.next();
		String value = map.get(key);
		System.out.println("key : " + key);
		System.out.println("Value : " + value);
	}
	System.out.println();
	
	map.remove(1);
	System.out.println(map);
	map.clear();
	if(map.isEmpty()) {
		System.out.println("Empty!");
	}
	}
}
