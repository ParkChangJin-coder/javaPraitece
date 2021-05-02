package list;

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		
		//List<String> list = new ArratList<>(); (OK)
		List<String> list = new ArrayList<String>();
		list.add("빡창");
		list.add("양아치");
		list.add("프리저");
		list.add("스님");
		list.add("부라더");
		
		for(String str1 : list) {
			System.out.println(str1);
		}
		System.out.println();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
	}

}
