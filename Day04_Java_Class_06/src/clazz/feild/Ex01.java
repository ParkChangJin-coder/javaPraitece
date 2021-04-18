package clazz.feild;

class Car{
	//클래스에 선언된 변수를 필드라고 한다.
	//클래스에 선언된 변수(필드) 와 메소드에 선언된 변수 와는 틀리다.
	String company = "현대 자동차";
	String model = "그랜져";
	String color = "검정";
	int maxSpeed = 350;
	int speed; //default : 0(자동으로 초기화 된다)
}

public class Ex01 {
	public static void main(String[] args) {
		Car myCar = new Car(); //객체 생성
		//객체 사용
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고 속력 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.speed);
		
	}

}
