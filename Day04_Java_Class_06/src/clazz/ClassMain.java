package clazz;

class People{
	//클래스는 설계도
	//설계도 안에 구성 멤버는 
	//필드, 생성자, 메소드
	
	//필드(속성)
	//class에 선언된 변수를 필드라고 한다
	String name;
	int age;
	
	public People() {}//생성자
	
	public void walk() {} //메소드
	public void run() {} //메소드
}

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People object = new People();
		//클래스 변수 = new 생성자
		//생성자는 클래스 이름하고 똑같은 메소드이다.
		
		

	}

}
