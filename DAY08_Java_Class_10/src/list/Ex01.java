package list;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add(new String("홍길동"));
		//new연산자를 이용해서 넣는다. 원칙
		list.add("성춘향");
		list.add("이몽룡");
		
		int size = list.size();//저장되어 있는 전체 객체의 수를 리턴
		System.out.println("list size : " + size);
		System.out.println();
		
		for(String str1 : list) {
			System.out.println(str1);
			//향상된 for문
		}
		System.out.println();
		
		list.add(0,"이순신"); //index 0번에 끼워 넣는다
		list.add(2,"장보고"); //index 2번에 끼워 넣는다
		
		for(String str2 : list) {
			System.out.println(str2);
		}
		System.out.println();
		
		list.set(0, "세종대왕"); //인덱스 0번을 대체한다
		for(String str3 : list) {
			System.out.println(str3);
		}
		
		System.out.println();
		String str2 = list.get(2); //index 2번째 객체 리턴
		System.out.println(str2);
		
		list.remove(1);//index 1번의 객체를 삭제
		list.remove("이몽룡"); //이몽룡 객체를 삭제
		System.out.println();
		for(String str4 : list) {
			System.out.println(str4);
		}
		
		list.clear();//저장된 모든 객체를 삭제
		boolean bool = list.isEmpty();
		System.out.println();
		System.out.println(bool);
		
	}

}
