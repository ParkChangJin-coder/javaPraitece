package inheritance;

class Suv{
	private String color;
	int speed = 100;
	
	public void run() {
		System.out.println("SUV 차량이 달립니다.");
	}
	//부모 클래스의 private 접근 제한을 갖는 
	//필드 및 메소드는 자식이 물려받을 수 없다.
	//부모와 자식 클래스가 서로 다른 패키지에 있다면
	//부모의 default 접근 제한을 갖는 필드 및 메소드도
	//자식이 물려 받을 수 없다.
	//그 외에 경우는 모두 상속의 대상이 된다.
}

class Santafe extends Suv{
	
	int speed = 120;
	
	@Override
	public void run() { //재정의 메소드이다
		System.out.println("싼타페 차량이 달립니다.");
	}
	
	public void carPrint() {
		super.run(); // 부모 메소드 호출
		System.out.println("SUV 속도 : " + super.speed); //부모 필드 speed
		
		this.run(); //자식 메소드 호출
		System.out.println("산타페 속도는 : " + this.speed); //자식 필드 speed
	}
	
	//부모 클래스 에서 상속 받은 멤버필드 이름과
	//자식 클래스 에서 만든 멤버 필드 이름이 같을 경우에는
	//부모 클래스에 멤버를 사용하기 위해서는 super. 키워드를 사용해야 한다.
	//자식 클래스는 this. 가 생략 되어 있어서 그냥 사용하면 자식 클래스에 멤버가 사용이 된다.
}

public class Ex03 {
	public static void main(String[] args) {
		Santafe santafe = new Santafe();
		santafe.carPrint();
	}
}
