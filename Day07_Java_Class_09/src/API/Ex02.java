package API;

//Memeber 클래스를 만든다
//필드는 String name, int age, String number
//생성자를 통해 초기화를 한다
//equals()메소드와 hashCode()와 toString()을 오버라이딩한다

class Member{
	String name;
	int age;
	String number;
	
	public Member(String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			boolean bool = this.name.equals(member.name) && (this.age == member.age) && (this.number.equals(member.number));
			return bool;
			//return (name.equals(member.name) && (age == member.age) && (number.equals(member.number)));
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		//return Objects.hash(name, age, number);
		return (name + age + number).hashCode();
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age + "\n멤버번호 : " + number;
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Member member1 = new Member("홍길동", 20, "123123-234");
		Member member2 = new Member("홍길동", 20, "123123-234");
		
		System.out.println(member1.equals(member2));
		System.out.println(member1.toString());
		System.out.println(member2.toString());
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
	}
}
