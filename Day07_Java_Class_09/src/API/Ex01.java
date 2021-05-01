package API;

import java.util.Objects;

//우리가 만든 클래스는
//String 클래스 같이 equals()메소드가 재정의 되어 있지 않다
//따라서 Object 클래스의 hashCode()메소드의 equals()메소드를
//오버라이딩 하여 재정의 해주어야 한다

class Person{
	private String name;
	private int age;
	private final String ssn;
	
	public Person(String name, int age, String ssn) {
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}
	
	//Object의 equals()메소드와 hashCode()메소드를
	//오버라이딩 해서 재정의 해주어야 한다
	//해주지 않으면 비교 = false
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person)obj;
			return (name.equals(person.name)) && (age == person.age) && (ssn.equals(person.ssn));
		}else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		//return Objects.hash(name, age, ssn);
		return (name + age + ssn).hashCode();
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age + "\n주민번호 : " + ssn;
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 20, "123456-789000");
		Person person2 = new Person("홍길동", 20, "123456-789000");
		
		System.out.println(person1 == person2);
		System.out.println(person1.equals(person2));
		
		System.out.println(person1.toString());
		System.out.println("person1.hashCode() : " + person1.hashCode());
		System.out.println("person2.hashCode() : " + person2.hashCode());
		
	}
}
