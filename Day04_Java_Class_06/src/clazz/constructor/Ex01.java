package clazz.constructor;

class Car1{
	//필드 
	String company = "현대 자동차";
	String model;
	String color;
	int speed;
	
	//생성자
	
	//1. 기본생성자를 명시하지 않으면 컴파일러는 기본 생성자를 자동으로 만들어 준다.
	//2. 그러나 생성자를 명시해주면 만들지 않는다.
	//3. 변환 타입이 없다.
	//4. 생성자는 클래스 이름과 같은 이름을 써야 한다.
	
	public Car1() { //생성자
		System.out.println("Car1() 생성자를 생성했습니다.");
		System.out.println("생성자는 객체생성시 호출되어 초기화 역할!");
		model = "소나타";
		color = "검정";
		speed = 60;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 car = new Car1();//객체생성
		//객체를 생성하면 생성자가 호출되고 필드 초기화와 메소드 호출 등
		//객체를 사용할 준비를 한다.
		System.out.println("company : " + car.company);
		System.out.println("model : " + car.model);
		System.out.println("color : " + car.color);
		System.out.println("speed : " + car.speed);
		

	}

}
