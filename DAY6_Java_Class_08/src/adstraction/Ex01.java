package adstraction;

abstract class Hybrid{ //추상클래스
	
	public int speed;
	public String color;
	void upSpeed(int speed) {
		this.speed = speed;
	}
	
	abstract void run();
	//추상 메소드, 실제 구현은 자식 클래스에서 한다.
	//만약, 클래스 내부에 추상메소드가 하나라도 있으면
	//그 클래스는 추상 클래스가 된다.
	//추상 클래스가 되면 객체를 직접 생성하지 못한다.
	//자식의 클래스로 객체를 만들던가
	//익명 중첩클래스로 객체를 만들어야 한다.
}

class Niro extends Hybrid{
	
	//자식클래스에서 부모의 추상 메소드는 강제 오버라이딩 되어야 한다.
	@Override
	void run() {
		System.out.println("니로가 " + this.speed + " 로 달립니다.");
	}
	
}

class Ioniq extends Hybrid {
	@Override
	void run() {
		System.out.println("아이오닉이 " + this.speed + " 로 달립니다.");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//Hybrid hybrid = new Hybrid(); //추상 클래스는 객체생성 불가
		Hybrid car = new Niro();
		System.out.println("니로 인스턴스(객체) 생성");
		car.upSpeed(30);
		car.run();
		
		System.out.println();

		car = new Ioniq();
		System.out.println("아이오닉 인스턴스 생성");
		car.upSpeed(50);
		car.run();
		
		//int a = 10;
		//int a = 20;
		// 과 동일하게 Hybird 를 먼저 만들었기 때문에
		//두번째 car 에서는 Hybrid 를 붙일 필요가 없다.
	}

}
