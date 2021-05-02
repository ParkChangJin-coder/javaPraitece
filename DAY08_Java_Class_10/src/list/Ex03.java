package list;

import java.util.Iterator;
import java.util.LinkedList;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("망고");
		list.add("딸기");
		list.add("바나나");
		
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("--------------------");
		Iterator<String> iter = list.iterator();//반복자
		//컬렉션에 저장된 요소를 읽어오는 방법을 표준화한것
		//Iterator 객체는 컬렉션 객체의 Iterator 메소드를 호출하여
		//얻어올 수 있다.
		
		while(iter.hasNext()) { //요소 데이터가 있는지 확인 후 true false 반환
			String str = iter.next();
			System.out.println(str);
			iter.remove(); //컬렉션에 저장된 요소를 지운다
		}
		System.out.println();
		System.out.println(list.isEmpty());
		
		
		

	}

}
