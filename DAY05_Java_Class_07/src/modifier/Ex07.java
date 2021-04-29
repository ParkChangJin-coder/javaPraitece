package modifier;

class Person{
	static final String NATION = "KOREA"; 
	//불변의 정적 필드
	//메모리의 클래스 / 메소드 영역에 올라가므로 반드시 선언과 동시에 초기화 되어어야 한다.
	
	final String SSN; //final 필드명은 관례적으로 대문자
	//선언과 동시에 초기화를 하거나 혹은 생성자에서 단 한번만 초기화가 이루어진다.
	
	String name;
	int age;
	
	public Person(String name, String ssn, int age) {
		this.name = name;
		this.SSN = ssn;
		this.age = age;
		//매개 변수가 있는 생성자
		//this 는 객체 자기 자신의 주소(참조 변수와 동일)
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Person person = new Person("홍길등", "12345-56789", 20);
		System.out.println(person.NATION);
		System.out.println(person.name);
		System.out.println(person.SSN);
		System.out.println(person.age);
		System.out.println();
		
		//person.NATION = "USA"; 
		//person.SSN = "111111-2222222";
		//상기 코드는 값이 수정되지 않는다. final이란 그런 것....
		
		person.name = "이순신";
		person.age = 23;
		
		System.out.println(person.name);
		System.out.println(person.age);
		
		
		//결론 : static final : 정적 불변의 상수, 메모리 상단에 하나만 생성되고 공유됨
		// new연산자를 몇번 외치든 만들어진 인스턴스 만큼 생성이 된다.
		//보통 프로그래밍에서 상수라는 용어는 static final 이다.
		
	}

}
