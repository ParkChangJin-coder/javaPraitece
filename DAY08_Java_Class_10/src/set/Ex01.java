package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member{
	public String name;
	public int age;
	
	public Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	//Integer, String 등과 같이 JDK에서 제공해주는 객체가 아닌
	//직접 만드는 객체에서 equals 메소드를 오버라이딩 하지 않으면
	//그냥 == 연산자를 사용하는 것과 같은 뜻이 되어버린다
	//무조건 equals() hashCode() 오버라이딩 해서 재정의 할것
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return(member.name.equals(name) && (member.age == age));
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return(name + age).hashCode();
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
}


public class Ex01 {
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("성춘향", 22));
		set.add(new Member("이몽룡", 22));
		set.add(new Member("홍길동", 20));
		
		System.out.println("총 객체 수 : " + set.size());
		
		Iterator<Member> iter = set.iterator();
		
		while(iter.hasNext()) {
			Member member = iter.next();
			System.out.println(member.name + " : " + member.age);
			
		}
	}
}
