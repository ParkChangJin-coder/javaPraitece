package inheritance;

class Person{
	String name;
	int age;
	
	Person(){
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		//toString()메소드는 해당 객체애 대한 정보를 문자열로 반환한다.
		String str = this.name + " : " + this.age;
		return str;
	}
	//모든 클래스의 조상 클래스는 Object 클래스이다.
	//Object 클래스의 상속을 명시하지 않아도
	//Object 클래스의 모든 멤버를 자유롭게 사용할 수 있다.
}

class Student extends Person{
	//자식 클래스를 구현
	String studentID;
	
	public Student(String name, int age, String studentID) {
		super(name, age);
		this.studentID = studentID;
	}
	
	@Override
	public String toString() {
		System.out.println("오버 라이딩 toString()");
		String str = name + " : " + age + " : " + studentID;
		return str;
	}
}

public class Ex05 {
	
	public static void main(String[] args) {
		//Person person = new Person("홍길동", 20);
		//String str = person.toString();
		//System.out.println(str);
		
		Student[] student = new Student[3]; //객체배열
		student[0] = new Student("홍길동", 20, "202101" );
		student[1] = new Student("이순신", 30, "202102" );
		student[2] = new Student("성춘향", 21, "202103" );
		
		for(Student stu : student) {
			System.out.println(stu.toString());
		}
		
	}
}
