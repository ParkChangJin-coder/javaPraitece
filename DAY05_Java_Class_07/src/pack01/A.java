package pack01;

//default class는 다른 패키지 에서는 접근할 수 없다.
class B{
	
	int x = 100;
	public B() {
		System.out.println("클래스 B의 생성자 입니다.");
		System.out.println("같은 패키지 안에서만 접근이 가능합니다.");
	}
	
	
}
//public class는 다른 패키지 에서도 접근이 가능하다.
public class A {
	
	public int x = 10;
	
	public A() {
		System.out.println("클래스 A의 생성자 입니다.");
		System.out.println("다른 패키지 에서도 접근 가능 합니다.");
	}

}
