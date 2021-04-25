package poly;

class A1{
	int x = 100;
	public void aaa() {
		System.out.println("부모 aaa 메소드 이다.");
	}
	public void bbb() {
		System.out.println("부모 bbb 메소드 이다.");
	}
}

class B1 extends A1{
	int x = 200;
	int y = 300;
	
	@Override
	public void bbb() {
		System.out.println("자식 bbb 오버라이드 메소드 입니다.");
		System.out.println("자식 x : " + this.x);
		System.out.println("자식 y : " + this.y);
	}
	
	public void ccc() {
		System.out.println("자식 ccc 메소드 입니다.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		A1 poly = new B1();
		//다형성은 부모 타입의 변수를 자식 객체로 생성하는 것
		//부모 위주이다.(부모 필드와 부모 메소드만 접근 가능하다)
		System.out.println(poly.x); //부모 필드로 접근
		//System.out.println(poly.y); //자식 멤버 필드 접근 안됨
		
		poly.aaa();
		poly.bbb();
		System.out.println();
		//자식 ccc()메소드 호출
		B1 poly2 = new B1();
		poly2.ccc();
		
	}

}
