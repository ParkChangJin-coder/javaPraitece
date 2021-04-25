package poly;

//다형성 : 부모클래스 타입으로 자식객체를 얻는 것
//부모 클래스가 가지고 있는 모든 멤버들이 접근 할 수 있ㄷ.
//단, 자식클래스에서는 메서드 오버라이딩을 했다면 오버라이딩 된 
//자식의 메소드 멤버에 접근 된다.
//멤버 필드의 경우 부모 클래스의 멤버 필드에만 접근할 수 있다.
//자식 클래스의 멤버필드는 오버라이딩 된 자식 클래스의 메소드에 의해서만
//접근할 수 있다.

class A{
	int x = 100;
	public void xPrint() {
		System.out.println("xPrint() x : " + this.x);
	}
}

class B extends A {
	int x = 200;
	@Override
	public void xPrint() {
		System.out.println("xPrint() x : " + this.x);
	}
}

public class Ex01 {
	
	public static void main(String[] args) {
//		A poly = new B();
//		System.out.println("poly.x : " + poly.x);
//		//필드는 재정의(Override)할 수 없다.
//		poly.xPrint();
//		//자식 필드를 사용하고 싶으면 오버라이딩 메소드를 이용
//		
//		B poly2 = (B)poly; //다운캐스팅(강제 형 변환)
//		System.out.println("poly2.x : " + poly2.x);
//		
//		A poly3 = poly2; //업캐스팅
//		System.out.println("poly3.x : " + poly3.x);
//		
		A a = new A();
		B b = new B();
		
		A a1 = b;
		System.out.println(a1.x);
		
		//B b1 = (B)a;
		//System.out.println(b1.x);
		
		
	}

}
