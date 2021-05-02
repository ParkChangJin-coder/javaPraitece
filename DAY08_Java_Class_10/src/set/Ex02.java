package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Ex02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("딸기");
		set.add("사과");
		set.add("오렌지");
		set.add("포도");
		
		int size = set.size();
		System.out.println(size);
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
